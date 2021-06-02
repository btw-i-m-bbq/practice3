package com.mirea.veremeev.l.m.resultactivity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class DataActivity : AppCompatActivity() {
    private lateinit var universityEditText : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)
        universityEditText = findViewById(R.id.editTextUniversity)
    }

    fun sendResultOnMainActivityOnClick(view : View){
        val intent = Intent()
        intent.putExtra("name", universityEditText.text.toString())
        setResult(RESULT_OK, intent)
        finish()
    }
}