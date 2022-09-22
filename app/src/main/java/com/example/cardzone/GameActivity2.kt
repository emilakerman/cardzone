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

        //QA
        answerView = findViewById(R.id.answerView)
        val answerButton = findViewById<Button>(R.id.answerButton)
        answerButton.setOnClickListener {
            submitButton()
        }

        //SHUFFLE
        val changeCardButton = findViewById<Button>(R.id.changeCardButton)
        changeCardButton.setOnClickListener {
            shuffleCards()
        }


    }
    fun submitButton() {
        
    }
    fun shuffleCards() {
        val deck = mutableListOf<Card>()
        val aceofSpades = Card(R.drawable.aceofspades, 14, "spades")
        val aceofClubs = Card(R.drawable.aceofclubs, 14, "clubs")
        val aceofDiamonds = Card(R.drawable.aceofdiamonds, 14, "diamonds")
        val aceofHearts = Card(R.drawable.aceofhearts, 14, "hearts")
        val tenofClubs = Card(R.drawable.tenofclubs, 10, "clubs")
        val tenofDiamonds = Card(R.drawable.tenofdiamonds, 10, "diamonds")
        val tenofHearts = Card(R.drawable.tenofhearts, 10, "hearts")
        val tenofSpades = Card(R.drawable.tenofspades, 10, "spades")
        val twoofClubs = Card(R.drawable.twoofclubs, 2, "clubs")
        val twoofDiamonds = Card(R.drawable.twoofdiamonds, 2, "diamonds")
        val twoofHearts = Card(R.drawable.twoofhearts, 2, "hearts")
        val twoofSpades = Card(R.drawable.twoofspades, 2, "spades")
        val threeofClubs = Card(R.drawable.threeofclubs, 3, "clubs")
        val threeofDiamonds = Card(R.drawable.threeofdiamonds, 3, "diamonds")
        val threeofHearts = Card(R.drawable.threeofhearts, 3, "hearts")
        val threeofSpades = Card(R.drawable.threeofspades, 3, "spades")
        val fourofClubs = Card(R.drawable.fourofclubs, 4, "clubs")
        val fourofDiamonds = Card(R.drawable.fourofdiamonds, 4, "diamonds")
        val fourofHearts = Card(R.drawable.fourofhearts, 4, "hearts")
        val fourofSpades = Card(R.drawable.fourofspades, 4, "spades")
        val fiveofClubs = Card(R.drawable.fiveofclubs, 5, "clubs")
        val fiveofDiamonds = Card(R.drawable.fiveofdiamonds, 5, "diamonds")
        val fiveofHearts = Card(R.drawable.fiveofhearts, 5, "hearts")
        val fiveofSpades = Card(R.drawable.fiveofspades, 5, "spades")
        val sixofClubs = Card(R.drawable.sixofclubs, 6, "clubs")
        val sixofDiamonds = Card(R.drawable.sixofdiamonds, 6, "diamonds")
        val sixofHearts = Card(R.drawable.sixofhearts, 6, "hearts")
        val sixofSpades = Card(R.drawable.sixofspades, 6, "spades")
        val sevenofClubs = Card(R.drawable.sevenofclubs, 7, "clubs")
        val sevenofDiamonds = Card(R.drawable.sevenofdiamonds, 7, "diamonds")
        val sevenofHearts = Card(R.drawable.sevenofhearts, 7, "hearts")
        val sevenofSpades = Card(R.drawable.sevenofspades, 7, "spades")
        val eightofClubs = Card(R.drawable.eightofclubs, 8, "clubs")
        val eightofDiamonds = Card(R.drawable.eightofdiamonds, 8, "diamonds")
        val eightofHearts = Card(R.drawable.eightofhearts, 8, "hearts")
        val eightofSpades = Card(R.drawable.eightofspades, 8, "spades")
        val nineofClubs = Card(R.drawable.nineofclubs, 9, "clubs")
        val nineofDiamonds = Card(R.drawable.nineofdiamonds, 9, "diamonds")
        val nineofHearts = Card(R.drawable.nineofhearts, 9, "hearts")
        val nineofSpades = Card(R.drawable.nineofspades, 9, "spades")
        val jackofClubs = Card(R.drawable.jackofclubs, 11, "clubs")
        val jackofDiamonds = Card(R.drawable.jackofdiamonds, 11, "diamonds")
        val jackofHearts = Card(R.drawable.jackofhearts, 11, "hearts")
        val jackofSpades = Card(R.drawable.jackofspades, 11, "spades")
        val queenofClubs = Card(R.drawable.queenofclubs, 12, "clubs")
        val queenofDiamonds = Card(R.drawable.queenofdiamonds, 12, "diamonds")
        val queenofHearts = Card(R.drawable.queenofhearts, 12, "hearts")
        val queenofSpades = Card(R.drawable.queenofspades, 12, "spades")
        val kingofClubs = Card(R.drawable.kingofclubs, 13, "clubs")
        val kingofDiamonds = Card(R.drawable.kingofdiamonds, 13, "diamonds")
        val kingofHearts = Card(R.drawable.kingofhearts, 13, "hearts")
        val kingofSpades = Card(R.drawable.kingofspades, 13, "spades")

        deck.add(aceofSpades)
        deck.add(aceofClubs)
        deck.add(aceofDiamonds)
        deck.add(aceofHearts)
        deck.add(kingofClubs)
        deck.add(kingofDiamonds)
        deck.add(kingofHearts)
        deck.add(kingofSpades)
        deck.add(queenofClubs)
        deck.add(queenofDiamonds)
        deck.add(queenofHearts)
        deck.add(queenofSpades)
        deck.add(jackofClubs)
        deck.add(jackofDiamonds)
        deck.add(jackofHearts)
        deck.add(jackofSpades)
        deck.add(tenofClubs)
        deck.add(tenofDiamonds)
        deck.add(tenofHearts)
        deck.add(tenofSpades)
        deck.add(nineofClubs)
        deck.add(nineofDiamonds)
        deck.add(nineofHearts)
        deck.add(nineofSpades)
        deck.add(eightofClubs)
        deck.add(eightofDiamonds)
        deck.add(eightofHearts)
        deck.add(eightofSpades)
        deck.add(sevenofClubs)
        deck.add(sevenofDiamonds)
        deck.add(sevenofHearts)
        deck.add(sevenofSpades)
        deck.add(sixofClubs)
        deck.add(sixofDiamonds)
        deck.add(sixofHearts)
        deck.add(sixofSpades)
        deck.add(fiveofClubs)
        deck.add(fiveofDiamonds)
        deck.add(fiveofHearts)
        deck.add(fiveofSpades)
        deck.add(fourofClubs)
        deck.add(fourofDiamonds)
        deck.add(fourofHearts)
        deck.add(fourofSpades)
        deck.add(threeofClubs)
        deck.add(threeofDiamonds)
        deck.add(threeofHearts)
        deck.add(threeofSpades)
        deck.add(twoofClubs)
        deck.add(twoofDiamonds)
        deck.add(twoofHearts)
        deck.add(twoofSpades)



        deck.shuffle()
        val currentCard = deck[2]
        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.setImageResource(currentCard.image)
        //TEXT
        var textView5 = findViewById<TextView>(R.id.textView5)
        textView5.text = currentCard.value.toString()
    }

}