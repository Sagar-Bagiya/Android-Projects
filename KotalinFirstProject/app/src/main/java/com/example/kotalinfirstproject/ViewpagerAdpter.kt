package com.example.kotalinfirstproject

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewpagerAdpter( val fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        if (position == 0)
            return BlankFragment4()
        else if(position == 1)
            return BlankFragment2()
        else
            return BlankFragment3()
    }

    override fun getPageTitle(position: Int): CharSequence? {
        if (position == 0){
            return "home"
        }
        else if(position == 1){
            return "about"
        }
        else{
            return "contact us"
        }
    }
}