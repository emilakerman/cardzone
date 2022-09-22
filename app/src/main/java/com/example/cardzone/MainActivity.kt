package com.example.cardzone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()//REMOVES THE TOP ACTION BAR

        //PLAY BUTTON
        val playButton = findViewById<Button>(R.id.playButton)
        playButton.setOnClickListener {
            val intent = Intent(this, GameActivity1::class.java)
            startActivity(intent)
        }
        //QUIT BUTTON - ta bort det här, appar har inga quit-knappar
        val quitButton = findViewById<Button>(R.id.quitButton)
        quitButton.setOnClickListener { finishAffinity() }



    }
}