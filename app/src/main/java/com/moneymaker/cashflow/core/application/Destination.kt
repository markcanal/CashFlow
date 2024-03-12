package com.moneymaker.cashflow.core.application

sealed class Destination(val route: String) {
    data object Home : Destination("home")
    data object Splash : Destination("splash")
}