package com.example.myfinalprojectmayu

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class WorkViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(workUser: String) {
        val workUserTextView: TextView = itemView.findViewById(R.id.work_name)
        workUserTextView.text = workUser

        itemView.setOnClickListener {
            Toast.makeText(itemView.context, workUser, Toast.LENGTH_LONG).show()
        }

    }
}