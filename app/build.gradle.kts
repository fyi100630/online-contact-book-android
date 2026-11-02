import java.util.Properties

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.compose")
    id("org.jetbrains.kotlin.plugin.serialization")
}

// 簽章：從環境變數（GitHub Actions secrets）或本機 keystore.properties 讀取。
// 兩者都沒有時，release 版不簽章（只能用來檢查能不能編譯）。
val signing = Properties().apply {
    val f = rootProject.file("keystore.properties")
    if (f.exists()) f.inputStream().use { load(it) }
    System.getenv("SIGNING_STORE_FILE")?.let { put("storeFile", it) }
    System.getenv("SIGNING_STORE_PASSWORD")?.let { put("storePassword", it) }
    System.getenv("SIGNING_KEY_ALIAS")?.let { put("keyAlias", it) }
    System.getenv("SIGNING_KEY_PASSWORD")?.let { put("keyPassword", it) }
}
val hasSigning = listOf("storeFile", "storePassword", "keyAlias", "keyPassword").all { !signing.getProperty(it).isNullOrBlank() }

android {
    namespace = "com.rhythmbyte.contactbook"
    compileSdk = 36

    defaultConfig {
        // 套件名稱和舊版一樣，用同一把金鑰簽章，舊使用者才能直接更新
        applicationId = "com.rhythmbyte.contactbook"
        minSdk = 26
        targetSdk = 36
        versionCode = 300
        versionName = "3.0.0"

        // 只有網址，沒有任何金鑰。所有資料都經過網站的 /api。
        buildConfigField("String", "BASE_URL", "\"https://online-contact-book.vercel.app\"")
        buildConfigField("String", "GITHUB_REPO", "\"fyi100630/online-contact-book-android\"")
    }

    signingConfigs {
        if (hasSigning) {
            create("release") {
                storeFile = file(signing.getProperty("storeFile"))
                storePassword = signing.getProperty("storePassword")
                keyAlias = signing.getProperty("keyAlias")
                keyPassword = signing.getProperty("keyPassword")
            }
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            if (hasSigning) signingConfig = signingConfigs.getByName("release")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
    testOptions {
        unitTests.isIncludeAndroidResources = true
        unitTests.all { test ->
            // 對本機網站跑 API 整合測試：CB_TEST_BASE=http://localhost:3100 ./gradlew testDebugUnitTest
            System.getenv("CB_TEST_BASE")?.let { test.systemProperty("cbTestBase", it) }
            // 產生截圖：CB_SCREENSHOTS=1 ./gradlew testDebugUnitTest，輸出到 app/build/screenshots/
            if (System.getenv("CB_SCREENSHOTS") == null) test.exclude("**/ScreenshotTest*")
            if (System.getenv("CB_SCREENSHOTS") != null) {
                test.systemProperty("roborazzi.test.record", "true")
                test.systemProperty("cbScreenshots", "true")
            }
            // 已經下載好 Robolectric 的 android-all jar 時（CI 或本機），不再連網下載
            System.getenv("ROBOLECTRIC_DEPS_DIR")?.let {
                test.systemProperty("robolectric.offline", "true")
                test.systemProperty("robolectric.dependency.dir", it)
            }
            test.testLogging { events("passed", "skipped", "failed") }
        }
    }
    packaging {
        resources.excludes += setOf("/META-INF/{AL2.0,LGPL2.1}", "/META-INF/versions/9/OSGI-INF/MANIFEST.MF")
    }
}

kotlin {
    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17)
    }
}

dependencies {
    val composeBom = platform("androidx.compose:compose-bom:2025.12.00")
    implementation(composeBom)
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.foundation:foundation")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.material:material-icons-core:1.7.8")
    implementation("androidx.compose.ui:ui-tooling-preview")
    debugImplementation("androidx.compose.ui:ui-tooling")

    implementation("androidx.core:core-ktx:1.17.0")
    implementation("androidx.activity:activity-compose:1.11.0")
    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.9.4")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.9.4")

    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.9.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.10.2")

    testImplementation("junit:junit:4.13.2")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.10.2")
    // 截圖測試（JVM 上用 Robolectric 畫出畫面，不需要模擬器）
    testImplementation("org.robolectric:robolectric:4.16")
    testImplementation("io.github.takahirom.roborazzi:roborazzi:1.52.0")
    testImplementation("io.github.takahirom.roborazzi:roborazzi-compose:1.52.0")
    testImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}
