package com.moneymaker.cashflow.bussiness.data.local.dao.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.moneymaker.cashflow.core.constants.UserConstants.TABLE_NAME
import com.moneymaker.cashflow.core.constants.UserConstants.USER_EMAIL
import com.moneymaker.cashflow.core.constants.UserConstants.USER_FIRST_NAME
import com.moneymaker.cashflow.core.constants.UserConstants.USER_LAST_NAME
import com.moneymaker.cashflow.core.constants.UserConstants.UUID

@Entity(tableName = TABLE_NAME)
data class User(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = UUID) val uid: Int,
    @ColumnInfo(name = USER_FIRST_NAME) val firstName: String,
    @ColumnInfo(name = USER_LAST_NAME) val lastName: String,
    @ColumnInfo(name = USER_EMAIL) val userEmail: String
)
