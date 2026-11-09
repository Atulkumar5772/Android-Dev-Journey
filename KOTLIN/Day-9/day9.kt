package com.example.appdevelopment.kotlin
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CarCrash
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable

fun Day9() {

    Column(
        modifier=Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Icon(
            imageVector = Icons.Default.Person,
            contentDescription = "Person",
            modifier = Modifier.size(100.dp),
            tint = Color.Blue
        )
        Icon(
            imageVector = Icons.Default.CarCrash,
            contentDescription = "Laptop",
            modifier = Modifier.size(100.dp),
            tint=Color.Red
        )
    }
}