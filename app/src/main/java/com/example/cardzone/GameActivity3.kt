package com.example.cardzone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random
import kotlin.random.Random.Default.nextInt

class GameActivity3 : AppCompatActivity() {

    lateinit var mainCard : ImageView
    lateinit var leftButton : Button
    lateinit var rightButton : Button
    lateinit var centerButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game3)
        supportActionBar?.hide()//REMOVES THE TOP ACTION BAR

        mainCard = findViewById(R.id.mainCard)

        leftButton = findViewById(R.id.leftButton)
            leftButton.setOnClickListener {
                moveleft()

            }
        rightButton = findViewById(R.id.rightButton)
            rightButton.setOnClickListener {
                moveright()
            }
        centerButton = findViewById(R.id.centerButton)
            centerButton.setOnClickListener {
                movecenter()
        }



    }
    fun movePositionLeft() = (-300).toFloat()
    fun moveleft() {
        mainCard.animate()
            .translationX(movePositionLeft())
    }
    fun movePositionRight() = (300).toFloat()
    fun moveright() {
        mainCard.animate()
            .translationX(movePositionRight())
    }
    fun movePositionCenter() = (0).toFloat()
    fun movecenter() {
        mainCard.animate()
            .translationX(movePositionCenter())
    }
}