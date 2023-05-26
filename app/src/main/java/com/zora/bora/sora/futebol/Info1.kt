package com.zora.bora.sora.futebol

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.zora.bora.sora.futebol.adapter.ExpandAdapter
import com.zora.bora.sora.futebol.databinding.FragmentInfo1Binding


class Info1 : Fragment() {

    private lateinit var binding:FragmentInfo1Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentInfo1Binding.inflate(layoutInflater)
        val adapter = ExpandAdapter(binding.root.context)
        binding.expandView.setAdapter(adapter)


        binding.back.setOnClickListener {
            findNavController().popBackStack()
        }
        return binding.root
    }


}