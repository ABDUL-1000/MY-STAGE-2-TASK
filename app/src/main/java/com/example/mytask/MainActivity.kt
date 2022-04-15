package com.example.mytask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn: Button = findViewById(R.id.button)
        btn.setOnClickListener {
            btnRoll()
        }
    }

    private fun btnRoll() {
        val lifeStyle: Array<String> =
            arrayOf("Harworking", "somewhat lazy", "very lazy", "hard working", "lazy");
        val randomLiveStyle = lifeStyle.random()
        val textResult: TextView = findViewById(R.id.textView2)
        textResult.text = randomLiveStyle
    }
}



