package com.moneymaker.cashflow.bussiness.data.repository

import com.moneymaker.cashflow.bussiness.data.local.dao.database.AppDatabase
import com.moneymaker.cashflow.bussiness.data.local.dao.entities.Expenses
import com.moneymaker.cashflow.bussiness.domain.repositories.ExpenseRepository
import javax.inject.Inject

class ExpenseRepositoryImp @Inject constructor(private val db: AppDatabase) : ExpenseRepository {
    override suspend fun showExpenses(): List<Expenses> {
        return db.expenseDao().selectExpenses()
    }

    override suspend fun selectExpenseWithByDate(date: String): List<Expenses> {
        return db.expenseDao().selectExpenseWithByDate(date)
    }

    override suspend fun deleteExpense(expenses: Expenses) {
        db.expenseDao().delete(expenses)
    }
}