package com.moneymaker.cashflow.bussiness.data.local.dao.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.moneymaker.cashflow.core.constants.UserConstants.USER_EMAIL
import com.moneymaker.cashflow.core.constants.UserConstants.USER_FIRST_NAME
import com.moneymaker.cashflow.core.constants.UserConstants.USER_LAST_NAME

@Entity
data class User(
    @PrimaryKey val uid: Int,
    @ColumnInfo(USER_FIRST_NAME) val firstName: String,
    @ColumnInfo(USER_LAST_NAME) val lastName: String,
    @ColumnInfo(USER_EMAIL) val userEmail: String
)
