package com.example.cardzone

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


class GameActivity1Level3 : AppCompatActivity() {

    lateinit var eightOfSpades: ImageView
    lateinit var nineOfClubs: ImageView
    lateinit var fourOfSpades: ImageView
    lateinit var fiveOfClubs: ImageView
    lateinit var eightOfDiamonds : ImageView
    lateinit var sixOfHearts : ImageView
    lateinit var sevenOfDiamonds : ImageView
    lateinit var twoOfHearts : ImageView
    lateinit var sevenOfHearts : ImageView
    lateinit var tenOfClubs : ImageView
    lateinit var fourOfHearts : ImageView
    lateinit var threeOfSpades : ImageView

    lateinit var crown1 : ImageView
    lateinit var crown2 : ImageView
    lateinit var crown3 : ImageView
    lateinit var crown4 : ImageView

    lateinit var countDownTimer : CountDownTimer

    var interval = 1000
    var totalSeconds = 20000
    var secLeft = 20

    var queenCount : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_activity1_level3)
        supportActionBar?.hide()
        //BG
        val rootLayout = findViewById<ConstraintLayout>(R.id.mainLayout)
        val animDrawable = rootLayout.background as AnimationDrawable
        animDrawable.setEnterFadeDuration(10)
        animDrawable.setExitFadeDuration(500)
        animDrawable.start()
        //TIMER
        val textField = findViewById<TextView>(R.id.textField)
        val loseScreen = Intent(this, GameActivity1Level3LoseScreen::class.java)
        countDownTimer = object : CountDownTimer(totalSeconds.toLong(), interval.toLong()) {
            override fun onTick(millisUntilFinished: Long) {
                secLeft -= 1
                textField.text = "Seconds remaining: $secLeft"
            }
            override fun onFinish() {
                startActivity(loseScreen)
            }
        }.start()

        eightOfSpades = findViewById(R.id.eightOfSpades)
        nineOfClubs = findViewById(R.id.nineOfClubs)
        fiveOfClubs = findViewById(R.id.fiveOfClubs)
        fourOfSpades = findViewById(R.id.fourOfSpades)
        eightOfDiamonds = findViewById(R.id.eightOfDiamonds)
        sixOfHearts = findViewById(R.id.sixOfHearts)
        sevenOfDiamonds = findViewById(R.id.sevenOfDiamonds)
        twoOfHearts = findViewById(R.id.twoOfHearts)
        sevenOfHearts = findViewById(R.id.sevenOfHearts)
        tenOfClubs = findViewById(R.id.tenOfClubs)
        fourOfHearts = findViewById(R.id.fourOfHearts)
        threeOfSpades = findViewById(R.id.threeOfSpades)
        crown1 = findViewById(R.id.crown1)
        crown2 = findViewById(R.id.crown2)
        crown3 = findViewById(R.id.crown3)
        crown4 = findViewById(R.id.crown4)
        motionLeft()

        //CLICKS
        eightOfSpades.setOnClickListener {
            eightOfSpades.setImageResource(R.drawable.queenofclubs)
            crown1.setImageResource(R.drawable.crown)
            goodCards()
            eightOfSpades.isEnabled = false
        }
        nineOfClubs.setOnClickListener {
            nineOfClubs.setImageResource(R.drawable.red_joker)
            badCards()
            nineOfClubs.isEnabled = false
        }
        fourOfSpades.setOnClickListener {
            fourOfSpades.setImageResource(R.drawable.red_joker)
            badCards()
            fourOfSpades.isEnabled = false
        }
        fiveOfClubs.setOnClickListener {
            fiveOfClubs.setImageResource(R.drawable.red_joker)
            badCards()
            fiveOfClubs.isEnabled = false
        }
        eightOfDiamonds.setOnClickListener {
            eightOfDiamonds.setImageResource(R.drawable.red_joker)
            badCards()
            eightOfDiamonds.isEnabled = false
        }
        sixOfHearts.setOnClickListener {
            sixOfHearts.setImageResource(R.drawable.queenofdiamonds)
            crown2.setImageResource(R.drawable.crown)
            goodCards()
            sixOfHearts.isEnabled = false
        }
        sevenOfDiamonds.setOnClickListener {
            sevenOfDiamonds.setImageResource(R.drawable.red_joker)
            badCards()
            sevenOfDiamonds.isEnabled = false
        }
        twoOfHearts.setOnClickListener {
            twoOfHearts.setImageResource(R.drawable.queenofhearts)
            crown3.setImageResource(R.drawable.crown)
            goodCards()
            twoOfHearts.isEnabled = false
        }
        sevenOfHearts.setOnClickListener {
            sevenOfHearts.setImageResource(R.drawable.red_joker)
            badCards()
            sevenOfHearts.isEnabled = false
        }
        tenOfClubs.setOnClickListener {
            tenOfClubs.setImageResource(R.drawable.red_joker)
            badCards()
            tenOfClubs.isEnabled = false
        }
        fourOfHearts.setOnClickListener {
            fourOfHearts.setImageResource(R.drawable.red_joker)
            badCards()
            fourOfHearts.isEnabled = false
        }
        threeOfSpades.setOnClickListener {
            threeOfSpades.setImageResource(R.drawable.queenofspades)
            crown4.setImageResource(R.drawable.crown)
            goodCards()
            threeOfSpades.isEnabled = false
        }
    }
    fun badCards() {
        val loseScreen = Intent(this, GameActivity1Level3LoseScreen::class.java)
        secLeft -= 3
        if (secLeft < 1) {
            countDownTimer.cancel()
            startActivity(loseScreen)
        }
    }
    fun goodCards() {
        queenCount++
        //makeText(this, "NICE!", Toast.LENGTH_SHORT).show()
        if (queenCount == 4) {
            val winScreen = Intent(this, GameActivity1Level3WinScreen::class.java)
            countDownTimer.cancel()
            startActivity(winScreen)
        }
    }
    override fun onPause() {
        super.onPause()
        countDownTimer.cancel()
    }
    fun positionXChangeLeft() = (350).toFloat()
    fun motionLeft(duration: Long = 1000) {
        val cardArray = arrayOf(eightOfSpades, nineOfClubs, fiveOfClubs, fourOfSpades, eightOfDiamonds, sixOfHearts, sevenOfDiamonds, twoOfHearts, sevenOfHearts, tenOfClubs, fourOfHearts, threeOfSpades)
        for (item in cardArray) {
            item.animate()
                .translationX(positionXChangeLeft())
                .setDuration(duration)
                .withEndAction(::motionRight)
        }
    }
    fun positionXChangeRight() = (-350).toFloat()
    fun motionRight(duration: Long = 1000) {
        val cardArray = arrayOf(eightOfSpades, nineOfClubs, fiveOfClubs, fourOfSpades, eightOfDiamonds, sixOfHearts, sevenOfDiamonds, twoOfHearts, sevenOfHearts, tenOfClubs, fourOfHearts, threeOfSpades)
        for (item in cardArray) {
            item.animate()
                .translationX(positionXChangeRight())
                .setDuration(duration)
                .withEndAction(::motionLeft)
        }
    }
}
