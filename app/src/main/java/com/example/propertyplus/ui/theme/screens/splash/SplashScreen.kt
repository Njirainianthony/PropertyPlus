package com.example.propertyplus.ui.theme.screens.splash

import android.annotation.SuppressLint
import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.propertyplus.R
import com.example.propertyplus.navigation.ROUT_HOME
import com.example.propertyplus.ui.theme.Grey
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable

fun SplashScreen(navController: NavController){

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Grey),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //COROUTINE SCOPE  - FUNCTION IS TO MOVE AUTOMATICALY
        var coroutineScope= rememberCoroutineScope()
        coroutineScope.launch {
            delay(2000)
            navController.navigate(ROUT_HOME)
        }

        Image(
            painter = painterResource(id = R.drawable.homeicon),
            contentDescription ="home",
            modifier = Modifier
                .size(250.dp),
            contentScale = ContentScale.Crop

        )

    }


}




@Composable
@Preview(showBackground = true)
fun SplashScreenPreview(){
    SplashScreen(rememberNavController())


}