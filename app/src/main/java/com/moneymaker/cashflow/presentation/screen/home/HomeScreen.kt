package com.moneymaker.cashflow.presentation.screen.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.moneymaker.cashflow.presentation.ui.theme.CashFlowTheme

@Composable
fun HomeScreen() {
    CashFlowTheme {
        Scaffold { paddingValues ->
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(paddingValues)) {
                Text(text = "HOME SCREEN")
            }
        }
    }
}

@Composable
@Preview
fun ShowScreen(){
    HomeScreen()
}