package com.lucasmathews.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.lucasmathews.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var clicked:Boolean = false
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        configurarView ()

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



