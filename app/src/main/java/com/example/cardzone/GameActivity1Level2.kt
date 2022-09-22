package com.example.cardzone

import android.content.Intent
import android.media.Image
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
        val intent2 = Intent(this, GameActivity1Level2WinScreen::class.java)
        val intent6 = Intent(this, GameActivity1Level2LoseScreen::class.java)


        tenofHearts = findViewById(R.id.tenofHearts)
        tenofHearts.setOnClickListener {
            move()
            tenofHearts.animate().rotationBy(360f)
            points++
            val points2 = findViewById<TextView>(R.id.points)
            points2.text = points.toString()
            when (points) {
                -1 -> startActivity(intent6)
                10 -> startActivity(intent2)
            }
        }
        twoofDiamonds = findViewById(R.id.twoofDiamonds)
        twoofDiamonds.setOnClickListener {
            move()
            twoofDiamonds.animate().rotationBy(360f)
            points++
            val points2 = findViewById<TextView>(R.id.points)
            points2.text = points.toString()
            when (points) {
                -1 -> startActivity(intent6)
                10 -> startActivity(intent2)
            }
        }
        nineofClubs = findViewById(R.id.nineofClubs)
        nineofClubs.setOnClickListener {
            move()
            nineofClubs.animate().rotationBy(360f)
            points--
            val points2 = findViewById<TextView>(R.id.points)
            points2.text = points.toString()
            when (points) {
                -1 -> startActivity(intent6)
                10 -> startActivity(intent2)
            }
        }
        queenofClubs = findViewById(R.id.queenofClubs)
        queenofClubs.setOnClickListener {
            move()
            queenofClubs.animate().rotationBy(360f)
            points--
            val points2 = findViewById<TextView>(R.id.points)
            points2.text = points.toString()
            when (points) {
                -1 -> startActivity(intent6)
                10 -> startActivity(intent2)
            }
        }
        threeofClubs = findViewById(R.id.threeofClubs)
        threeofClubs.setOnClickListener {
            move()
            threeofClubs.animate().rotationBy(360f)
            points--
            val points2 = findViewById<TextView>(R.id.points)
            points2.text = points.toString()
            when (points) {
                -1 -> startActivity(intent6)
                10 -> startActivity(intent2)
            }
        }
        twoofSpades = findViewById(R.id.twoofSpades)
        twoofSpades.setOnClickListener {
            move()
            twoofSpades.animate().rotationBy(360f)
            points--
            val points2 = findViewById<TextView>(R.id.points)
            points2.text = points.toString()
            when (points) {
                -1 -> startActivity(intent6)
                10 -> startActivity(intent2)
            }
        }
        eightofClubs = findViewById(R.id.eightofClubs)
        eightofClubs.setOnClickListener {
            move()
            eightofClubs.animate().rotationBy(360f)
            points--
            val points2 = findViewById<TextView>(R.id.points)
            points2.text = points.toString()
            when (points) {
                -1 -> startActivity(intent6)
                10 -> startActivity(intent2)
            }
        }
        sixofSpades = findViewById(R.id.sixofSpades)
        sixofSpades.setOnClickListener {
            move()
            sixofSpades.animate().rotationBy(360f)
            points--
            val points2 = findViewById<TextView>(R.id.points)
            points2.text = points.toString()
            when (points) {
                -1 -> startActivity(intent6)
                10 -> startActivity(intent2)
            }
        }


    }
    fun randomPosition() = Random.nextInt(-500, 500).toFloat()
    fun move() {
        sixofSpades.animate()
            .translationX(randomPosition())
            .translationY(randomPosition())
            .rotationBy(180f)
            .setDuration(200)
            .withEndAction(::move) //IF YOU REMOVE THIS IT WILL ONLY MOVE ONCE PER CLICK
            .start()
        eightofClubs.animate()
            .translationX(randomPosition())
            .translationY(randomPosition())
            .rotationBy(180f)
            .setDuration(200)
            .withEndAction(::move) //IF YOU REMOVE THIS IT WILL ONLY MOVE ONCE PER CLICK
            .start()
        twoofSpades.animate()
            .translationX(randomPosition())
            .translationY(randomPosition())
            .rotationBy(180f)
            .setDuration(200)
            .withEndAction(::move) //IF YOU REMOVE THIS IT WILL ONLY MOVE ONCE PER CLICK
            .start()
        threeofClubs.animate()
            .translationX(randomPosition())
            .translationY(randomPosition())
            .rotationBy(180f)
            .setDuration(200)
            .withEndAction(::move) //IF YOU REMOVE THIS IT WILL ONLY MOVE ONCE PER CLICK
            .start()
        queenofClubs.animate()
            .translationX(randomPosition())
            .translationY(randomPosition())
            .rotationBy(180f)
            .setDuration(200)
            .withEndAction(::move) //IF YOU REMOVE THIS IT WILL ONLY MOVE ONCE PER CLICK
            .start()
        nineofClubs.animate()
            .translationX(randomPosition())
            .translationY(randomPosition())
            .rotationBy(180f)
            .setDuration(200)
            .withEndAction(::move) //IF YOU REMOVE THIS IT WILL ONLY MOVE ONCE PER CLICK
            .start()
        twoofDiamonds.animate()
            .translationX(randomPosition())
            .translationY(randomPosition())
            .rotationBy(180f)
            .setDuration(200)
            .withEndAction(::move) //IF YOU REMOVE THIS IT WILL ONLY MOVE ONCE PER CLICK
            .start()
        tenofHearts.animate()
            .translationX(randomPosition())
            .translationY(randomPosition())
            .rotationBy(180f)
            .setDuration(200)
            .withEndAction(::move) //IF YOU REMOVE THIS IT WILL ONLY MOVE ONCE PER CLICK
            .start()
    }
}