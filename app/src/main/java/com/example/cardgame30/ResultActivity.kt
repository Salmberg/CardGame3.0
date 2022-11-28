package com.example.cardgame30

import android.content.Intent
import android.os.Build.VERSION_CODES.M
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    lateinit var finishedTextView: TextView
    lateinit var resultTextView: TextView
    lateinit var betterTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        finishedTextView = findViewById(R.id.finishedTextView)
        resultTextView = findViewById(R.id.resultTextView)
        betterTextView = findViewById(R.id.betterTextView)

        val betterButton = findViewById<Button>(R.id.betterButton)
        val finishButton = findViewById<Button>(R.id.finishButton)


        betterButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        finishButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}