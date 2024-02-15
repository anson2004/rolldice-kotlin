package com.selflystore.rolldice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_result_img)
        val rollBtn : Button = findViewById(R.id.roll_btn)
        rollBtn.text = "Roll it"
        rollBtn.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {
        val rngInd = Random().nextInt(6) +1
        val diceSrc = when(rngInd) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }


        diceImage.setImageResource(diceSrc)

    }


}