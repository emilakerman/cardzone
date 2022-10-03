package com.example.cardzone

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class GameActivity1Level3LoseScreen : AppCompatActivity() {

    lateinit var backtoGameButton3 : Button
    lateinit var mainMenuButton6 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_activity1_level3_lose_screen)
        supportActionBar?.hide()

        val rootLayout = findViewById<ConstraintLayout>(R.id.root_layout)
        val animDrawable = rootLayout.background as AnimationDrawable
        animDrawable.setEnterFadeDuration(10)
        animDrawable.setExitFadeDuration(1000)
        animDrawable.start()

        backtoGameButton3 = findViewById(R.id.backtoGameButton3)
        backtoGameButton3.setOnClickListener {
            val tryAgain = Intent(this, GameActivity1Level3::class.java)
            startActivity(tryAgain)
        }


        mainMenuButton6 = findViewById(R.id.mainMenuButton6)
        mainMenuButton6.setOnClickListener {
            val mainMenu = Intent(this, MainActivity::class.java)
            startActivity(mainMenu)
        }




    }
}