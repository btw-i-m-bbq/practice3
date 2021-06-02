package com.mirea.veremeev.l.m.practice3

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = intent.getStringExtra("date")
    }
}