package com.example.latihan7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.latihan7.databinding.FragmentJudulBinding

class JudulFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentJudulBinding>(inflater,
            R.layout.fragment_judul,container,false)
        binding.lanjutButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_judulFragment_to_identitasFragment)
        }
        return binding.root
    }
}