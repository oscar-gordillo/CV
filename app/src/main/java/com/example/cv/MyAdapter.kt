package com.example.cv

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.work_detail.view.*

class MyAdapter(var context: Context
, var text1 :Array<String>
, var text2:Array<String>
                , var text3:Array<String>
                , var text4:Array<String>
): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.work_detail, parent, false)
        return MyViewHolder(v);
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.linearlayout.apply {
            work_company_name.text=text1[position]
            work_position.text=text2[position]
            work_dates.text=text3[position]
            work_tasks.text=text4[position]
        }
    }

    override fun getItemCount(): Int {
        return text1.size
    }
}