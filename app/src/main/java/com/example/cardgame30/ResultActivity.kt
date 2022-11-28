package com.example.cardgame30

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import nl.dionsegijn.konfetti.core.Party
import nl.dionsegijn.konfetti.core.Position
import nl.dionsegijn.konfetti.core.emitter.Emitter
import nl.dionsegijn.konfetti.xml.KonfettiView
import java.util.concurrent.TimeUnit

class ResultActivity : AppCompatActivity() {

    lateinit var finishedTextView: TextView
    lateinit var resultTextView: TextView
    lateinit var betterTextView: TextView
    lateinit var konfettiView: KonfettiView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        konfettiView = findViewById(R.id.konfettiView)
        finishedTextView = findViewById(R.id.finishedTextView)
        resultTextView = findViewById(R.id.resultTextView)
        betterTextView = findViewById(R.id.betterTextView)

        val betterButton = findViewById<Button>(R.id.betterButton)
        val finishButton = findViewById<Button>(R.id.finishButton)

        val bundle = intent.extras
        val score = bundle!!.getInt("Final score")

        resultTextView.text = "Du skrapade ihop $score poäng!"
        betterTextView.text = "Snyggt, men bättre kan du!"

        konfettiView.start(Party(
            speed = 0f,
            maxSpeed = 30f,
            damping = 0.9f,
            spread = 500,
            colors = listOf(0xfce18a, 0xff726d, 0xf4306d, 0xb48def),
            emitter = Emitter(duration = 100, TimeUnit.MILLISECONDS).max(100),
            position = Position.Relative(0.5, 0.3)
        )
        )


        betterButton.setOnClickListener {
            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)
        }
        finishButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}