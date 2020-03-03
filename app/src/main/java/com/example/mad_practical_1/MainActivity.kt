package com.example.mad_practical_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countUpButton: Button = findViewById(R.id.countUp_button)
        countUpButton.setOnClickListener { countUp() }
    }

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)

        val randomInt = (1..6).random()
        //resultText.text = "Dice Rolled!"
        resultText.text = randomInt.toString()

        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        val num = resultText.text.toString().toIntOrNull()

        if(num == null)
            resultText.text = 1.toString()
        else if(num < 6)
            resultText.text = (num + 1).toString()

    }
}
