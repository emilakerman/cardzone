package com.example.cardzone

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class GameActivity1Level2WinScreen : AppCompatActivity() {

    lateinit var mainMenuButton4 : Button
    lateinit var levelThreeButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_activity1_level2_win_screen)
        supportActionBar?.hide()//REMOVES THE TOP ACTION BAR

        //BACKGROUND GRADIENT ANIMATION
        val rootLayout = findViewById<ConstraintLayout>(R.id.root_layout)
        val animDrawable = rootLayout.background as AnimationDrawable
        animDrawable.setEnterFadeDuration(10)
        animDrawable.setExitFadeDuration(1000)
        animDrawable.start()

        mainMenuButton4 = findViewById(R.id.mainMenuButton4)
        mainMenuButton4.setOnClickListener {
            val mainMenu = Intent(this, MainActivity::class.java)
            startActivity(mainMenu)
        }
        levelThreeButton = findViewById(R.id.levelThreeButton)
        levelThreeButton.setOnClickListener {
            val levelthree = Intent(this, GameActivity1Level3::class.java)
            startActivity(levelthree)
        }

    }
}