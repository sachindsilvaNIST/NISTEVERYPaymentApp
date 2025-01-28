package com.example.nisteveripaymentapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.nisteveripaymentapp.R
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier

import androidx.compose.ui.tooling.preview.Preview


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        // Add Splash Screen
        val splashScreen = installSplashScreen()


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        splashScreen.setKeepOnScreenCondition {
//            true // This means, no extra delay and proceed immediately
//        }


        // Logic -- To be updated.
    }
}
