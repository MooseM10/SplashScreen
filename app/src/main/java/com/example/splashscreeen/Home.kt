package com.example.splashscreeen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Home : AppCompatActivity() {
    private lateinit var pizzaButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        pizzaButton = findViewById(R.id.button2)

        pizzaButton.setOnClickListener{
            var pastaIntent = Intent(this, MarioHome::class.java)
            startActivity(pastaIntent)
        }
    }
}