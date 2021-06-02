package com.mirea.veremeev.l.m.resultactivity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var textViewResult : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textViewResult = findViewById<TextView>(R.id.textViewResult)
    }

    var resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val university : String? = result.data?.getStringExtra("name")
            if (university != null) {
                setUniversityTextView(university)
            }
        }
    }

    fun startDataActivityOnClick(view : View) {
        val intent = Intent(this, DataActivity::class.java)
        resultLauncher.launch(intent)
    }

    private fun setUniversityTextView (university : String){
        textViewResult.text = university
    }
}