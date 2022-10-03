package com.example.cardzone

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.graphics.drawable.Drawable
import android.media.Image
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.coroutines.NonCancellable.cancel


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

    var timer1 = 1000
    var interval = 1000
    var infuture = 30000

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
        object : CountDownTimer(infuture.toLong(), interval.toLong()) {
            override fun onTick(millisUntilFinished: Long) {
                textField.text = "Seconds remaining: " + millisUntilFinished / timer1
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
        }
        nineOfClubs.setOnClickListener {
            nineOfClubs.setImageResource(R.drawable.red_joker)
            badCards()
        }
        fourOfSpades.setOnClickListener {
            fourOfSpades.setImageResource(R.drawable.red_joker)
            badCards()
        }
        fiveOfClubs.setOnClickListener {
            fiveOfClubs.setImageResource(R.drawable.red_joker)
            badCards()
        }
        eightOfDiamonds.setOnClickListener {
            eightOfDiamonds.setImageResource(R.drawable.red_joker)
            badCards()
        }
        sixOfHearts.setOnClickListener {
            sixOfHearts.setImageResource(R.drawable.queenofdiamonds)
            crown2.setImageResource(R.drawable.crown)
            goodCards()
        }
        sevenOfDiamonds.setOnClickListener {
            sevenOfDiamonds.setImageResource(R.drawable.red_joker)
            badCards()
        }
        twoOfHearts.setOnClickListener {
            twoOfHearts.setImageResource(R.drawable.queenofhearts)
            crown3.setImageResource(R.drawable.crown)
            goodCards()
        }
        sevenOfHearts.setOnClickListener {
            sevenOfHearts.setImageResource(R.drawable.red_joker)
            badCards()
        }
        tenOfClubs.setOnClickListener {
            tenOfClubs.setImageResource(R.drawable.red_joker)
            badCards()
        }
        fourOfHearts.setOnClickListener {
            fourOfHearts.setImageResource(R.drawable.red_joker)
            badCards()
        }
        threeOfSpades.setOnClickListener {
            threeOfSpades.setImageResource(R.drawable.queenofspades)
            crown4.setImageResource(R.drawable.crown)
            goodCards()
        }

    }
    fun badCards() {
        timer1 += 200
    }
    fun goodCards() {
        queenCount++
        if (queenCount == 4) {
            val winScreen = Intent(this, GameActivity1Level3WinScreen::class.java)
            countDownTimer.cancel()
            startActivity(winScreen)
        }
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
