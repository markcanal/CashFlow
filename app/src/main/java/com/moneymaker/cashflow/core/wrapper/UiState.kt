package com.moneymaker.cashflow.core.wrapper

sealed class UiState<out T> {
    data object INITIAL : UiState<Nothing>()
    class SUCCESS<out T>(data: T) : UiState<T>()
    class ERROR<out T>(title: String?, message: String?) : UiState<T>()
}