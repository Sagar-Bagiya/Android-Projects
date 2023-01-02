package com.example.kotalinfirstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_drawer_layout.*
import kotlinx.android.synthetic.main.app_bar_main.*

class drawerLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drawer_layout)
//
        setSupportActionBar(toolbar)

        var toggle = ActionBarDrawerToggle(this, my_drawer,toolbar,R.string.nav_open, R.string.nav_close)
        my_drawer.addDrawerListener(toggle)
        toggle.syncState()

//        supportFragmentManager.beginTransaction().add(R.id.framelayout, BlankFragment2()).commit()

        navigationview.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home->loadF(BlankFragment4())
                R.id.about->loadF(BlankFragment2())
                else->loadF((BlankFragment3()))
            }
            true
        }
    }

    private fun loadF(fragment : Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.framelayout, fragment).commit()
        my_drawer.closeDrawer(GravityCompat.START)
    }
}