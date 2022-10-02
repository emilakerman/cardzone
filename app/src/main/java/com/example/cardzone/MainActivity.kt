package com.example.cardzone

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //BACKGROUND GRADIENT ANIMATION
        val rootLayout = findViewById<ConstraintLayout>(R.id.root_layout)
        val animDrawable = rootLayout.background as AnimationDrawable
        animDrawable.setEnterFadeDuration(10)
        animDrawable.setExitFadeDuration(1000)
        animDrawable.start()

        //GAME1 BUTTON
        val game1Button = findViewById<Button>(R.id.game1Button)
        game1Button.setOnClickListener {
            val game1 = Intent(this, GameActivity1::class.java)
            startActivity(game1)
        }
        //GAME2 BUTTON
        val game2Button = findViewById<Button>(R.id.game2Button)
        game2Button.setOnClickListener {
            val game2 = Intent(this, GameActivity2::class.java)
            //startActivity(game2)
        }
        //GAME3 BUTTON
        val game3Button = findViewById<Button>(R.id.game3Button)
        game3Button.setOnClickListener {
            val game3 = Intent(this, GameActivity1Level3::class.java)
            startActivity(game3)
        }
    }
}