package com.moneymaker.cashflow.bussiness.data.local.dao.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.moneymaker.cashflow.core.constants.IncomeConstants.INCOME_AMOUNT
import com.moneymaker.cashflow.core.constants.IncomeConstants.INCOME_DATE
import com.moneymaker.cashflow.core.constants.IncomeConstants.INCOME_DESCRIPTION

@Entity
data class Income(
    @PrimaryKey(autoGenerate = true) val uid: Int,
    @ColumnInfo(INCOME_AMOUNT) val amount: Double,
    @ColumnInfo(INCOME_DATE) val date: String,
    @ColumnInfo(INCOME_DESCRIPTION) val description: String
)
