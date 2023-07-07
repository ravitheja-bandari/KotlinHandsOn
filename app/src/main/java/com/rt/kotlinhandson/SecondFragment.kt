package com.rt.kotlinhandson

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.rt.kotlinhandson.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var a = arguments?.getString("")
        a?.length
        printPrimeNumbers(10)
        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_TopicsFragment)
        }
//        binding.recyclerView.adapter = Recy
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun printPrimeNumbers (n: Int){
        var count = 0
        var temp: Int = 0
        for(i in 4..n){
            temp=0
            for(j in 2..i) {
                if (i % j == 0) {
                    temp++
                }
            }
            if(temp<3){
                count++
            }
        }
        Log.i("Prime numbers = ", ""+count)
    }
}