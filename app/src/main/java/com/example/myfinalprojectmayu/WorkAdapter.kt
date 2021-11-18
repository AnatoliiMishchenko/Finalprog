package com.example.myfinalprojectmayu

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class WorkAdapter(private val workList: List<String>) : RecyclerView.Adapter<WorkViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkViewHolder {
        val workItemViewHolder =
            LayoutInflater.from(parent.context).inflate(R.layout.user_item, parent, false)

        return WorkViewHolder(workItemViewHolder)
    }

    override fun onBindViewHolder(holder: WorkViewHolder, position: Int) {
        val workUser = workList[position]
        holder.bind(workUser)
    }

    override fun getItemCount(): Int {
        return workList.size

    }
}