package com.example.cardzone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class GameActivity1Level2WinScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_activity1_level2_win_screen)
        supportActionBar?.hide()//REMOVES THE TOP ACTION BAR
    }
}