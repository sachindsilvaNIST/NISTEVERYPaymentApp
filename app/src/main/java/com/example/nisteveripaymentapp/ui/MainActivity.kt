package com.example.nisteveripaymentapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.nisteveripaymentapp.ui.theme.NISTEVERIPaymentAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NISTEVERIPaymentAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Sachin............",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name:String,modifier:Modifier=Modifier){
    val displayName = if(name.isBlank()) "" else name
    Text(
        text = "Hello$displayName",
        modifier = modifier
    )
}


@Preview(showBackground = false)
@Composable
fun GreetingPreview() {
    NISTEVERIPaymentAppTheme {
        Greeting("Sachin")
    }
}