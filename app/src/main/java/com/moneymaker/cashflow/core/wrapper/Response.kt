package com.moneymaker.cashflow.core.wrapper

sealed class Response<T : Any> {
    class SUCCESS<T : Any>(val data: T) : Response<T>()
    class ERROR<T : Any>(val error: String?, val description: String?) : Response<T>()
    class EXCEPTION<T : Any>(val e: Throwable) : Response<T>()
}