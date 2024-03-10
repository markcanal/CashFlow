package com.moneymaker.cashflow.bussiness.data.local.dao.user

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.moneymaker.cashflow.bussiness.data.local.dao.entity.User
import com.moneymaker.cashflow.core.constants.UserConstants.TABLE_NAME

@Dao
interface UserDao {
    @Query("SELECT * FROM $TABLE_NAME")
    fun selectUser(): User

    @Insert
    fun saveUserLogin(vararg user: User)

    @Delete
    fun logOut(user: User)
}