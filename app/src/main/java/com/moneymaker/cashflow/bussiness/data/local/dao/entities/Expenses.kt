package com.moneymaker.cashflow.bussiness.data.local.dao.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.moneymaker.cashflow.core.constants.ExpensesConstant.EXPENSE_AMOUNT
import com.moneymaker.cashflow.core.constants.ExpensesConstant.EXPENSE_DATE
import com.moneymaker.cashflow.core.constants.ExpensesConstant.EXPENSE_DESCRIPTION
import com.moneymaker.cashflow.core.constants.ExpensesConstant.EXPENSE_TRANS_ID
import com.moneymaker.cashflow.core.constants.ExpensesConstant.TABLE_NAME

@Entity(tableName = TABLE_NAME)
data class Expenses(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = EXPENSE_TRANS_ID) val transId: Int,
    @ColumnInfo(name = EXPENSE_AMOUNT) val amount: Double,
    @ColumnInfo(name = EXPENSE_DESCRIPTION) val description: String,
    @ColumnInfo(name = EXPENSE_DATE) val date: String
)
