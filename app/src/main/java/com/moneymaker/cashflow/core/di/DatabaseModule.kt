package com.moneymaker.cashflow.core.di

import android.content.Context
import androidx.room.Room
import com.moneymaker.cashflow.bussiness.data.source.localservice.dao.ExpenseDao
import com.moneymaker.cashflow.bussiness.data.source.localservice.dao.IncomeDao
import com.moneymaker.cashflow.bussiness.data.source.localservice.database.CashFlowDatabase
import com.moneymaker.cashflow.core.constants.ApplicationConstants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    fun provideAppDatabase(context: Context): CashFlowDatabase =
        Room.databaseBuilder(context, CashFlowDatabase::class.java, DATABASE_NAME).build()

    @Provides
    fun provideIncomeDao(cashFlowDatabase: CashFlowDatabase): IncomeDao = cashFlowDatabase.incomeDao()

    @Provides
    fun provideExpenseDao(cashFlowDatabase: CashFlowDatabase): ExpenseDao = cashFlowDatabase.expenseDao()
}