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
        supportActionBar?.hide()//REMOVES THE TOP ACTION BAR

        /*
        ConstraintLayout() constraintLayout = findViewById(R.id.mainLayout)
        AnimationDrawable animationDrawable = constraintLayout.getBackground()
        animationDrawable.setEnterFadeDuration(2500)
        */


        //GAME1 BUTTON
        val game1Button = findViewById<Button>(R.id.game1Button)
        game1Button.setOnClickListener {
            val intent = Intent(this, GameActivity1::class.java)
            startActivity(intent)
        }
        //GAME2 BUTTON
        val game2Button = findViewById<Button>(R.id.game2Button)
        game2Button.setOnClickListener {
            val intent = Intent(this, GameActivity2::class.java)
            startActivity(intent)
        }
        //QUIT BUTTON - ta bort det här, appar har inga quit-knappar
        val game3Button = findViewById<Button>(R.id.game3Button)
        game3Button.setOnClickListener {
            val intent = Intent(this, GameActivity3::class.java)
            startActivity(intent)
        }
    }
}