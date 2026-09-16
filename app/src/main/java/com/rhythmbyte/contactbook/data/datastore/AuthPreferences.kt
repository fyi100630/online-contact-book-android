package com.rhythmbyte.contactbook.data.datastore

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.rhythmbyte.contactbook.data.model.UserRole
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

import kotlinx.coroutines.flow.first
import java.util.UUID

val Context.userDataStore: DataStore<Preferences> by preferencesDataStore(name = "user_settings")

class AuthPreferences(private val context: Context) {

    companion object {
        val KEY_USER_ROLE = stringPreferencesKey("saved_user_role")
        val KEY_INSTALL_ID = stringPreferencesKey("app_install_id")
    }

    val userRoleFlow: Flow<UserRole> = context.userDataStore.data.map { preferences ->
        val roleString = preferences[KEY_USER_ROLE] ?: UserRole.VISITOR.name
        try {
            UserRole.valueOf(roleString)
        } catch (e: Exception) {
            UserRole.VISITOR
        }
    }

    suspend fun saveUserRole(role: UserRole) {
        context.userDataStore.edit { preferences ->
            preferences[KEY_USER_ROLE] = role.name
        }
    }

    suspend fun clearUserRole() {
        context.userDataStore.edit { preferences ->
            preferences[KEY_USER_ROLE] = UserRole.VISITOR.name
        }
    }

    suspend fun getOrCreateInstallId(): String {
        val preferences = context.userDataStore.data.first()
        val existingId = preferences[KEY_INSTALL_ID]
        if (!existingId.isNullOrEmpty()) {
            return existingId
        }
        val newId = UUID.randomUUID().toString()
        context.userDataStore.edit { prefs ->
            prefs[KEY_INSTALL_ID] = newId
        }
        return newId
    }
}
