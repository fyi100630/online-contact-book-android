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

val Context.userDataStore: DataStore<Preferences> by preferencesDataStore(name = "user_settings")

class AuthPreferences(private val context: Context) {

    companion object {
        val KEY_USER_ROLE = stringPreferencesKey("saved_user_role")
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
}
