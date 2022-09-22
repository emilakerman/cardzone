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

        //GAME1 BUTTON
        val game1Button = findViewById<Button>(R.id.game1Button)
        game1Button.setOnClickListener {
            val intent = Intent(this, GameActivity1::class.java)
            startActivity(intent)
        }
        //GAME2 BUTTON
        val game2Button = findViewById<Button>(R.id.game2Button)
        game2Button.setOnClickListener {
            val intent = Intent(this, GameActivity2::class.java)
            startActivity(intent)
        }
        //QUIT BUTTON - ta bort det här, appar har inga quit-knappar
        val quitButton = findViewById<Button>(R.id.quitButton)
        quitButton.setOnClickListener { finishAffinity() }



    }
}