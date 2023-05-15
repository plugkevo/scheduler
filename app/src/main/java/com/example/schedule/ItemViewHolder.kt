package com.example.schedule

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val itemNameTextView: TextView = itemView.findViewById(R.id.itemTextView)


    fun bind(item: Item) {
        itemNameTextView.text = item.name

    }
}
