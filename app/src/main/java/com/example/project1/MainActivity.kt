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
        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)
        /*resultText.text = "Dice Rolled!"*/
        val randomInt = Random().nextInt(6) + 1
        val randomInt1 = Random().nextInt(6) + 1
        val randomInt2 = Random().nextInt(6) + 1
        resultText.text = randomInt.toString()
        resultText1.text = randomInt1.toString()
        resultText2.text= randomInt2.toString()
        /*val onscreenText = resultText.text.toString().toIntOrNull()*/

    }

    private fun countUP() {
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)

        if (resultText.text == "Hello world!" || resultText1.text == "Hello world!" || resultText2.text == "Hello world!") {
            resultText.text = "1"
            resultText1.text = "1"
            resultText2.text = "1"
        } else {
            var resulttext1 = resultText.text.toString().toInt()
            var resulttext2 = resultText1.text.toString().toInt()
            var resulttext3 = resultText2.text.toString().toInt()

            if (resulttext1 < 6 && resulttext2 < 6 && resulttext3 < 6) {
                resulttext1++
                resulttext2++
                resulttext3++
                resultText.text = resulttext1.toString()
                resultText1.text = resulttext2.toString()
                resultText2.text = resulttext3.toString()
            }
        }
    }

    private fun resetNum(){
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)
        resultText.text = "0"
        resultText1.text = "0"
        resultText2.text = "0"
    }
}
