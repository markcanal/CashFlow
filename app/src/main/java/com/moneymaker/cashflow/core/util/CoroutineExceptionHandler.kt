package com.moneymaker.cashflow.core.util

import kotlinx.coroutines.CoroutineExceptionHandler
import timber.log.Timber
import kotlin.coroutines.CoroutineContext

object CoroutineHandler : CoroutineExceptionHandler {
    override val key: CoroutineContext.Key<CoroutineExceptionHandler> = CoroutineExceptionHandler.Key

    override fun handleException(context: CoroutineContext, exception: Throwable) {
        Timber.d(exception)
    }
}