package com.example.appdevelopment.kotlin

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun Day3(){
    var name by remember { mutableStateOf(value="Atul") }
    OutlinedTextField(
        value=name,
        onValueChange = {name= it },
        label={ Text(text="Enter Your Name") },
        leadingIcon = {Text(text="*")},
        trailingIcon = {Text(text="#")},
        singleLine = true,
        shape = RoundedCornerShape(size=40.dp),

        )
}
