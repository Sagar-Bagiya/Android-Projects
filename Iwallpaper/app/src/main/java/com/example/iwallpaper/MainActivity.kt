package com.example.iwallpaper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.HORIZONTAL
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.iwallpaper.Adpter.RVbodyAdpterv
import com.example.iwallpaper.Adpter.RVheadAdpter
import com.example.iwallpaper.Model.RVbodyModel
import com.example.iwallpaper.Model.RVheadModel

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var search_bar : EditText
    private  lateinit var rvhead : RecyclerView
    private lateinit var rvbody : RecyclerView
    val dataArray = ArrayList<RVheadModel>()
    val imgArray = ArrayList<RVbodyModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        search_bar = findViewById(R.id.search_bar)
        rvhead = findViewById(R.id.rv_head)
        rvbody = findViewById(R.id.rv_body)

        search_bar.setOnClickListener(this)
        rvhead.setOnClickListener(this)
        rvbody.setOnClickListener(this)

        dataArray.add(RVheadModel("nature","https://picsum.photos/200/300"))
        dataArray.add(RVheadModel("nature","https://picsum.photos/200/300"))
        dataArray.add(RVheadModel("nature","https://picsum.photos/200"))
        dataArray.add(RVheadModel("nature","https://picsum.photos/200"))
        dataArray.add(RVheadModel("nature","https://picsum.photos/200"))
        dataArray.add(RVheadModel("nature","https://picsum.photos/200"))

        imgArray.add(RVbodyModel("https://picsum.photos/200/300", "image name"))
        imgArray.add(RVbodyModel("https://picsum.photos/200", "image name"))
        imgArray.add(RVbodyModel("https://picsum.photos/200/300", "image name"))
        imgArray.add(RVbodyModel("https://picsum.photos/200", "image name"))
        imgArray.add(RVbodyModel("https://picsum.photos/200/300", "image name"))
        imgArray.add(RVbodyModel("https://picsum.photos/200", "image name"))
        imgArray.add(RVbodyModel("https://picsum.photos/200", "image name"))
        imgArray.add(RVbodyModel("https://picsum.photos/200", "image name"))
        imgArray.add(RVbodyModel("https://picsum.photos/200", "image name"))
        imgArray.add(RVbodyModel("https://picsum.photos/200", "image name"))
        imgArray.add(RVbodyModel("https://picsum.photos/200", "image name"))

        rvhead.adapter = RVheadAdpter(this,dataArray)
        rvhead.layoutManager = LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)

        rvbody.adapter = RVbodyAdpterv(this, imgArray)
        rvbody.layoutManager = GridLayoutManager(this,2)
    }


    override fun onClick(view: View?) {
        var id = view?.id
        when(id){
            search_bar.id -> {
                Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show()}
            rvhead.id -> {
                Toast.makeText(this, "head", Toast.LENGTH_SHORT).show()}
            rvbody.id -> {
                Toast.makeText(this, "body", Toast.LENGTH_SHORT).show()
            }
        }
    }
}