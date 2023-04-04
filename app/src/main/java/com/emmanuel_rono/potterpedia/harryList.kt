package com.emmanuel_rono.potterpedia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
class harryList() : Fragment(R.layout.fragment_harry_list) {
    private lateinit var todoAdapter:HarryAdapter
    private lateinit var character:List<PotterDataItem>
    lateinit var bundle: Bundle
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // val listview=view.findViewById<ListView>(R.id.listView)
        val recyclerview = view.findViewById<RecyclerView>(R.id.Recy)
        //val  listview = view.findViewById(R.id.listView)
        recyclerview.layoutManager = LinearLayoutManager(requireContext())
        recyclerview.hasFixedSize()
        recyclerview.adapter = todoAdapter

    }}




