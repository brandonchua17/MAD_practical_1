package com.example.mad_practical_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        //val countUpButton: Button = findViewById(R.id.countUp_button)
        //countUpButton.setOnClickListener { countUp() }
    }

    /*private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)

        val randomInt = (1..6).random()
        //resultText.text = "Dice Rolled!"
        resultText.text = randomInt.toString()

        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
    }*/

    private fun rollDice() {
        val randomInt = (1..6).random()

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)

        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
    }

    /*private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        val num = resultText.text.toString().toIntOrNull()

        if(num == null)
            resultText.text = 1.toString()
        else if(num < 6)
            resultText.text = (num + 1).toString()

        // If text is the default "Hello World!" set that text to 1.
        /*if (resultText.text == "Hello World!") {
            resultText.text = "1"
        } else {
            // Otherwise, increment the number up to 6.
            // The text value in resultText.text is an instance of the CharSequence class;
            // it needs to be converted to a String object before it can be converted to an int.
            var resultInt = resultText.text.toString().toInt()

            if (resultInt < 6) {
                resultInt++
                resultText.text = resultInt.toString()
            }
        }*/
    }*/
}
