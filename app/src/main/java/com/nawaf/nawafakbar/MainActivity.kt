package com.nawaf.nawafakbar

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn1 = findViewById<Button>(R.id.button1)
        btn1.setOnClickListener(){
            val pindah = Intent(this, Pagesatu::class.java)
            startActivity(pindah)
        }

        val btn2 = findViewById<Button>(R.id.button2)
        btn2.setOnClickListener(){
            val pindah = Intent(this, Pagedua::class.java)
            startActivity(pindah)
        }

        val btn3 = findViewById<Button>(R.id.button3)
        btn3.setOnClickListener(){
            val pindah = Intent(this, GaleryCard::class.java)
            startActivity(pindah)
        }
    }
}