package com.appmaker.convertex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashOpenScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_open_screen)

        supportActionBar?.hide();

        Handler().postDelayed({
            val intent = Intent(this@SplashOpenScreen, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}