package com.example.cardgame30

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class GameActivity : AppCompatActivity() {

    lateinit var cardImageView: ImageView




    val deck = Deck

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
    }
}