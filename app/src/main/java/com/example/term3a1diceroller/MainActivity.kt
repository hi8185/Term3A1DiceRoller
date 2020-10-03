package com.example.term3a1diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialize total in a scope the buttons can access
        var total = 0;


        //when the roll button is clicked, creates an integer from 1-6, displays it,
        //adds it to the total, and displays that
        roll_btn.setOnClickListener() {
            val roll = Random.nextInt(1, 7);
            val rollString = roll.toString();
            total += roll;
            result_txt.text = rollString;
            totalDisplay(total)
        }

        //when the reset button is clicked, sets all text fields that can be changed by the user
        //back to their default
        reset_btn.setOnClickListener() {
            result_txt.text = " ";
            total = 0;
            totalDisplay(total);
        }
    }

    //displays the total on the screen in the desired text field
    private fun totalDisplay(num: Int) {
        var totalText = "Total= $num";
        total_txt.text = totalText;
    }

}
