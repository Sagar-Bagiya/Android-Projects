package com.example.kotalinfirstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_bottom_navigation.*

class BottomNavigation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)

        supportFragmentManager.beginTransaction().add(R.id.framview,BlankFragment4()).commit()

        bottomnavigationview.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home->setCurrentFragment(BlankFragment2())
                R.id.about->setCurrentFragment(BlankFragment3())
                else->setCurrentFragment(BlankFragment4())
            }
            true
        }

    }

    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.framview,fragment).commit()
    }


}