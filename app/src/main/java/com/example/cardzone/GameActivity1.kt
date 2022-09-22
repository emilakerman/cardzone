package com.example.cardzone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
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
        supportActionBar?.hide()//REMOVES THE TOP ACTION BAR
        val intent2 = Intent(this, GameActivity1WinScreen::class.java)
        val intent6 = Intent(this, GameActivity1LoseScreen::class.java)

        aceOfClubs = findViewById(R.id.aceOfClubs)
        aceOfClubs.setOnClickListener {
            move()
            aceOfClubs.animate().rotationBy(360f)//maybe move to function?
            points++
            val points2 = findViewById<TextView>(R.id.points)
            points2.text = points.toString()
            when (points) {
                -1 -> startActivity(intent6)
                10 -> startActivity(intent2)
            }
        }
        aceOfSpades = findViewById(R.id.aceOfSpades)
        aceOfSpades.setOnClickListener {
            move()
            aceOfSpades.animate().rotationBy(360f)
            points++
            val points2 = findViewById<TextView>(R.id.points)
            points2.text = points.toString()
            when (points) {
                -1 -> startActivity(intent6)
                10 -> startActivity(intent2)
            }
        }
        aceOfDiamonds = findViewById(R.id.aceOfDiamonds)
        aceOfDiamonds.setOnClickListener {
            move()
            aceOfDiamonds.animate().rotationBy(360f)
            points--
            val points2 = findViewById<TextView>(R.id.points)
            points2.text = points.toString()
            when (points) {
                -1 -> startActivity(intent6)
                10 -> startActivity(intent2)
            }
        }
        aceOfHearts = findViewById(R.id.aceOfHearts)
        aceOfHearts.setOnClickListener {
            move()
            aceOfHearts.animate().rotationBy(360f)
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
        aceOfSpades.animate()
            .translationX(randomPosition())
            .translationY(randomPosition())
            .setDuration(500)
            .withEndAction(::move) //IF YOU REMOVE THIS IT WILL ONLY MOVE ONCE PER CLICK
            .start()
        aceOfClubs.animate()
            .translationX(randomPosition())
            .translationY(randomPosition())
            .setDuration(500)
            .withEndAction(::move) //IF YOU REMOVE THIS IT WILL ONLY MOVE ONCE PER CLICK
            .start()
        aceOfHearts.animate()
            .translationX(randomPosition())
            .translationY(randomPosition())
            .setDuration(500)
            .withEndAction(::move) //IF YOU REMOVE THIS IT WILL ONLY MOVE ONCE PER CLICK
            .start()
        aceOfDiamonds.animate()
            .translationX(randomPosition())
            .translationY(randomPosition())
            .setDuration(500)
            .withEndAction(::move) //IF YOU REMOVE THIS IT WILL ONLY MOVE ONCE PER CLICK
            .start()
    }
}