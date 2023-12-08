package com.faizul.lovemedia.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.faizul.lovemedia.ui.cnn.CnnHiburanFragment
import com.faizul.lovemedia.ui.cnn.CnnNasionalFragment
import com.faizul.lovemedia.ui.cnn.CnnTerbaruFragment

class SectionPagerCnnAdapter(fa: FragmentActivity): FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> CnnTerbaruFragment()
            1 -> CnnHiburanFragment()
            2 -> CnnNasionalFragment()
            else -> CnnTerbaruFragment()
        }
    }
}