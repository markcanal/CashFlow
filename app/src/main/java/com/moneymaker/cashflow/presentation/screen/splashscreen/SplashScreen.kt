package com.moneymaker.cashflow.presentation.screen.splashscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.moneymaker.cashflow.R
import com.moneymaker.cashflow.core.util.poppinsTwelveItalicSp500
import com.moneymaker.cashflow.core.util.poppinsTwentyFourBoldSp
import com.moneymaker.cashflow.core.util.poppinsTwentyFourSp
import com.moneymaker.cashflow.presentation.ui.theme.CashFlowTheme

@Composable
fun SplashScreen() {
    CashFlowTheme {
        Surface {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "CashFlow Logo",
                    colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.surfaceTint)
                )
                Text(text = "Cash Flow", style = poppinsTwentyFourBoldSp)
                Text(text = "Your cash flow monitoring app.", style = poppinsTwelveItalicSp500)
            }
        }
    }
}

@Preview
@Composable
fun PreviewSplashScreen() {
    CashFlowTheme {
        SplashScreen()
    }
}