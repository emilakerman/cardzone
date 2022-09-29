package com.example.cardzone

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class GameActivity1WinScreen : AppCompatActivity() {

    lateinit var mainMenuButton : Button
    lateinit var levelTwoButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_activity1_win_screen)
        supportActionBar?.hide()//REMOVES THE TOP ACTION BAR

        //BACKGROUND GRADIENT ANIMATION
        val rootLayout = findViewById<ConstraintLayout>(R.id.root_layout)
        val animDrawable = rootLayout.background as AnimationDrawable
        animDrawable.setEnterFadeDuration(10)
        animDrawable.setExitFadeDuration(1000)
        animDrawable.start()

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