package com.example.cardzone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var quitButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //QUIT BUTTON
        quitButton = findViewById(R.id.quitButton)
        quitButton.setOnClickListener { finishAffinity() }



    }
}