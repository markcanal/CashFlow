package com.moneymaker.cashflow.bussiness.data.local.dao.user

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import com.moneymaker.cashflow.bussiness.data.local.dao.entity.Expenses
import com.moneymaker.cashflow.core.constants.ExpensesConstant.EXPENSE_DATE
import com.moneymaker.cashflow.core.constants.ExpensesConstant.TABLE_NAME

@Dao
interface ExpensesDao {
    @Query("SELECT * FROM $TABLE_NAME;")
    fun selectExpenses(): List<Expenses>

    @Query("SELECT * FROM $TABLE_NAME where $EXPENSE_DATE =:date;")
    fun selectExpenseWithByDate(date: String)

    @Delete
    fun delete(expenses: Expenses)
}