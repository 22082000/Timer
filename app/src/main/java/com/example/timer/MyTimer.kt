package com.example.timer

import android.os.CountDownTimer
import android.widget.TextView


class MyTimer(
    val second: Long
): CountDownTimer(second * 1000, 1000) {

    override fun onTick(millisUntilFinished: Long) {

    }

    override fun onFinish() {

    }
}