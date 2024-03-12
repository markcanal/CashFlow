package com.moneymaker.cashflow.bussiness.data.local.dao.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.moneymaker.cashflow.bussiness.data.local.dao.entities.Expenses
import com.moneymaker.cashflow.bussiness.data.local.dao.entities.Income
import com.moneymaker.cashflow.bussiness.data.local.dao.entities.User
import com.moneymaker.cashflow.bussiness.data.local.dao.user.ExpensesDao
import com.moneymaker.cashflow.bussiness.data.local.dao.user.IncomeDao
import com.moneymaker.cashflow.bussiness.data.local.dao.user.UserDao

@Database(entities = [User::class, Income::class, Expenses::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun incomeDao(): IncomeDao
    abstract fun expenseDao(): ExpensesDao
}