package com.register.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.register.myapplication.Simpleactivty
import com.register.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
                    Login()
                }
            }
        }
    }
}

@Composable
fun Login() {
    var email by remember { mutableStateOf("") }
    var password by remember {
        mutableStateOf("")

    }
    val context= LocalContext.current


    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .background(color = Color.Black)
    ) {
        Text(
            text = "Safari login",
            color = Color.White,
            fontSize = 20.sp,
            fontFamily = FontFamily.Monospace
        )
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = {
                Text(
                    text = "Enter E-mail", color = Color.Red,
                    fontFamily = FontFamily.Serif
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
        )

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = {
                Text(
                    text = "Enter password", color = Color.Red,
                    fontFamily = FontFamily.Serif
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            val intent = Intent(context, MainActivity::class.java)
            context.startActivity(intent)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Login",
                fontSize = 25.sp
            )

        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            val intent = Intent(context, Registeractivity::class.java)
            context.startActivity(intent)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Register",
                fontSize = 25.sp
            )

        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            val intent = Intent(context, IntentActivity::class.java)
            context.startActivity(intent)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Intent",
                fontSize = 25.sp
            )

        }



        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            val intent = Intent(context, CalculatorActivity2::class.java)
            context.startActivity(intent)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Calculator",
                fontSize = 25.sp
            )
        }

        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            val intent = Intent(context,Simpleactivty::class.java)
            context.startActivity(intent)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "List",
                fontSize = 25.sp
            )

        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            val intent = Intent(context,Customlist::class.java)
            context.startActivity(intent)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Custom list",
                fontSize = 25.sp
            )

        }

        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            val intent = Intent(context,CardActivity::class.java)
            context.startActivity(intent)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Card Activity",
                fontSize = 25.sp
            )

        }

    }


}

@Preview
@Composable
private fun
        Loginprev() {
    Login()
}