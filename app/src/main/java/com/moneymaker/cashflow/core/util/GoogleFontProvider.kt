package com.moneymaker.cashflow.core.util

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import com.moneymaker.cashflow.R
import com.moneymaker.cashflow.presentation.ui.theme.Dimension

val fontProvider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

val Poppins = GoogleFont(name = "Poppins")
val Inter = GoogleFont(name = "Inter")

val PoppinsFontFamily = FontFamily(
    Font(googleFont = Poppins, fontProvider = fontProvider),
    Font(googleFont = Poppins, fontProvider = fontProvider, weight = FontWeight.Medium),
    Font(googleFont = Poppins, fontProvider = fontProvider, weight = FontWeight.Bold),
    Font(googleFont = Poppins, fontProvider = fontProvider, weight = FontWeight.W500),
    Font(googleFont = Poppins, fontProvider = fontProvider, weight = FontWeight.W600),

    )

val poppinsEighteenSp600 = TextStyle(
    fontFamily = PoppinsFontFamily,
    fontWeight = FontWeight.W600,
    fontSize = Dimension().eighteenSp,
    lineHeight = Dimension().twentyFourSp,
    letterSpacing = Dimension().pointFiveSp
)
val poppinsSixteenSp600 = TextStyle(
    fontFamily = PoppinsFontFamily,
    fontWeight = FontWeight.W600,
    fontSize = Dimension().sixteenSp,
    lineHeight = Dimension().twentyFourSp,
    letterSpacing = Dimension().pointFiveSp
)

val poppinsTwentyFourSp = TextStyle(
    fontFamily = PoppinsFontFamily,
    fontWeight = FontWeight.Normal,
    fontSize = Dimension().twentyFourSp,
    lineHeight = Dimension().twentyFourSp,
    letterSpacing = Dimension().pointFiveSp
)

val poppinsTwentyFourBoldSp = TextStyle(
    fontFamily = PoppinsFontFamily,
    fontWeight = FontWeight.Bold,
    fontSize = Dimension().twentyFourSp,
    lineHeight = Dimension().twentyFourSp,
    letterSpacing = Dimension().pointFiveSp
)

val poppinsFourteenSp500 = TextStyle(
    fontFamily = PoppinsFontFamily,
    fontSize = Dimension().fourteenSp,
    letterSpacing = Dimension().pointFiveSp,
    lineHeight = Dimension().sixteenSp,
    fontWeight = FontWeight.Normal
)

val poppinsTwelveItalicSp500 = TextStyle(
    fontFamily = PoppinsFontFamily,
    fontSize = Dimension().twelveSp,
    letterSpacing = Dimension().pointFiveSp,
    lineHeight = Dimension().sixteenSp,
    fontWeight = FontWeight.Normal,
    fontStyle = FontStyle.Italic
)