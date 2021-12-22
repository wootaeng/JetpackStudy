package com.anushka.viewmodeldemo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.anushka.viewmodeldemo2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewModelFactory: MainActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        //시작 총 계를 적용하기 위한 viewModelFactory
        viewModelFactory = MainActivityViewModelFactory(125)
        //뷰모델 적용
        viewModel = ViewModelProvider(this,viewModelFactory).get(MainActivityViewModel::class.java)

        //total 은 private 이기에 참조가 안되어 totalData 를 사용한다
        viewModel.totalData.observe(this, Observer {
            binding.countText.text = it.toString()
        })

//        binding.countText.text = viewModel.getTotal().toString()

        binding.button.setOnClickListener {
            // inputEditText 에 입력한 수를 toInt를 통해 변경 후 setTotal 안에 넣어준다
            viewModel.setTotal(binding.inputEditText.text.toString().toInt())
//            binding.countText.text = viewModel.getTotal().toString()
        }





    }
}