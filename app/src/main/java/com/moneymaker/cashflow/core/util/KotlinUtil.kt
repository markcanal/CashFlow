package com.moneymaker.cashflow.core.util

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import timber.log.Timber

inline fun <T> Flow<T>.observe(
    scope: CoroutineScope,
    crossinline action: suspend (T) -> Unit
): Job {
    return scope.launch(CoroutineHandler) {
        collect { action(it) }
    }
}

suspend inline fun <T> runOnIoThread(crossinline block: suspend () -> T): T {
    Timber.tag("KotlinUtil").d("Running on IO thread")
    return withContext(Dispatchers.IO) { block() }
}

suspend inline fun <T> runOnUiThread(crossinline block: suspend () -> T): T {
    Timber.tag("KotlinUtil").d("Running on UI thread")
    return withContext(Dispatchers.Main.immediate) { block() }
}