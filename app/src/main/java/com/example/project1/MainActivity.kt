package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.view.*
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    lateinit var diceImage1 : ImageView
    lateinit var diceImage2: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        diceImage = findViewById(R.id.dice_image)
        diceImage1 = findViewById(R.id.dice_image1)
        diceImage2 = findViewById(R.id.dice_image2)

        val countupButton: Button = findViewById(R.id.countup_button)
        countupButton.setOnClickListener { countUP() }

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { resetNum() }
    }

    private fun rollDice() {
        /* Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()*/
        val randomInt = Random().nextInt(6) + 1
        val randomInt1 = Random().nextInt(6) + 1
        val randomInt2 = Random().nextInt(6) + 1

        val resultText: TextView = findViewById(R.id.result_text)
        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)
        /*resultText.text = "Dice Rolled!"*/

        resultText.text = randomInt.toString()
        resultText1.text = randomInt1.toString()
        resultText2.text = randomInt2.toString()
       /*  val onscreenText = resultText.text.toString().toIntOrNull()*/

        /*val diceImage : ImageView = findViewById(R.id.dice_image)
        val diceImage1: ImageView = findViewById(R.id.dice_image1)
        val diceImage2: ImageView = findViewById(R.id.dice_image2)*/
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val drawableResource1 = when (randomInt1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val drawableResource2 = when (randomInt2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        diceImage1.setImageResource(drawableResource1)
        diceImage2.setImageResource(drawableResource2)

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


           if (resulttext1 < 6 || resulttext2 < 6 || resulttext3 < 6) {
               resulttext1++
               resulttext2++
               resulttext3++
               resultText.text = resulttext1.toString()
               resultText1.text = resulttext2.toString()
               resultText2.text = resulttext3.toString()
               val drawableResource = when (resulttext1) {
                   1 -> R.drawable.dice_1
                   2 -> R.drawable.dice_2
                   3 -> R.drawable.dice_3
                   4 -> R.drawable.dice_4
                   5 -> R.drawable.dice_5
                   else -> R.drawable.dice_6
               }
               val drawableResource1 = when (resulttext2) {
                   1 -> R.drawable.dice_1
                   2 -> R.drawable.dice_2
                   3 -> R.drawable.dice_3
                   4 -> R.drawable.dice_4
                   5 -> R.drawable.dice_5
                   else -> R.drawable.dice_6
               }
               val drawableResource2 = when (resulttext3) {
                   1 -> R.drawable.dice_1
                   2 -> R.drawable.dice_2
                   3 -> R.drawable.dice_3
                   4 -> R.drawable.dice_4
                   5 -> R.drawable.dice_5
                   else -> R.drawable.dice_6
               }
               diceImage.setImageResource(drawableResource)
               diceImage1.setImageResource(drawableResource1)
               diceImage2.setImageResource(drawableResource2)
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
        diceImage.setImageResource(R.drawable.empty_dice)
        diceImage1.setImageResource(R.drawable.empty_dice)
        diceImage2.setImageResource(R.drawable.empty_dice)
    }
}
