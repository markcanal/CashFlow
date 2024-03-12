package com.moneymaker.cashflow.bussiness.domain.repositories

import com.moneymaker.cashflow.bussiness.data.local.dao.entities.Expenses

interface ExpenseRepository {
    suspend fun showExpenses(): List<Expenses>
    suspend fun selectExpenseWithByDate(date: String): List<Expenses>
    suspend fun deleteExpense(expenses: Expenses)
}