package com.example.cardzone

import android.graphics.Rect
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class GameActivity3 : AppCompatActivity() {

    lateinit var mainCard : ImageView
    lateinit var fallingObject : ImageView
    var collided : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game3)
        supportActionBar?.hide()//REMOVES THE TOP ACTION BAR

        mainCard = findViewById(R.id.mainCard)

        val leftButton = findViewById<Button>(R.id.leftButton)
        leftButton.setOnClickListener {
            moveleft()
        }
        val rightButton = findViewById<Button>(R.id.rightButton)
        rightButton.setOnClickListener {
            moveright()
        }
        val centerButton = findViewById<Button>(R.id.centerButton)
        centerButton.setOnClickListener {
            movecenter()
        }

        fallingObject = findViewById(R.id.fallingObject)
        moveObjectDown()


        //MAKES THE IMAGEVIEWS INTO RECTANGLES??
        Rect()
        val fallingObjectRect = Rect(
            fallingObject.x.toInt(),
            fallingObject.y.toInt(),
            (fallingObject.x + fallingObject.width).toInt(),
            (fallingObject.y + fallingObject.height).toInt()
        )
        val mainCardRect = Rect(
            mainCard.x.toInt(),
            mainCard.y.toInt(),
            (mainCard.x + mainCard.width).toInt(),
            (mainCard.y + mainCard.height).toInt()
        )
        if (mainCardRect.intersect(fallingObjectRect)) { //INTERSECT
            collided = true
            mainCard.animate().rotationBy(360f)
            Log.d("!!!", "pang!!!")
        }
    }
    fun moveObjectDownDirection() = (2500).toFloat()
    fun moveObjectDown() {
        fallingObject.animate()
            .translationY(moveObjectDownDirection()).duration = 10000
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