package com.example.appdevelopment.kotlin

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.appdevelopment.ui.theme.AppDevelopmentTheme

@Preview(showBackground = true)
@Composable
fun Day1() {
    AppDevelopmentTheme {
        Text(
            text = "Atul",
            color=Color.Blue,
            fontSize = 10.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Serif,
            letterSpacing = 2.sp,
            textAlign = TextAlign.Center
        )
    }
}