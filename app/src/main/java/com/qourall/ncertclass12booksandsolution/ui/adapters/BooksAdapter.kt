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
import kotlin.reflect.KFunction2

class BooksAdapter(
    private val mContext: Context, private val arrayList: ArrayList<Details>, var onClickItem: KFunction2<@ParameterName(
        name = "position"
    ) Int, @ParameterName(name = "view") View, Unit>
) : RecyclerView.Adapter<BooksAdapter.BooksViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        return BooksViewHolder(LayoutInflater.from(mContext).inflate(R.layout.grid_view , parent ,false))
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {

        val data = arrayList[position]
        Glide.with(mContext)
            .load(data.image)
            .into(holder.image)

        holder.text.text = data.text

        holder.itemView.setOnClickListener{
            onClickItem(position , it)
        }

    }


    inner class BooksViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var image: ImageView = itemView.findViewById(R.id.icon_image_view)
        var text: TextView = itemView.findViewById(R.id.title_text_view)

    }
}

