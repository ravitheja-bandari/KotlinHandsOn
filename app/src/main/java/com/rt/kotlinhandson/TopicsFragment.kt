package com.rt.kotlinhandson

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.rt.kotlinhandson.databinding.FragmentFirstBinding
import com.rt.kotlinhandson.databinding.FragmentTopicsBinding

class TopicsFragment : Fragment() {

    private val topicsAdapter by lazy {  TopicsAdapter() }
    private lateinit var binding: FragmentTopicsBinding
    private lateinit var viewModel: TopicsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("TopicsFragment","onCreateView")

        binding = FragmentTopicsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("TopicsFragment","onActivityCreated started")

        binding.topicsRecyclerView.adapter = topicsAdapter

        viewModel = ViewModelProvider(this).get(TopicsViewModel::class.java)
        Log.d("TopicsFragment","back in onActivityCreated")

        viewModel.topics.observe(viewLifecycleOwner, Observer {
            Log.d("TopicsFragment", "Topics List -> " + it.toString());
            topicsAdapter.topics = it
        })
    }

}