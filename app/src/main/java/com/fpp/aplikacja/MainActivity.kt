package com.fpp.aplikacja

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //obsługa kliknięcia
        findViewById<Button>(R.id.Przycisk).setOnClickListener {
            findViewById<Button>(R.id.Przycisk).text = "działa"
        }
        findViewById<Button>(R.id.Przycisk2).setOnClickListener {
            findViewById<Button>(R.id.Przycisk2).text = "Magenta"
            findViewById<Button>(R.id.Przycisk2).setTextColor(Color.BLACK)
            findViewById<Button>(R.id.Przycisk2).setBackgroundColor(Color.MAGENTA)
        }
    }
}