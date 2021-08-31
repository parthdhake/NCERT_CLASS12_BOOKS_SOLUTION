package com.qourall.ncertclass12booksandsolution.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.qourall.ncertclass12booksandsolution.R
import kotlin.reflect.KFunction2

class IndexBooksAdapter(
    val mContext: Context,
    private val arrayList: Array<String>, var onClickItem: KFunction2<@ParameterName(
        name = "position"
    ) Int, @ParameterName(name = "view") View, Unit>
) : RecyclerView.Adapter<IndexBooksAdapter.IndexBooksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IndexBooksViewHolder {
        return IndexBooksViewHolder(LayoutInflater.from(mContext).inflate(R.layout.index_view , parent ,false ))
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: IndexBooksViewHolder, position: Int) {

        val data = arrayList[position]
        holder.text.text =  data

        holder.itemView.setOnClickListener{
            onClickItem(position , it)
        }

    }

    inner class IndexBooksViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val text : TextView = itemView.findViewById(R.id.index_text)
    }

}