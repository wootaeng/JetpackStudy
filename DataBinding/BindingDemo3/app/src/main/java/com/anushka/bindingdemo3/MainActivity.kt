package com.anushka.bindingdemo3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.anushka.bindingdemo3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.student = getStudent()

    // 레이아웃 에 <data > 선언으로 별도의 선언 없이 객체를 레이아웃에 직접 전달하여 데이터 바인딩과 함께 사용가능
//        val student =getStudent()
//        binding.nameText.text = student.name
//        binding.emailText.text = student.email
    }

    private fun getStudent():Student{
        return Student(1,"Alex","alex@gmail.com")
    }
}
