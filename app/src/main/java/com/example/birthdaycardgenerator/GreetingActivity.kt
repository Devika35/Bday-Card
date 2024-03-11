package com.example.birthdaycardgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GreetingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)


        val name = intent.getStringExtra("Name")

        findViewById<TextView>(R.id.tvName).text = name
    }
}