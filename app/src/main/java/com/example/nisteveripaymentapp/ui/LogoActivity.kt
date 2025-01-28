package com.example.nisteveripaymentapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.nisteveripaymentapp.R

class LogoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?){

        // Full screen NIDEC Logo
        setTheme(R.style.Theme_NISTEVERIPaymentApp_LogoFullscreen)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo_screen)
    }
}