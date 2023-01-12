package com.example.iwallpaper.Adpter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.iwallpaper.Model.RVheadModel
import com.example.iwallpaper.R

class RVheadAdpter(val context : Context, val dataArray : ArrayList<RVheadModel>) :
    RecyclerView.Adapter<RVheadAdpter.Viewholder>() {

    class Viewholder( itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image_view : ImageView = itemView.findViewById(R.id.imageView)
        var text_view : TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        val view = LayoutInflater.from(context).inflate(R.layout.rv_head, parent, false)
        val vh = Viewholder(view)
        return vh
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        val model  = dataArray.get(position)
        holder.text_view.text = model.img_name
//        holder.image_view.setImageResource(model.img_url)
//        Glide.with(context).load(model.img_url).into(holder.image_view)
        Glide.with(context)
            .load(model.img_url)
            .diskCacheStrategy(DiskCacheStrategy.NONE)
            .skipMemoryCache(true)
            .into(holder.image_view)

    }

    override fun getItemCount(): Int {
       return dataArray.size
    }


}