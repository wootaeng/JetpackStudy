package com.anushka.bindingdemo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import androidx.databinding.DataBindingUtil
import com.anushka.bindingdemo2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
//    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
//        setContentView(R.layout.activity_main)
//        button = findViewById(R.id.control_button)
        binding.controlButton.setOnClickListener {
            startOrStopProgressBar()
        }
    }

    private fun startOrStopProgressBar() {
//        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        binding.apply {
            if (progressBar.visibility == View.GONE) {
                progressBar.visibility = View.VISIBLE
                controlButton.text = "Stop"
            } else {
                progressBar.visibility = View.GONE
                controlButton.text = "Start"
            }
        }
//        if (binding.progressBar.visibility == View.GONE) {
//           binding.progressBar.visibility = View.VISIBLE
//            binding.controlButton.text = "Stop"
//        } else {
//            binding.progressBar.visibility = View.GONE
//            binding.controlButton.text = "Start"
//        }
    }
}

