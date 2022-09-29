package com.example.cardzone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.util.rangeTo
import kotlin.random.Random

class GameActivity1 : AppCompatActivity() {

    lateinit var aceOfSpades : ImageView
    lateinit var aceOfClubs : ImageView
    lateinit var aceOfDiamonds : ImageView
    lateinit var aceOfHearts : ImageView
    var points = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game1)
        supportActionBar?.hide()
        val winScreen = Intent(this, GameActivity1WinScreen::class.java)
        val loseScreen = Intent(this, GameActivity1LoseScreen::class.java)

        aceOfClubs = findViewById(R.id.aceOfClubs)
        aceOfClubs.setOnClickListener {
            aceOfClubs.animate().rotationBy(360f)//maybe move to function?
            points++
            val points2 = findViewById<TextView>(R.id.points)
            points2.text = points.toString()
            when (points) {
                -1 -> startActivity(loseScreen)
                10 -> startActivity(winScreen)
            }
        }
        aceOfSpades = findViewById(R.id.aceOfSpades)
        aceOfSpades.setOnClickListener {
            aceOfSpades.animate().rotationBy(360f)
            points++
            val points2 = findViewById<TextView>(R.id.points)
            points2.text = points.toString()
            when (points) {
                -1 -> startActivity(loseScreen)
                10 -> startActivity(winScreen)
            }
        }
        aceOfDiamonds = findViewById(R.id.aceOfDiamonds)
        aceOfDiamonds.setOnClickListener {
            aceOfDiamonds.animate().rotationBy(360f)
            points--
            val points2 = findViewById<TextView>(R.id.points)
            points2.text = points.toString()
            when (points) {
                -1 -> startActivity(loseScreen)
                10 -> startActivity(winScreen)
            }
        }
        aceOfHearts = findViewById(R.id.aceOfHearts)
        aceOfHearts.setOnClickListener {
            aceOfHearts.animate().rotationBy(360f)
            points--
            val points2 = findViewById<TextView>(R.id.points)
            points2.text = points.toString()
            when (points) {
                -1 -> startActivity(loseScreen)
                10 -> startActivity(winScreen)
            }
        }
        move()
    }
    fun randomPosition() = Random.nextInt(-500, 500).toFloat()
    fun move(duration: Long = 500){
        val cardArray = arrayOf(aceOfSpades, aceOfClubs, aceOfHearts, aceOfDiamonds)
        for (item in cardArray) {
            item.animate()
            .translationX(randomPosition())
            .translationY(randomPosition())
            .setDuration(duration)
            .withEndAction(::move)
        }
    }
}