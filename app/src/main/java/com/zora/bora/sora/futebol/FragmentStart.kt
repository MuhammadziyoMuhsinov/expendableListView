package com.zora.bora.sora.futebol

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.zora.bora.sora.futebol.databinding.FragmentStartBinding


class FragmentStart : Fragment() {

    private lateinit var binding: FragmentStartBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentStartBinding.inflate(layoutInflater)

        binding.button1.setOnClickListener {
            findNavController().navigate(R.id.info1)
        }
        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.info2)
        }
        binding.button3.setOnClickListener {
            findNavController().navigate(R.id.info3)
        }
        binding.button4.setOnClickListener {
            findNavController().navigate(R.id.info4)
        }
        binding.button5.setOnClickListener {
            findNavController().navigate(R.id.info5)
        }

        return binding.root
    }


}