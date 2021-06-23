package com.example.timer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val button = this.findViewById<Button>(R.id.tab_me_btn)
        val txtSeconds = this.findViewById<EditText>(R.id.text_view3)

        val myTimer = object : CountDownTimer(30000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                txtSeconds.setText((millisUntilFinished / 1000).toString())
            }

            override fun onFinish() {
                txtSeconds.setText("конец")
            }

        }

        button.setOnClickListener {
            
        }


    }
}