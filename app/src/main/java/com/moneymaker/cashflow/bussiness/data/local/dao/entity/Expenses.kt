package com.moneymaker.cashflow.bussiness.data.local.dao.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.moneymaker.cashflow.core.constants.ExpensesConstant.EXPENSE_AMOUNT
import com.moneymaker.cashflow.core.constants.ExpensesConstant.EXPENSE_DATE
import com.moneymaker.cashflow.core.constants.ExpensesConstant.EXPENSE_DESCRIPTION

@Entity
data class Expenses(
    @PrimaryKey(autoGenerate = true) val transId: Int,
    @ColumnInfo(EXPENSE_AMOUNT) val amount: Double,
    @ColumnInfo(EXPENSE_DESCRIPTION) val description: String,
    @ColumnInfo(EXPENSE_DATE) val date: String
)
