package com.mirea.veremeev.l.m.simplefragmentapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    lateinit var fragment1 : Fragment
    lateinit var fragment2 : Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragment1 = BlankFragment()
        fragment2 = BlankFragment()
    }

    fun onClick(view : View){
        val fragmentManager = supportFragmentManager
        when(view.id){
            R.id.btnFragment1 -> fragmentManager.beginTransaction().replace(R.id.fragmentContainer,
                fragment1).commit()
            R.id.btnFragment2 -> fragmentManager.beginTransaction().replace(R.id.fragmentContainer,
                fragment2).commit()
        }
    }
}