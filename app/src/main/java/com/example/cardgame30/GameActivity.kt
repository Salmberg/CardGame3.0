package com.example.cardgame30

import android.media.Image
import android.media.TimedText
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class GameActivity : AppCompatActivity() {


    lateinit var roundTextView: TextView
    lateinit var scoreTextView: TextView
    lateinit var cardImageView: ImageView
    lateinit var questionTextView: TextView


    val deck = Deck

    var score: Int = 0
    var rounds: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)


        roundTextView = findViewById(R.id.roundTextView)
        scoreTextView = findViewById(R.id.scoreTextView)
        val higherButton = findViewById<Button>(R.id.higherButton)
        val lowerButton = findViewById<Button>(R.id.lowerButton)

        questionTextView = findViewById(R.id.questionTextView)
        cardImageView = findViewById(R.id.cardImageView)
        cardImageView.setImageResource(Deck.cards[0].image)


        roundTextView.text = "Omgång: $rounds"
        scoreTextView.text = "Poäng: $score"


        higherButton.setOnClickListener {
            deck.drawCard()
            rounds = rounds +1
            roundTextView.text = "Omgång: $rounds"

            if (deck.currentCard.number > deck.nextCard.number) {
                score = score + 1
                scoreTextView.text = "Poäng: $score"
            }

            cardImageView.setImageResource(deck.currentCard.image)
        }

        lowerButton.setOnClickListener {
            deck.drawCard()
            rounds = rounds +1
            roundTextView.text = "Omgång: $rounds"

            if (deck.currentCard.number < deck.nextCard.number) {
                score = score + 1
                scoreTextView.text = "Poäng: $score"
            }
            cardImageView.setImageResource(deck.currentCard.image)


        }
    }
}