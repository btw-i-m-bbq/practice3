package com.mirea.veremeev.l.m.systemintentsapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickCall(view : View){
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse("tel:88005553535")
        startActivity(intent)
    }
    fun onClickOpenBrowser(view : View){
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("https://developer.android.com")
        startActivity(intent)
    }
    fun onClickOpenMaps(view : View){
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("geo:43.9783,15.3830")
        startActivity(intent)
    }
}