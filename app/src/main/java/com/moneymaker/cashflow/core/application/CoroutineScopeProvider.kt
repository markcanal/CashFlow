package com.moneymaker.cashflow.core.application

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CoroutineScopeProvider @Inject constructor() {
    fun ioScope(): CoroutineScope = CoroutineScope(Dispatchers.IO)
    fun mainScope(): CoroutineScope = CoroutineScope(Dispatchers.Main)
    fun defaultScope(): CoroutineScope = CoroutineScope(Dispatchers.Default)
}