package com.example.pokemonapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.fyp.pokedex.R


val bold = FontFamily(
    Font(R.font.roboto_bold)
)

val Typography = Typography(
    body1 = TextStyle(
        fontFamily = bold,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)
