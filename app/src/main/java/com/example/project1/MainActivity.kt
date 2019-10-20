package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countupButton: Button = findViewById(R.id.countup_button)
        countupButton.setOnClickListener { countUP() }

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { resetNum() }
    }

    private fun rollDice() {
        /* Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()*/

        val resultText: TextView = findViewById(R.id.result_text)
        /*resultText.text = "Dice Rolled!"*/
        val randomInt = Random().nextInt(6) + 1
        resultText.text = randomInt.toString()

    }

    private fun countUP() {
        val resultText: TextView = findViewById(R.id.result_text)

        if (resultText.text == "Hello world!") {
            resultText.text = "1"
        } else {
            var resulttext1 = resultText.text.toString().toInt()

            if (resulttext1 < 6) {
                resulttext1++
                resultText.text = resulttext1.toString()
            }
        }
    }

    private fun resetNum(){
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "0"
    }
}
