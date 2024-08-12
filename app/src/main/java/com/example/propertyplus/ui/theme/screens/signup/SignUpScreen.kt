package com.example.propertyplus.ui.theme.screens.signup

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.propertyplus.R
import com.example.propertyplus.navigation.ROUT_DETAIL
import com.example.propertyplus.navigation.ROUT_HOME
import com.example.propertyplus.ui.theme.Blue

@Composable

fun SignUpScreen(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
        ) {

        Spacer(modifier = Modifier.height(20.dp))


        Image(
            painter = painterResource(id = R.drawable.propertyicon),
            contentDescription ="home",
            modifier = Modifier
                .size(180.dp),
            contentScale = ContentScale.Crop

        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Sign Up",
            fontSize = 30.sp,
            fontFamily = FontFamily.Serif,
            color = Color.Black

        )

        var name by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confpassword by remember { mutableStateOf("") }



        Spacer(modifier = Modifier.height(30.dp))


        OutlinedTextField(

            value = name,
            onValueChange ={name=it},
            label = { Text(text = "Full Name")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "person", tint = Blue)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),

        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(

            value = email,
            onValueChange ={email=it},
            label = { Text(text = "Email Address")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "email", tint = Blue)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),

            )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(

            value = password,
            onValueChange ={password=it},
            label = { Text(text = "Enter password")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "password", tint = Blue)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()

            )

        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField(

            value = confpassword,
            onValueChange ={confpassword=it},
            label = { Text(text = "Confirm Password")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "password", tint = Blue)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()

            )

        Spacer(modifier = Modifier.height(30.dp))


        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 20.dp, end = 20.dp),
            colors = ButtonDefaults.buttonColors(Blue),
            shape = RoundedCornerShape(10.dp)
        ) {

            Text(text = "Create Account")

        }

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 20.dp, end = 20.dp),
            colors = ButtonDefaults.buttonColors(Blue),
            shape = RoundedCornerShape(10.dp)
        ) {

            Text(text = "Login")

        }






    }

}




@Composable
@Preview(showBackground = true)
fun SignUpScreenPreview(){
    SignUpScreen(rememberNavController())


}