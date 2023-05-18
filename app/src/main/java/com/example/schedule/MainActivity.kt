package com.example.schedule

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.add_button)
        imageView.setOnClickListener {
            val intent = Intent(this, add_page::class.java)
            startActivity(intent)
        }


        lateinit var recyclerView: RecyclerView

        recyclerView = findViewById(R.id.taskRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val items = listOf(
            Item("Eat breakfast", "Description 1"),
            Item("Eat lunch", "Description 2"),
            Item("Eat supper", "Description 3"),
            Item("Sleep", "Description 4")
        )
        val adapter = ItemAdapter(items)
        recyclerView.adapter = adapter


    }
}
