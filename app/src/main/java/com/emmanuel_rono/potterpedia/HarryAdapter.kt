package com.emmanuel_rono.potterpedia

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncDifferConfig
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.emmanuel_rono.potterpedia.databinding.DatalayoutBinding
import java.util.Collections.list
import java.util.Objects


class HarryAdapter:RecyclerView.Adapter<HarryAdapter.myViewHolder>() {
    inner class myViewHolder(binding: DatalayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        val name_text = binding.Name
        val Species = binding.Species
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
    var potterData: List<PotterDataItem>
        get() = difference.currentList
        set(value) {
            difference.submitList(value)
        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HarryAdapter.myViewHolder {
      return myViewHolder(DatalayoutBinding.inflate(LayoutInflater.from(parent.context),
      parent,false))
    }

    override fun onBindViewHolder(holder: HarryAdapter.myViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
    override fun getItemCount()=PotterData.
    }
}