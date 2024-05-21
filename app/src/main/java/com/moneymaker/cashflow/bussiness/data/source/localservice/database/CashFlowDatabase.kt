package com.moneymaker.cashflow.bussiness.data.source.localservice.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.moneymaker.cashflow.bussiness.data.source.localservice.dao.ExpenseDao
import com.moneymaker.cashflow.bussiness.data.source.localservice.dao.IncomeDao
import com.moneymaker.cashflow.bussiness.data.source.localservice.entities.ExpensesEntity
import com.moneymaker.cashflow.bussiness.data.source.localservice.entities.IncomeEntity

@Database(entities = [IncomeEntity::class, ExpensesEntity::class], version = 1, exportSchema = false)
abstract class CashFlowDatabase : RoomDatabase() {
    abstract fun incomeDao(): IncomeDao
    abstract fun expenseDao(): ExpenseDao
}