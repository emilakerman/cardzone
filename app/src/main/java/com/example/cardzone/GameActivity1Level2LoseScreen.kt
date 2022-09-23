package com.example.cardzone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GameActivity1Level2LoseScreen : AppCompatActivity() {


    lateinit var backtoGameButton2 : Button
    lateinit var mainMenuButton2 : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_activity1_level2_lose_screen)
        supportActionBar?.hide()//REMOVES THE TOP ACTION BAR

        backtoGameButton2 = findViewById(R.id.backtoGameButton2)
        backtoGameButton2.setOnClickListener {
            val tryAgain = Intent(this, GameActivity1Level2::class.java)
            startActivity(tryAgain)
        }


        mainMenuButton2 = findViewById(R.id.mainMenuButton2)
        mainMenuButton2.setOnClickListener {
            val mainMenu = Intent(this, MainActivity::class.java)
            startActivity(mainMenu)
        }


    }
}