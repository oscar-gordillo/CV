package com.example.cv

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class WorkFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val cont: Context?= activity?.applicationContext;
        val v=inflater.inflate(R.layout.fragment_work, container, false)
        var s1 = resources.getStringArray(R.array.work_companies)
        var s2 = resources.getStringArray(R.array.work_positions)
        var s3 = resources.getStringArray(R.array.work_dates)
        var s4 = resources.getStringArray(R.array.work_tasks)
        var rv=v.findViewById<RecyclerView>(R.id.work_rv)
        rv.layoutManager=LinearLayoutManager(cont)
        val adapter=MyAdapter(cont!!,s1,s2,s3,s4)
        rv.adapter=adapter
        return v
    }


}