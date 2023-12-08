package com.faizul.lovemedia.ui.cnbc

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.faizul.lovemedia.adapter.SectionPagerCnbcAdapter
import com.faizul.lovemedia.data.repository.NewsRepository
import com.faizul.lovemedia.databinding.FragmentCnbcBinding
import com.faizul.lovemedia.utils.NewsViewModelFactory
import com.faizul.lovemedia.viewmodel.NewsViewModel
import com.google.android.material.tabs.TabLayoutMediator

class CnbcFragment : Fragment() {
    private lateinit var binding: FragmentCnbcBinding
    private val viewModel: NewsViewModel by viewModels {
        NewsViewModelFactory(NewsRepository())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCnbcBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpViewAdapter()
    }

    private fun setUpViewAdapter() {
        binding.vpNews.adapter = SectionPagerCnbcAdapter(requireActivity())

        val tabList = arrayOf(
            "Terbaru",
            "Tech",
            "Lifestyle",
        )

        TabLayoutMediator(binding.tabs, binding.vpNews) {tab, position ->
            tab.text = tabList[position]
        }.attach()
    }
}