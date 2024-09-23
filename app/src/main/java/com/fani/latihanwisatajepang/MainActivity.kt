package com.fani.latihanwisatajepang

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val seeDetailsButton: Button = findViewById(R.id.seeDetailsButton)
        seeDetailsButton.setOnClickListener {
            // Pindah ke DetailActivity
            val intent = Intent(this, beranda::class.java)
            startActivity(intent)
        }
    }
}
