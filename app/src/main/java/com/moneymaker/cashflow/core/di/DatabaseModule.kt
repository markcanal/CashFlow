package com.moneymaker.cashflow.core.di

import android.content.Context
import androidx.room.Room
import com.moneymaker.cashflow.bussiness.data.local.dao.database.AppDatabase
import com.moneymaker.cashflow.bussiness.data.local.dao.user.ExpensesDao
import com.moneymaker.cashflow.bussiness.data.local.dao.user.IncomeDao
import com.moneymaker.cashflow.bussiness.data.local.dao.user.UserDao
import com.moneymaker.cashflow.core.constants.ApplicationConstants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME).build()
    }

    @Provides
    fun provideUserDao(appDatabase: AppDatabase): UserDao = appDatabase.userDao()

    @Provides
    fun provideExpenseDao(appDatabase: AppDatabase): ExpensesDao = appDatabase.expenseDao()

    @Provides
    fun provideIncomeDao(appDatabase: AppDatabase): IncomeDao = appDatabase.incomeDao()
}