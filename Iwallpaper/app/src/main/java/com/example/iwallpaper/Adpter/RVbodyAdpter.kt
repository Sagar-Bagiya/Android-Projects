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
import com.example.iwallpaper.Model.RVbodyModel
import com.example.iwallpaper.R

open class RVbodyAdpterv(val context: Context, val imgdata : ArrayList<RVbodyModel>) :
    RecyclerView.Adapter<RVbodyAdpterv.Viewholder>() {


    class Viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val bodyImage = itemView.findViewById<ImageView>(R.id.body_image)
        val bodyText = itemView.findViewById<TextView>(R.id.body_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        val view = LayoutInflater.from(context).inflate(R.layout.rv_body, parent, false )
        return Viewholder(view)
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        val model = imgdata.get(position)
//        holder.bodyImage.setImageResource(model.img_url)
        Glide.with(context)
            .load(model.img_url)
            .diskCacheStrategy(DiskCacheStrategy.NONE)
            .skipMemoryCache(true)
            .centerCrop()
            .placeholder(R.drawable.blank_img)

            .into(holder.bodyImage)
        holder.bodyText.text = model.img_name
    }

    override fun getItemCount(): Int {
        return imgdata.size
    }


}