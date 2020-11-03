package com.cronocode.intentrecyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cronocode.intentrecyclerview.R
import com.cronocode.intentrecyclerview.database.Child


class ChildAdapter(
    private val context: Context,
    private val childs: List<Child>,
    val listenerchild: (Child) -> Unit
) : RecyclerView.Adapter<ChildAdapter.ChildViewHolder>() {
    class ChildViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val child_Src = view.findViewById<ImageView>(R.id.child_image_src)
        val child_Bac = view.findViewById<ImageView>(R.id.child_bac_image)
        val child_Name = view.findViewById<TextView>(R.id.child_name)
        val child_Age = view.findViewById<TextView>(R.id.child_age)

        fun bindView(child: Child, listener: (Child) -> Unit) {
            child_Src.setImageResource(child.childSrc)
            child_Bac.setImageResource(child.childBac)
            child_Age.text = child.childAge
            child_Name.text = child.childName

            itemView.setOnClickListener { listener(child) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildViewHolder =
        ChildViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.activity_my_children,
                parent,
                false
            )
        )

    override fun getItemCount(): Int = childs.size

    override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {
        holder.bindView(childs[position], listenerchild)
    }
}