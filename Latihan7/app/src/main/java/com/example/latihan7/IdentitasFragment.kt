package com.example.latihan7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.latihan7.databinding.FragmentJudulBinding

class IdentitasFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentJudulBinding>(inflater,
            R.layout.fragment_judul,container,false)
        return binding.root
    }
}