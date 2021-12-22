package com.anushka.viewmodeldemo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.anushka.viewmodeldemo1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        binding.lifecycleOwner = this
        //레이아웃에 databinding 가져오기기
        binding.myViewModel = viewModel



//        binding.countText.text = viewModel.getCurrentCount().toString()
        //옵저버가 필요없어진다 xml 상에 텍스트도 데이터바인딩으로 변경
//        viewModel.count.observe(this, Observer {
//            binding.countText.text = it.toString()
//        })

        //databinding button 대체

//        binding.button.setOnClickListener {
//
////            binding.countText.text = viewModel.getUpdatedCount().toString()
//            viewModel.getUpdatedCount()
//        }
    }
}
