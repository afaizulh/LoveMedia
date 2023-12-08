package com.faizul.lovemedia.ui.cnn

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.faizul.lovemedia.adapter.SectionPagerCnnAdapter
import com.faizul.lovemedia.data.repository.NewsRepository
import com.faizul.lovemedia.databinding.FragmentCnnBinding
import com.faizul.lovemedia.utils.NewsViewModelFactory
import com.faizul.lovemedia.viewmodel.NewsViewModel
import com.google.android.material.tabs.TabLayoutMediator

class CnnFragment : Fragment() {
    private lateinit var binding: FragmentCnnBinding
    private val viewModel: NewsViewModel by viewModels {
        NewsViewModelFactory(NewsRepository())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCnnBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpViewAdapter()
    }

    private fun setUpViewAdapter() {
        binding.vpNews.adapter = SectionPagerCnnAdapter(requireActivity())

        val tabList = arrayOf(
            "Terbaru",
            "Hiburan",
            "Nasional",
        )

        TabLayoutMediator(binding.tabs, binding.vpNews) {tab, position ->
            tab.text = tabList[position]
        }.attach()
    }
}