package com.lucasmathews.myapplication.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.lucasmathews.myapplication.databinding.FragmentContatoBinding

class FragmentContato: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentContatoBinding.inflate(inflater,container,false)
        return binding.root
    }
}