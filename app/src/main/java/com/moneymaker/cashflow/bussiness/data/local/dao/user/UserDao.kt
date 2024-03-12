package com.moneymaker.cashflow.bussiness.data.local.dao.user

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.moneymaker.cashflow.bussiness.data.local.dao.entities.User
import com.moneymaker.cashflow.core.constants.UserConstants.TABLE_NAME

@Dao
interface UserDao {
    @Query("SELECT * FROM $TABLE_NAME LIMIT 1")
    suspend fun selectUser(): User?

    @Insert
    suspend fun saveUserLogin(user: User)

    @Delete
    suspend fun logOut(user: User)
}