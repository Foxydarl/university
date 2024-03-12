package com.example.university

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.Timer
import java.util.TimerTask

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, MainList::class.java)
        val timer = Timer()
        val task = object : TimerTask() {
            override fun run() {
                startActivity(intent)
                timer.cancel()
            }
        }
        timer.scheduleAtFixedRate(task, 3000, 10)

    }
}