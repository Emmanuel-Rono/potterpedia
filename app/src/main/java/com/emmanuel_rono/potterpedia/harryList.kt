package com.emmanuel_rono.potterpedia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class harryList : Fragment(R.layout.fragment_harry_list) {
    private lateinit var todoAdapter:HarryAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       // val listview=view.findViewById<ListView>(R.id.listView)
        val recyclerview=view.findViewById<RecyclerView>(R.id.Recy)
       //val  listview = view.findViewById(R.id.listView)
        recyclerview.layoutManager = LinearLayoutManager(requireContext())
        recyclerview.hasFixedSize()
      recyclerview.adapter = todoAdapter
        todoAdapter.setOnItemClick(object:HarryAdapter.onItemClickLsitener{
            override fun onItemClick(position: Int) {

            }
        })

        }
}