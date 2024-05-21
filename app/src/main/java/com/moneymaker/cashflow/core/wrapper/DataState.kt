package com.moneymaker.cashflow.core.wrapper

sealed class DataState<T : Any> {
    class LOADING<T : Any> : DataState<T>()
    class SUCCESS<T : Any>(val data: T) : DataState<T>()
    class ERROR<T : Any>(val title: String?, val message: String?) : DataState<T>()
}