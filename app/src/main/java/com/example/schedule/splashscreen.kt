package com.example.schedule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper


class FlashActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT: Long = 3000 // 2 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        Handler(Looper.getMainLooper()).postDelayed({
            // This method will be executed once the timer is over
            // Start your app main activity
            val intent = Intent(this@FlashActivity, MainActivity::class.java)
            startActivity(intent)

            // close this activity
            finish()
        }, SPLASH_TIME_OUT)
    }
}