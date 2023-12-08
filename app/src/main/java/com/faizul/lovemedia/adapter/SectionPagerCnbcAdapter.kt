package com.faizul.lovemedia.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.faizul.lovemedia.ui.cnbc.CnbcLifestyleFragment
import com.faizul.lovemedia.ui.cnbc.CnbcTechFragment
import com.faizul.lovemedia.ui.cnbc.CnbcTerbaruFragment

class SectionPagerCnbcAdapter(fa: FragmentActivity): FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> CnbcTerbaruFragment()
            1 -> CnbcTechFragment()
            2 -> CnbcLifestyleFragment()
            else -> CnbcTerbaruFragment()
        }
    }
}