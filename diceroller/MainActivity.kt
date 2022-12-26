package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    //the beginning
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //doing button working
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)//makes number of dices that will be rolled
        val diceRoll = dice.roll()//rolling
        val resultTextView: TextView = findViewById(R.id.textView)// Update the screen with the dice roll
        resultTextView.text = diceRoll.toString()
    }
}