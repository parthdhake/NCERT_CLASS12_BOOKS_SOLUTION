package com.qourall.ncertclass12booksandsolution.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.qourall.ncertclass12booksandsolution.R
import com.qourall.ncertclass12booksandsolution.data.model.Details

class SolutionsAdapter(val mContext : Context, val arrayList: ArrayList<Details>) : RecyclerView.Adapter<SolutionsAdapter.SolutionsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SolutionsViewHolder {
        return SolutionsViewHolder(
            LayoutInflater.from(mContext).inflate(R.layout.grid_view, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: SolutionsViewHolder, position: Int) {

        val data = arrayList[position]
        Glide.with(mContext)
            .load(data.image)
            .into(holder.image)
        holder.text.text = data.text
    }


    inner class SolutionsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView = itemView.findViewById<ImageView>(R.id.icon_image_view)
        var text: TextView = itemView.findViewById<TextView>(R.id.title_text_view)
    }
}