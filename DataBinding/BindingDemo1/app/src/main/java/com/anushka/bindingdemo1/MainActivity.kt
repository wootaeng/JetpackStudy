package com.anushka.bindingdemo1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.anushka.bindingdemo1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
//        setContentView(R.layout.activity_main)
//        val button = findViewById<Button>(R.id.submit_button)
        binding.submitButton.setOnClickListener {
            displayGreeting()
        }

    }

    private fun displayGreeting() {
//        val messageView = findViewById<TextView>(R.id.greeting_text_view)
//        val nameText = findViewById<EditText>(R.id.name_edit_text)

//        val message = "Hello! "+ nameText.text
        // kotlin apply{} 를 사용하면 더 간략하게 표현 가능
        binding.apply {
            greetingTextView.text = "Hello! "+ nameEditText.text
        }

    }
}
