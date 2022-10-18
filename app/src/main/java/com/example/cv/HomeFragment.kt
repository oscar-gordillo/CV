package com.example.cv

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {

    var listItems = ArrayList<String>(arrayListOf("Kotlin","Android"))
    var adapter: ArrayAdapter<String>? = null
    lateinit var lv : ListView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v= inflater.inflate(R.layout.fragment_home, container, false)
        val cont:Context?= activity?.applicationContext;
        lv=v.findViewById(R.id.home_lv) as ListView
        adapter = ArrayAdapter(cont!!,android.R.layout.simple_list_item_1,
            listItems)

        lv.adapter=adapter



        v.findViewById<FloatingActionButton>(R.id.home_fab).setOnClickListener {
            var et = v.findViewById<EditText>(R.id.home_new_skill_et)
            if(et.text.toString()!="") {
                listItems.add(et.text.toString())
                adapter?.notifyDataSetChanged()
                et.setText("")
            }
        }

        return v
    }


}