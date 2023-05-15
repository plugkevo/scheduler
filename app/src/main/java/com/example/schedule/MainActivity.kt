package com.example.schedule


import android.content.Intent
import android.os.Build.VERSION_CODES.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.imageView3)
        imageView.setOnClickListener {
            val intent = Intent(this, add_page::class.java)
            startActivity(intent)
        }


         lateinit var recyclerView: RecyclerView

                recyclerView = findViewById(R.id.taskRecyclerView)
                recyclerView.layoutManager = LinearLayoutManager(this)

                val items = listOf(
                    Item("Item 1", "Description 1"),
                    Item("Item 2", "Description 2"),
                    Item("Item 3", "Description 3")
                )
                val adapter = ItemAdapter(items)
                recyclerView.adapter = adapter


    }
}