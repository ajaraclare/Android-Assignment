package com.example.ui_practisedesign

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui_practisedesign.ui.theme.UIPractiseDesignTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Design()

        }
    }
}

@Composable
fun Design(){

    LazyColumn(){

        item {

            Row {
                Box(
                    modifier = Modifier
                        .padding(15.dp)
                        .padding(15.dp)
                ) {
                    Icon(imageVector = Icons.Default.Person, contentDescription = null)
                }

                Box(
                    modifier = Modifier
                        .padding(15.dp)
                        .padding(15.dp)
                ) {
                    Icon(imageVector = Icons.Default.Search, contentDescription = null)


                }

            }

            Column (
                modifier = Modifier
                    .padding(15.dp)
                    .padding(15.dp)


            ) {
                Text(text = "Welcome Back,",
                    fontSize = 25.sp
                )


                Text(text = "Alexander",
                        fontSize = 35.sp

                )

            }

            Row {
                Card(){
                   

                }

                Card(){

                }

                Card(){

                }

                Card(){

                }

            }

            Column (
                modifier = Modifier
                    .padding(15.dp)
                    .padding(15.dp)


            ) {
                Text(text = "Discover",
                    fontSize = 25.sp

                )

            }

            Row(){

                Card(){

                        Image(painter = painterResource(R.drawable.diamond), contentDescription = null)
                        
                        Column {
                            Text(text = "Diamond")
                            Text(text = "Diamond")
                            Text(text = "Diamond")
                        }



                }

                Card(){
                    Image(painter = painterResource(R.drawable.diamond), contentDescription = null)

                    Column {
                        Text(text = "Diamond")
                        Text(text = "Diamond")
                        Text(text = "Diamond")
                    }

                }


            }


            Spacer(modifier = Modifier.height(10.dp))


            Row(){

                Column(){
                    Image(painter = painterResource(R.drawable.diamond), contentDescription = null)

                    Column {
                        Text(text = "Diamond")
                        Text(text = "Diamond")
                        Text(text = "Diamond")
                    }

                }

                Column(){
                    Image(painter = painterResource(R.drawable.diamond), contentDescription = null)

                    Column {
                        Text(text = "Diamond")
                        Text(text = "Diamond")
                        Text(text = "Diamond")
                    }
                }


            }


            Spacer(modifier = Modifier.height(10.dp))


            Row(){

                Column(){
                    Image(painter = painterResource(R.drawable.diamond), contentDescription = null)

                    Column {
                        Text(text = "Diamond")
                        Text(text = "Diamond")
                        Text(text = "Diamond")
                    }

                }

                Column(){
                    Image(painter = painterResource(R.drawable.diamond), contentDescription = null)

                    Column {
                        Text(text = "Diamond")
                        Text(text = "Diamond")
                        Text(text = "Diamond")
                    }

                }


            }


            Spacer(modifier = Modifier.height(10.dp))



//            ADD BOTTOM NAVIGATION HERE.










































        }





















    }

}
