package com.example.appdevelopment.kotlin

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
 fun Day4() {
    Row(
        modifier= Modifier.fillMaxHeight(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment=Alignment.Top
    )
    {
        Text(text="Atul", fontSize = 10.sp)
        Text(text="Kumar", fontSize = 10.sp)
    }
}