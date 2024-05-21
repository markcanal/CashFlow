package com.moneymaker.cashflow.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.moneymaker.cashflow.bussiness.data.source.localservice.entities.ExpensesEntity
import com.moneymaker.cashflow.bussiness.data.source.repository.ExpenseRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ExpenseViewModel @Inject constructor(
    private val expenseRepository: ExpenseRepository,
) : ViewModel() {
    val expenseList = expenseRepository.expense
    fun addNewExpense(description: String, amount: Double) {
        viewModelScope.launch {
            val newExpense = ExpensesEntity(0, amount, description, "05/05/2024", 1)
            expenseRepository.addNewExpense(newExpense)
        }
    }

    fun updateExpense(description: String, amount: Double) {
        viewModelScope.launch {
            val newExpense = ExpensesEntity(5, 0.0, "Sample Update", "05/06/2024", 3)
            expenseRepository.addNewExpense(newExpense)
        }
    }

    fun deleteExpense(description: String, amount: Double) {
        viewModelScope.launch {
            val expenses = ExpensesEntity(22, 0.0, "Sample", "05/05/2024", 1)
            expenseRepository.deleteExpense(expenses)
        }
    }
}