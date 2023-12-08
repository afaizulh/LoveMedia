package com.faizul.lovemedia.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.faizul.lovemedia.ui.republika.RepublikaInternasionalFragment
import com.faizul.lovemedia.ui.republika.RepublikaKhazanahFragment
import com.faizul.lovemedia.ui.republika.RepublikaTerbaruFragment

class SectionPagerRepublikaAdapter(fa: FragmentActivity): FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> RepublikaTerbaruFragment()
            1 -> RepublikaKhazanahFragment()
            2 -> RepublikaInternasionalFragment()
            else -> RepublikaTerbaruFragment()
        }
    }
}