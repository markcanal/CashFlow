package com.moneymaker.cashflow.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.moneymaker.cashflow.core.application.Destination
import com.moneymaker.cashflow.presentation.screen.home.HomeScreen
import com.moneymaker.cashflow.presentation.screen.splashscreen.SplashScreen
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlin.time.Duration.Companion.seconds

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navController = rememberNavController()
            var splashTime by remember { mutableIntStateOf(0) }
            LaunchedEffect(key1 = splashTime) {
                while (splashTime <= 5) {
                    delay(1.seconds)
                    splashTime++
                }
            }
            NavHost(
                navController = navController, startDestination = if (splashTime <= 5) {
                    Destination.Splash.route
                } else {
                    Destination.Home.route
                }
            ) {
                composable(Destination.Splash.route) {
                    SplashScreen()
                }
                composable(Destination.Home.route) {
                    HomeScreen()
                }
            }
        }
    }
}
