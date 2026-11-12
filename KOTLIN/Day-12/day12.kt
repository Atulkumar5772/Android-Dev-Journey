package com.example.appdevelopment.kotlin
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Day12() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
//TEXT BUTTON
        TextButton(
            onClick = {}
        ) {
            Text(text = "Forget Password")
        }
        Spacer(modifier = Modifier.height(40.dp))
        //Option 2
        Text(text = "Forget Password",
            modifier = Modifier.clickable(onClick = {}))
        Spacer(modifier = Modifier.height(40.dp))
//ICON BUTTON
        IconButton(
            onClick = {}
        ) {
            Icon(imageVector = Icons.Default.Home, contentDescription = "")
        }
        Spacer(modifier = Modifier.height(40.dp))
        //Option 2
        Icon(imageVector = Icons.Default.Home, contentDescription = "",
            modifier = Modifier.clickable
                (onClick = {})
        )
    } }