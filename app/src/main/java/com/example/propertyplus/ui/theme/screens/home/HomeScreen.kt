package com.example.propertyplus.ui.theme.screens.home


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.propertyplus.ui.theme.Lavender



@Composable
fun HomeScreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize().background(Lavender),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

        ) {

        Text(
            text = "Property Plus",
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.White

            )

        Text(
            text ="Your better choice",
            fontSize = 30.sp,

        )

    }


}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())

}

