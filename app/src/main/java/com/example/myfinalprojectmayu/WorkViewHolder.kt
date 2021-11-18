package com.example.myfinalprojectmayu

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WorkViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(workUser: String) {
        val workUserTextView: TextView = itemView.findViewById(R.id.work_name)
        workUserTextView.text = workUser

    }
}