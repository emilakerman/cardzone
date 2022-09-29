package com.example.cardzone

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class GameActivity1Level2LoseScreen : AppCompatActivity() {


    lateinit var backtoGameButton2 : Button
    lateinit var mainMenuButton2 : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_activity1_level2_lose_screen)
        supportActionBar?.hide()//REMOVES THE TOP ACTION BAR

        //BACKGROUND GRADIENT ANIMATION
        val rootLayout = findViewById<ConstraintLayout>(R.id.root_layout)
        val animDrawable = rootLayout.background as AnimationDrawable
        animDrawable.setEnterFadeDuration(10)
        animDrawable.setExitFadeDuration(1000)
        animDrawable.start()

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