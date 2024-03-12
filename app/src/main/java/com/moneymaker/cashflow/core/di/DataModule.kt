package com.moneymaker.cashflow.core.di

import com.moneymaker.cashflow.bussiness.data.local.dao.database.AppDatabase
import com.moneymaker.cashflow.bussiness.data.repository.ExpenseRepositoryImp
import com.moneymaker.cashflow.bussiness.data.repository.IncomeRepositoryImpl
import com.moneymaker.cashflow.bussiness.data.repository.UserRepositoryImpl
import com.moneymaker.cashflow.bussiness.domain.repositories.ExpenseRepository
import com.moneymaker.cashflow.bussiness.domain.repositories.IncomeRepository
import com.moneymaker.cashflow.bussiness.domain.repositories.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DataModule {
    @Provides
    fun provideExpensesRepository(appDatabase: AppDatabase): ExpenseRepository = ExpenseRepositoryImp(appDatabase)

    @Provides
    fun provideIncomeRepository(appDatabase: AppDatabase): IncomeRepository = IncomeRepositoryImpl(appDatabase)

    @Provides
    fun provideUserRepository(appDatabase: AppDatabase): UserRepository = UserRepositoryImpl(appDatabase)

}