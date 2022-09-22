package com.example.cardzone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GameActivity1LoseScreen : AppCompatActivity() {

    lateinit var backtoGameButton : Button
    lateinit var mainMenuButton3 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_activity1_lose_screen)
        supportActionBar?.hide()//REMOVES THE TOP ACTION BAR

        backtoGameButton = findViewById(R.id.backtoGameButton)
        backtoGameButton.setOnClickListener {
            val intent5 = Intent(this, GameActivity1::class.java)
            startActivity(intent5)
        }


        mainMenuButton3 = findViewById(R.id.mainMenuButton3)
        mainMenuButton3.setOnClickListener {
            val intent4 = Intent(this, MainActivity::class.java)
            startActivity(intent4)
        }


    }
}