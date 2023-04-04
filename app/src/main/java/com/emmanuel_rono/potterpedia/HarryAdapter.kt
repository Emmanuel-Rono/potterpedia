package com.emmanuel_rono.potterpedia

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.AsyncDifferConfig
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.emmanuel_rono.potterpedia.databinding.DatalayoutBinding
import java.util.Collections.list
import java.util.EventListener
import java.util.Objects
class HarryAdapter(val dataItem: List<PotterDataItem>):RecyclerView.Adapter<HarryAdapter.myViewHolder>() {

    inner class myViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nametext:TextView=itemView.findViewById(R.id.Name_text)
        val Speciestext:TextView=itemView.findViewById(R.id.species_text)

    }
    private val diffCallback = object : DiffUtil.ItemCallback<PotterDataItem>() {
        override fun areItemsTheSame(oldItem: PotterDataItem, newItem: PotterDataItem): Boolean {
            return oldItem.id == newItem.id
        }
        override fun areContentsTheSame(oldItem: PotterDataItem, newItem: PotterDataItem): Boolean {
            return oldItem == newItem
        }
    }
    private val difference = AsyncListDiffer(this, diffCallback)
    var potterData:List<PotterDataItem>
        get() = difference.currentList
        set(value) {
            difference.submitList(value)
        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HarryAdapter.myViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.datalayout,parent,false)
        return myViewHolder(view)

    }
    override fun onBindViewHolder(holder: HarryAdapter.myViewHolder, position: Int) {
        val data=dataItem[position]
 holder.Speciestext.text=data.species
        holder.nametext.text=data.name
    }

    override fun getItemCount(): Int {

        return  dataItem.size
    }

}