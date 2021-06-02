package com.mirea.veremeev.l.m.practice3

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    public fun onClickSendDate(view : View){
        val dateInMillis = System.currentTimeMillis()
        val format = "yyyy-MM-dd HH:mm:ss"
        val sdf = SimpleDateFormat(format)
        val dateString = sdf.format(Date(dateInMillis))

        val intent = Intent(this, SecondaryActivity::class.java).apply {
            putExtra("date", dateString)
        }
        startActivity(intent)
    }
}