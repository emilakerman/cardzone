package com.example.cardzone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GameActivity1Level2WinScreen : AppCompatActivity() {

    lateinit var mainMenuButton4 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_activity1_level2_win_screen)
        supportActionBar?.hide()//REMOVES THE TOP ACTION BAR

        mainMenuButton4 = findViewById(R.id.mainMenuButton4)
        mainMenuButton4.setOnClickListener {
            val mainMenu = Intent(this, MainActivity::class.java)
            startActivity(mainMenu)
        }

    }
}