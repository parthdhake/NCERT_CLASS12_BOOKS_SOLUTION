
package com.qourall.ncertclass12booksandsolution.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.qourall.ncertclass12booksandsolution.R
import kotlin.reflect.KFunction2

class InBooksAdapter(
    private val mContext: Context, private val arrayList: Array<String>, var onClickItem: KFunction2<@ParameterName(
    name = "position"
) Int, @ParameterName(name = "view") View, Unit>
) :  RecyclerView.Adapter<InBooksAdapter.InBooksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InBooksViewHolder {
        return InBooksViewHolder(
            LayoutInflater.from(mContext).inflate(R.layout.item_book, parent, false)
        )
    }
    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: InBooksViewHolder, position: Int) {
        holder.text.text = arrayList[position]

        holder.itemView.setOnClickListener {
            onClickItem( position , it)

        }
    }


    inner class InBooksViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val text : TextView= itemView.findViewById(R.id.text)
    }
}
