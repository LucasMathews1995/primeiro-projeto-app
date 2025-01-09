package com.lucasmathews.myapplication.fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.lucasmathews.myapplication.databinding.FragmentCarActivityBinding

class TabAdapter(fragmentCarActivity: FragmentActivity): FragmentStateAdapter(fragmentCarActivity) {
    override fun getItemCount(): Int {
    return 1
    }

    override fun createFragment(position: Int): Fragment {
 return when(position)
 {
     0->FragmentCar()
     1->FragmentContato()
     else   ->    FragmentCar()
 }
    }
}