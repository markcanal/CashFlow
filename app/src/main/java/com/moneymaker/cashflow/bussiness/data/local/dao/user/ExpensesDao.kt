package com.moneymaker.cashflow.bussiness.data.local.dao.user

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import com.moneymaker.cashflow.bussiness.data.local.dao.entities.Expenses
import com.moneymaker.cashflow.core.constants.ExpensesConstant.EXPENSE_AMOUNT
import com.moneymaker.cashflow.core.constants.ExpensesConstant.EXPENSE_DATE
import com.moneymaker.cashflow.core.constants.ExpensesConstant.EXPENSE_DESCRIPTION
import com.moneymaker.cashflow.core.constants.ExpensesConstant.EXPENSE_TRANS_ID
import com.moneymaker.cashflow.core.constants.ExpensesConstant.TABLE_NAME

@Dao
interface ExpensesDao {
    @Query("SELECT * FROM $TABLE_NAME;")
    suspend fun selectExpenses(): List<Expenses>

    @Query("SELECT * FROM $TABLE_NAME where $EXPENSE_DATE =:date;")
    suspend fun selectExpenseWithByDate(date: String): List<Expenses>

    @Query("UPDATE $TABLE_NAME set $EXPENSE_AMOUNT=:amount ,$EXPENSE_DESCRIPTION =:description,$EXPENSE_DATE=:date where $EXPENSE_TRANS_ID=:transId")
    suspend fun updateExpenseTransactionById(amount: Double, description: String, date: String, transId: Int): Int

    @Delete
    suspend fun delete(expenses: Expenses)
}