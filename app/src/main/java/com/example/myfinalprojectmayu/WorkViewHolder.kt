package com.example.myfinalprojectmayu

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

class WorkViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(workUser: String) {
        val workUserTextView: TextView = itemView.findViewById(R.id.work_name)
        workUserTextView.text = workUser

        itemView.setOnClickListener {
            showSnackBar(it)
        }
    }
        private fun showSnackBar(it: View) {
            Snackbar.make( itemView, "Мое приложение!!", Snackbar.LENGTH_LONG)
                .setAction("Actoin") {
                    Toast.makeText(itemView.context, "https://github.com/AnatoliiMishchenko/Finalprog", Toast.LENGTH_LONG).show()
                }
                .show()

    }
}