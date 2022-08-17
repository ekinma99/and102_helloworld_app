package com.ekinma99.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.helloButton)
        button.setOnClickListener {
//            Log.v("Hello world", "Button clicked") // Can use log to debug
              Toast.makeText(this, "Hello to you too!", Toast.LENGTH_SHORT).show()
        }
    }
}