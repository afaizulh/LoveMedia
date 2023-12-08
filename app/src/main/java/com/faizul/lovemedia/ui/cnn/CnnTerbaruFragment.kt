package com.faizul.lovemedia.ui.cnn

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.faizul.lovemedia.adapter.NewsAdapter
import com.faizul.lovemedia.data.repository.NewsRepository
import com.faizul.lovemedia.databinding.FragmentCnnTerbaruBinding
import com.faizul.lovemedia.utils.NewsViewModelFactory
import com.faizul.lovemedia.viewmodel.NewsViewModel

class CnnTerbaruFragment : Fragment() {
    private lateinit var binding: FragmentCnnTerbaruBinding
    private val viewModel: NewsViewModel by viewModels {
        NewsViewModelFactory(NewsRepository())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCnnTerbaruBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mAdapter = NewsAdapter()

        viewModel.getCnnTerbaruNews()

//        if (viewModel.republikaTerbaruNews.value == null){
//            viewModel.getRepublikaTerbaruNews()
//        }

        viewModel.cnnTerbaruNews.observe(viewLifecycleOwner) { dataNews ->
            mAdapter.setData(dataNews.data.posts)
            binding.rvCnnTerbaru.apply {
                adapter = mAdapter
                layoutManager = LinearLayoutManager(requireContext())
            }
//            dataNews.data?.posts?.toString()?.let { Log.d("DataNewsOutput", it) }
        }
//
    }
}