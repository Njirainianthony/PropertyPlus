package com.example.propertyplus.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.propertyplus.R
import com.example.propertyplus.navigation.ADD_PRODUCTS_URL
import com.example.propertyplus.navigation.ROUT_HOME
import com.example.propertyplus.navigation.ROUT_PROPERTY
import com.example.propertyplus.navigation.VIEW_PRODUCTS_URL
import com.example.propertyplus.ui.theme.Blue

@Composable

fun DashboardScreen(navController: NavController){

    Column(modifier = Modifier.fillMaxSize(),
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

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Manage your properties with ease",
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,
            color = Color.Blue

        )

        Spacer(modifier = Modifier.height(20.dp))



        Column (modifier = Modifier.verticalScroll(rememberScrollState())){

            //START OF MAIN CARD
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(700.dp),
                shape = RoundedCornerShape(topStart = 60.dp, topEnd = 60.dp),
                colors = CardDefaults.cardColors(Blue)

            ){

                //ROW 1

                Row (modifier = Modifier.padding(20.dp)){
                    //CARD 1
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                        .clickable { navController.navigate(ROUT_HOME) },
                        elevation = CardDefaults.cardElevation(30.dp)
                    ){

                        Column() {

                            Spacer(modifier = Modifier.height(20.dp))


                            Box (modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ){
                                Image(painter = painterResource(id = R.drawable.homeicon2),
                                    contentDescription = "home",
                                    modifier = Modifier.size(70.dp)
                                )

                            }

                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text = "Home",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )

                        }


                    }
                    //END OF CARD 1

                    Spacer(modifier = Modifier.width(20.dp))

                    //CARD 2
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                        .clickable { navController.navigate(ROUT_PROPERTY) },
                        elevation = CardDefaults.cardElevation(30.dp)
                    ){

                        Column() {

                            Spacer(modifier = Modifier.height(20.dp))


                            Box (modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ){
                                Image(painter = painterResource(id = R.drawable.propertyicon2),
                                    contentDescription = "home",
                                    modifier = Modifier.size(70.dp)
                                )

                            }

                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text = "Property",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )

                        }


                    }
                    //END OF CARD 2


                }
            //END OF ROW 1

                //ROW 2

                Row (modifier = Modifier.padding(20.dp)){
                    //CARD 1
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(30.dp)
                    ){

                        Column() {

                            Spacer(modifier = Modifier.height(20.dp))


                            Box (modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ){
                                Image(painter = painterResource(id = R.drawable.settingsicon),
                                    contentDescription = "home",
                                    modifier = Modifier.size(70.dp)
                                )

                            }

                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text = "Settings",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )

                        }


                    }
                    //END OF CARD 1

                    Spacer(modifier = Modifier.width(20.dp))

                    //CARD 2
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(30.dp)
                    ){

                        Column() {

                            Spacer(modifier = Modifier.height(20.dp))


                            Box (modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ){
                                Image(painter = painterResource(id = R.drawable.profileicon),
                                    contentDescription = "home",
                                    modifier = Modifier.size(70.dp)
                                )

                            }

                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text = "Profile",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )

                        }


                    }
                    //END OF CARD 2


                }
                //END OF ROW 2

                //ROW 3

                Row (modifier = Modifier.padding(20.dp)){
                    //CARD 1
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                        .clickable { navController.navigate(ADD_PRODUCTS_URL) },
                        elevation = CardDefaults.cardElevation(30.dp)
                    ){

                        Column() {

                            Spacer(modifier = Modifier.height(20.dp))


                            Box (modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ){
                                Image(painter = painterResource(id = R.drawable.addicon),
                                    contentDescription = "home",
                                    modifier = Modifier.size(70.dp)
                                )

                            }

                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text = "Home",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )

                        }


                    }
                    //END OF CARD 1

                    Spacer(modifier = Modifier.width(20.dp))

                    //CARD 2
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                        .clickable { navController.navigate(VIEW_PRODUCTS_URL) },
                        elevation = CardDefaults.cardElevation(30.dp)
                    ){

                        Column() {

                            Spacer(modifier = Modifier.height(20.dp))


                            Box (modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ){
                                Image(painter = painterResource(id = R.drawable.viewicon),
                                    contentDescription = "home",
                                    modifier = Modifier.size(70.dp)
                                )

                            }

                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text = "Home",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )

                        }


                    }
                    //END OF CARD 2


                }
                //END OF ROW 3

            }

            //END OF MAIN CARD
        }





    }

}




@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())


}