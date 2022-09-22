package com.example.cardzone

import android.animation.ObjectAnimator
import android.content.Intent
import android.graphics.Path
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.graphics.rotationMatrix
import kotlin.random.Random

class GameActivity1 : AppCompatActivity() {

    lateinit var aceOfSpades : ImageView
    lateinit var aceOfClovers : ImageView
    lateinit var aceOfDiamonds : ImageView
    lateinit var aceOfHearts : ImageView
    var points = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game1)
        supportActionBar?.hide()//REMOVES THE TOP ACTION BAR

        aceOfClovers = findViewById(R.id.aceOfClovers)
        aceOfClovers.setOnClickListener {
            move()
            aceOfClovers.animate().rotationBy(360f)
            points++
            val points2 = findViewById<TextView>(R.id.points)
            points2.text = points.toString()
            when (points) {
                -1 -> finish()
                10 -> points2.text = "YOU WIN"
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
                -1 -> finish()
                10 -> points2.text = "YOU WIN"
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
                -1 -> finish()
                10 -> points2.text = "YOU WIN"
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
                -1 -> finish()
                10 -> points2.text = "YOU WIN"
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
        aceOfClovers.animate()
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