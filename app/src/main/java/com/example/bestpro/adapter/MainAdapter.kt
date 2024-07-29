package com.example.bestpro.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bestpro.databinding.ItemMainAdapterBinding


class MainAdapter(
    private val titleData: List<String>,
    private val onItemClicked: ((Int) -> Unit)?
) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.acbTitle.text = titleData[position]
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewHolder = ViewHolder(
            ItemMainAdapterBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
        viewHolder.binding.acbTitle.setOnClickListener {
            onItemClicked?.let {
                it(viewHolder.bindingAdapterPosition)
            }
        }
        return viewHolder
    }

    override fun getItemCount(): Int {
        return titleData.size
    }


    inner class ViewHolder(val binding: ItemMainAdapterBinding) :
        RecyclerView.ViewHolder(binding.root)
}



