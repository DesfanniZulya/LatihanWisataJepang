package com.fani.latihanwisatajepang

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            // Beralih ke halaman utama (MainActivity)
            val intent = Intent(this@Splash, MainActivity::class.java)
            startActivity(intent)
            finish() // Menutup SplashActivity
        }, 3000) // Delay 3 detik
    }
}