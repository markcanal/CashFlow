package com.moneymaker.cashflow.core.di

import com.moneymaker.cashflow.bussiness.data.local.dao.database.AppDatabase
import com.moneymaker.cashflow.bussiness.data.repository.ExpenseRepositoryImp
import com.moneymaker.cashflow.bussiness.data.repository.IncomeRepositoryImpl
import com.moneymaker.cashflow.bussiness.data.repository.UserRepositoryImpl
import com.moneymaker.cashflow.bussiness.data.usecase.expenses.DeleteExpensesUseCaseImpl
import com.moneymaker.cashflow.bussiness.data.usecase.expenses.SelectExpensesByDateUseCaseImpl
import com.moneymaker.cashflow.bussiness.data.usecase.expenses.ShowExpensesUseCaseImpl
import com.moneymaker.cashflow.bussiness.data.usecase.income.GetIncomeUseCaseImpl
import com.moneymaker.cashflow.bussiness.data.usecase.income.NewIncomeUseCaseImp
import com.moneymaker.cashflow.bussiness.data.usecase.income.UpdateAmountUseCaseImpl
import com.moneymaker.cashflow.bussiness.domain.repositories.ExpenseRepository
import com.moneymaker.cashflow.bussiness.domain.repositories.IncomeRepository
import com.moneymaker.cashflow.bussiness.domain.repositories.UserRepository
import com.moneymaker.cashflow.bussiness.domain.usecase.expenses.DeleteExpenseUseCase
import com.moneymaker.cashflow.bussiness.domain.usecase.expenses.SelectExpenseByDateUseCase
import com.moneymaker.cashflow.bussiness.domain.usecase.expenses.ShowExpensesUseCase
import com.moneymaker.cashflow.bussiness.domain.usecase.income.GetIncomeUseCase
import com.moneymaker.cashflow.bussiness.domain.usecase.income.NewIncomeUseCase
import com.moneymaker.cashflow.bussiness.domain.usecase.income.UpdateAMountUseCase
import com.moneymaker.cashflow.core.application.CoroutineScopeProvider
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

    @Provides
    fun provideShowExpenseUseCase(
        coroutineScopeProvider: CoroutineScopeProvider,
        expenseRepository: ExpenseRepository
    ): ShowExpensesUseCase = ShowExpensesUseCaseImpl(coroutineScopeProvider, expenseRepository)

    @Provides
    fun provideSelectExpenseByDateUseCase(
        coroutineScopeProvider: CoroutineScopeProvider,
        expenseRepository: ExpenseRepository
    ): SelectExpenseByDateUseCase = SelectExpensesByDateUseCaseImpl(coroutineScopeProvider, expenseRepository)

    @Provides
    fun provideDeleteExpenseByDateUseCase(
        coroutineScopeProvider: CoroutineScopeProvider,
        expenseRepository: ExpenseRepository
    ): DeleteExpenseUseCase = DeleteExpensesUseCaseImpl(coroutineScopeProvider, expenseRepository)

    @Provides
    fun provideGetIncomeUseCase(
        coroutineScopeProvider: CoroutineScopeProvider,
        incomeRepository: IncomeRepository
    ): GetIncomeUseCase = GetIncomeUseCaseImpl(coroutineScopeProvider, incomeRepository)

    @Provides
    fun provideNewIncomeUseCase(
        coroutineScopeProvider: CoroutineScopeProvider,
        incomeRepository: IncomeRepository
    ): NewIncomeUseCase = NewIncomeUseCaseImp(coroutineScopeProvider, incomeRepository)

    @Provides
    fun provideUpdateIncomeUseCase(
        coroutineScopeProvider: CoroutineScopeProvider,
        incomeRepository: IncomeRepository
    ): UpdateAMountUseCase = UpdateAmountUseCaseImpl(coroutineScopeProvider, incomeRepository)

}