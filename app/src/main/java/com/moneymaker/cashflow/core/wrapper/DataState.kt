package com.moneymaker.cashflow.core.wrapper

sealed class DataState<out T> {
    data object LOADING : DataState<Nothing>()
    class SUCCESS<T : Any>(val data: T) : DataState<T>()
    class ERROR<T : Any>(val title: String?, val message: String?) : DataState<T>()
}