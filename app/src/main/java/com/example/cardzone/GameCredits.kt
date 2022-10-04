package com.example.cardzone

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


class GameCredits : AppCompatActivity() {

    lateinit var githubButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_credits)

        //BACKGROUND GRADIENT ANIMATION
        val rootLayout = findViewById<ConstraintLayout>(R.id.root_layout)
        val animDrawable = rootLayout.background as AnimationDrawable
        animDrawable.setEnterFadeDuration(10)
        animDrawable.setExitFadeDuration(1000)
        animDrawable.start()

        githubButton = findViewById(R.id.githubButton)
        githubButton.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/emilakerman/cardzone"))
            startActivity(browserIntent)
        }
    }
}