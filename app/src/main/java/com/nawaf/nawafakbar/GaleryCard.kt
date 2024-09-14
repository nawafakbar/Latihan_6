package com.nawaf.nawafakbar

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import com.nawaf.nawafakbar.adapter.AdapterGambar

class GaleryCard : AppCompatActivity() {

    private val imageList = arrayOf(
        R.drawable.page1,
        R.drawable.page2,
        R.drawable.page3,
        R.drawable.page4,
        R.drawable.page5,
        R.drawable.page6
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galery_card)

        val gridView = findViewById<GridView>(R.id.gridView)
        val adapter = AdapterGambar(this, imageList)
        gridView.adapter = adapter


        gridView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, DetailGambar::class.java)
            intent.putExtra("data", imageList[position])
            startActivity(intent)
        }




        }
    }