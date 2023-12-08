package com.faizul.lovemedia.ui.republika

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.faizul.lovemedia.adapter.SectionPagerRepublikaAdapter
import com.faizul.lovemedia.data.repository.NewsRepository
import com.faizul.lovemedia.databinding.FragmentRepublikaBinding
import com.faizul.lovemedia.utils.NewsViewModelFactory
import com.faizul.lovemedia.viewmodel.NewsViewModel
import com.google.android.material.tabs.TabLayoutMediator

class RepublikaFragment : Fragment() {
    private lateinit var binding: FragmentRepublikaBinding
    private val viewModel: NewsViewModel by viewModels {
        NewsViewModelFactory(NewsRepository())
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentRepublikaBinding.inflate(inflater, container, false)
        setUpViewAdapter()
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    private fun setUpViewAdapter() {
        binding.vpNews.adapter = SectionPagerRepublikaAdapter(requireActivity())

        val tabList = arrayOf(
            "Terbaru",
            "Khazanah",
            "Internasional",
        )

//        val sectionPager = SectionPagerRepublikaAdapter(requireActivity())
//        binding.vpNews.adapter = sectionPager

        TabLayoutMediator(binding.tabs, binding.vpNews) {tab, position ->
            tab.text = tabList[position]
        }.attach()
    }
}