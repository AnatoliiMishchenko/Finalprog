package com.example.myfinalprojectmayu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class WorkFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val workList: List<String> = listOf("Разработчик", "Дизаинер")
        val view = inflater.inflate(R.layout.fragment_work, container, false)



       val userRecycleView: RecyclerView =view.findViewById(R.id.work_user)
        userRecycleView.layoutManager =
        LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL, false)
       userRecycleView.adapter = WorkAdapter(workList)



        return view
    }


}