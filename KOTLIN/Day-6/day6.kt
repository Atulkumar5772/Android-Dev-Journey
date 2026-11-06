package com.example.appdevelopment.kotlin

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun Day6() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(text ="Text1",
            fontSize = 40.sp,
            modifier = Modifier.align(Alignment.TopStart))

        Text(text ="Text2",
            fontSize = 40.sp,
            modifier = Modifier.align(Alignment.CenterStart))

        Text(text ="Text3",
            fontSize = 40.sp,
            modifier = Modifier.align(Alignment.Center))

    }
}