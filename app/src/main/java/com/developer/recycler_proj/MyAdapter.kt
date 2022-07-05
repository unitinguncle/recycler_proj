package com.developer.recycler_proj

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val students: List<student>): RecyclerView.Adapter<MyAdapter.MyViewholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewholder {
        val inflator :LayoutInflater = LayoutInflater.from(parent.context)
        val view = inflator.inflate(R.layout.item_view, parent, false)
        return MyViewholder(view)
    }

    override fun onBindViewHolder(holder: MyViewholder, position: Int) {
        holder.txtTitle.text = students[position].title
        holder.txtDescription.text = students[position].description
    }

    override fun getItemCount(): Int {
        return students.size
    }
    class MyViewholder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var txtTitle = itemView.findViewById<TextView>(R.id.txtTitle)
        var txtDescription = itemView.findViewById<TextView>(R.id.txtDescription)
    }
}

