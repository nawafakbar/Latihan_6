package com.nawaf.nawafakbar

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailGambar : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_gambar)

        val ImagesResId = intent.getIntExtra("data", 0)

        val imageView = findViewById<ImageView>(R.id.imageViewDetail)
        imageView.setImageResource(ImagesResId)

    }
}