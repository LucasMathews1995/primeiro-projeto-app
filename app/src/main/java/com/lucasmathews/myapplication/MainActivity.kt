package com.lucasmathews.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager2.widget.ViewPager2
import com.lucasmathews.myapplication.databinding.ActivityMainBinding
import com.lucasmathews.myapplication.fragment.TabAdapter

class MainActivity : AppCompatActivity() {
    private var clicked:Boolean = false
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        configurarView ()
        setupTabs()

    }

    private fun setupTabs() {
        val tabsAdapter = TabAdapter(this)
        binding.vpViewPager.adapter = tabsAdapter


    }

    private fun configurarView() {
        binding.button.visibility = View.VISIBLE
        binding.button2.visibility = View.GONE
     binding.textView.visibility = View.GONE

        binding.button.setOnClickListener {

            setVisibilty(clicked)
            clicked = !clicked

        }
        binding.button2.setOnClickListener {

            setVisibilty(clicked)
            clicked = !clicked
        }






            }

    private fun setVisibilty(clicked: Boolean) {
        if(!clicked){
        binding.button.visibility = View.GONE
        binding.button2.visibility = View.VISIBLE
        binding.textView.visibility = View.VISIBLE}
        else {
            binding.button.visibility = View.VISIBLE
            binding.button2.visibility = View.GONE
            binding.textView.visibility = View.GONE
        }
    }


}



