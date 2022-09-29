package com.example.cardzone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random


class GameActivity1Level2 : AppCompatActivity() {

    lateinit var sixofSpades : ImageView
    lateinit var eightofClubs : ImageView
    lateinit var twoofSpades : ImageView
    lateinit var threeofClubs : ImageView
    lateinit var queenofClubs : ImageView
    lateinit var nineofClubs : ImageView
    lateinit var twoofDiamonds : ImageView
    lateinit var tenofHearts : ImageView
    var points = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_activity1_level2)
        supportActionBar?.hide()//REMOVES THE TOP ACTION BAR
        val winScreen = Intent(this, GameActivity1Level2WinScreen::class.java)
        val loseScreen = Intent(this, GameActivity1Level2LoseScreen::class.java)


        tenofHearts = findViewById(R.id.tenofHearts)
        tenofHearts.setOnClickListener {
            tenofHearts.animate().rotationBy(360f)
            points++
            val points2 = findViewById<TextView>(R.id.points)
            points2.text = points.toString()
            when (points) {
                -1 -> startActivity(loseScreen)
                5 -> startActivity(winScreen)
            }
        }
        twoofDiamonds = findViewById(R.id.twoofDiamonds)
        twoofDiamonds.setOnClickListener {
            twoofDiamonds.animate().rotationBy(360f)
            points++
            val points2 = findViewById<TextView>(R.id.points)
            points2.text = points.toString()
            when (points) {
                -1 -> startActivity(loseScreen)
                5 -> startActivity(winScreen)
            }
        }
        nineofClubs = findViewById(R.id.nineofClubs)
        nineofClubs.setOnClickListener {
            nineofClubs.animate().rotationBy(360f)
            points--
            val points2 = findViewById<TextView>(R.id.points)
            points2.text = points.toString()
            when (points) {
                -1 -> startActivity(loseScreen)
                5 -> startActivity(winScreen)
            }
        }
        queenofClubs = findViewById(R.id.queenofClubs)
        queenofClubs.setOnClickListener {
            queenofClubs.animate().rotationBy(360f)
            points--
            val points2 = findViewById<TextView>(R.id.points)
            points2.text = points.toString()
            when (points) {
                -1 -> startActivity(loseScreen)
                5 -> startActivity(winScreen)
            }
        }
        threeofClubs = findViewById(R.id.threeofClubs)
        threeofClubs.setOnClickListener {
            threeofClubs.animate().rotationBy(360f)
            points--
            val points2 = findViewById<TextView>(R.id.points)
            points2.text = points.toString()
            when (points) {
                -1 -> startActivity(loseScreen)
                5 -> startActivity(winScreen)
            }
        }
        twoofSpades = findViewById(R.id.twoofSpades)
        twoofSpades.setOnClickListener {
            twoofSpades.animate().rotationBy(360f)
            points--
            val points2 = findViewById<TextView>(R.id.points)
            points2.text = points.toString()
            when (points) {
                -1 -> startActivity(loseScreen)
                5 -> startActivity(winScreen)
            }
        }
        eightofClubs = findViewById(R.id.eightofClubs)
        eightofClubs.setOnClickListener {
            eightofClubs.animate().rotationBy(360f)
            points--
            val points2 = findViewById<TextView>(R.id.points)
            points2.text = points.toString()
            when (points) {
                -1 -> startActivity(loseScreen)
                5 -> startActivity(winScreen)
            }
        }
        sixofSpades = findViewById(R.id.sixofSpades)
        sixofSpades.setOnClickListener {
            sixofSpades.animate().rotationBy(360f)
            points--
            val points2 = findViewById<TextView>(R.id.points)
            points2.text = points.toString()
            when (points) {
                -1 -> startActivity(loseScreen)
                5 -> startActivity(winScreen)
            }
        }
        move()
    }
    fun randomPosition() = Random.nextInt(-500, 500).toFloat()
    fun move(duration: Long = 300, rotate: Float = 180f) {
        val cardArray = arrayOf(sixofSpades, eightofClubs, twoofSpades, threeofClubs, queenofClubs, nineofClubs, twoofDiamonds, tenofHearts)
        for (item in cardArray) {
            item.animate()
                .translationX(randomPosition())
                .translationY(randomPosition())
                .setDuration(duration)
                .rotationBy(rotate)
                .withEndAction(::move)
        }
    }
}