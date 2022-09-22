package com.example.cardzone

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class Card(var image : Int, var value : Int, var suit : String)

class GameActivity2 : AppCompatActivity() {

    lateinit var answerView : EditText
    var correctAnswer : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game2)
        supportActionBar?.hide()//REMOVES THE TOP ACTION BAR

        /*
        val deck = mutableListOf<Card>()
        val aceofspades = Card(R.drawable.aceofspades, 1, "spades")
        val aceofclovers = Card(R.drawable.aceofclovers, 1, "clovers")
        val aceofdiamonds = Card(R.drawable.aceofdiamonds, 1, "diamonds")
        val aceofhearts = Card(R.drawable.aceofhearts, 1, "hearts")
            deck.add(aceofspades)
            deck.add(aceofclovers)
            deck.add(aceofdiamonds)
            deck.add(aceofhearts)
        deck.shuffle()
        val currentCard = deck[2]
        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.setImageResource(currentCard.image)
        */


        /*
        createDeck() ///HERE
        deck.shuffle() ///HERE
        val currentCard = deck[3] ///HERE
        val imageView = findViewById<ImageView>(R.id.imageView) ///HERE
        imageView.setImageResource(currentCard.image) ///HERE
        */
        val changeCardButton = findViewById<Button>(R.id.changeCardButton)
        changeCardButton.setOnClickListener {
            shuffleCards()
        }


    }
    fun shuffleCards() {
        val deck = mutableListOf<Card>()
        val aceofspades = Card(R.drawable.aceofspades, 14, "spades")
        val aceofclovers = Card(R.drawable.aceofclovers, 14, "clovers")
        val aceofdiamonds = Card(R.drawable.aceofdiamonds, 14, "diamonds")
        val aceofhearts = Card(R.drawable.aceofhearts, 14, "hearts")
        deck.add(aceofspades)
        deck.add(aceofclovers)
        deck.add(aceofdiamonds)
        deck.add(aceofhearts)
        deck.shuffle()
        val currentCard = deck[2]
        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.setImageResource(currentCard.image)
    }
}