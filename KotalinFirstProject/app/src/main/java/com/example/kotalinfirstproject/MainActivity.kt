package com.example.kotalinfirstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adpter = ViewpagerAdpter(supportFragmentManager)
        viewpager.adapter = adpter
        tablayout.setupWithViewPager(viewpager)

    }

}
