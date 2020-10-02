package com.afrodroid.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton: Button = findViewById<Button>(R.id.roll_button)
        val resultText: TextView = findViewById<TextView>(R.id.result_text)

        rollbutton.text = "Let's Roll"
        rollbutton.setOnClickListener() {
            rollDice()
        }

    }

    private fun rollDice() {
       val randomInt = Random().nextInt(6) + 1
        result_text.text = randomInt.toString()

    }
}