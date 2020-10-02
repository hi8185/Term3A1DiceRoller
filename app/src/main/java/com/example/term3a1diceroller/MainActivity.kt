package com.example.term3a1diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialization of certain values as requested in instructions
        var total = 0;
        result_et.setText(" ");

        //when the roll button is clicked, creates an integer from 1-6, displays it,
        //adds it to the total, and displays that
        roll_btn.setOnClickListener() {
            var roll = Random.nextInt(1, 6);
            total += roll;
            result_et.setText(roll);
            total_txt.text = "Total= " + total.toString();
        }

        //when the reset button is clicked, sets all text fields that can be changed by the user
        //back to their default
        reset_btn.setOnClickListener() {
            result_et.setText(" ");
            total = 0;
            total_txt.text = "Total= " + total.toString();
        }
    }
}
