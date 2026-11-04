package com.example.trippy

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val countText = findViewById<TextView>(R.id.countText)
        val next = findViewById<TextView>(R.id.Next)
        val prev = findViewById<TextView>(R.id.Prev)

        next.setOnClickListener {
            count++
            countText.text = count.toString()
        }

        prev.setOnClickListener {
            count--
            countText.text = count.toString()
        }
    }
}