package com.example.cardzone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GameActivity1WinScreen : AppCompatActivity() {

    lateinit var mainMenuButton : Button
    lateinit var levelTwoButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_activity1_win_screen)
        supportActionBar?.hide()//REMOVES THE TOP ACTION BAR

        mainMenuButton = findViewById(R.id.mainMenuButton)
        mainMenuButton.setOnClickListener {
            val mainMenu = Intent(this, MainActivity::class.java)
            startActivity(mainMenu)
        }
        levelTwoButton = findViewById(R.id.levelTwoButton)
        levelTwoButton.setOnClickListener {
            val levelTwo = Intent(this, GameActivity1Level2::class.java)
            startActivity(levelTwo)
        }
    }
}