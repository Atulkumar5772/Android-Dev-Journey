package com.example.appdevelopment.kotlin

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appdevelopment.R

@Preview(showBackground = true)
@Composable
fun Day8() {
    Image(
        painter = painterResource(R.drawable.logo),
        contentDescription = "LOGO",
        modifier = Modifier.padding(20.dp,50.dp)
            .size(300.dp)
            .clip(shape = RoundedCornerShape(30.dp)),
        contentScale = ContentScale.FillBounds
    )
}