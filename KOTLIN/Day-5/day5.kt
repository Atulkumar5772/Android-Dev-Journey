package com.example.appdevelopment.kotlin

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun Day5() {
    Column(horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center)
    {
        Text(text="Login yourself")

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = {Text(text = "Enter Name")}
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = {Text(text = "Enter Email")}
        )

    }
}