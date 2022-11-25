package com.example.cardgame30

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    lateinit var headLineTextView: TextView
    lateinit var infoTextView: TextView
    lateinit var readyTextView: TextView
    lateinit var startButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        headLineTextView = findViewById(R.id.headlineTextView)
        infoTextView = findViewById(R.id.infoTextView)
        readyTextView = findViewById(R.id.readyTextView)

        val startButton = findViewById<Button>(R.id.startButton)

        startButton.setOnClickListener {
            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)
        }
    }
}