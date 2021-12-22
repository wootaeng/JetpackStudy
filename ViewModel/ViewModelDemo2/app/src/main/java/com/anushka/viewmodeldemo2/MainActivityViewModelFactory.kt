package com.anushka.viewmodeldemo2

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

// viewModel 하위클래스로 만들기.
// : ViewModelProvider 를 이용해서 클래스 확장한다.
class MainActivityViewModelFactory(private val startingTotal : Int) :ViewModelProvider.Factory {

    //시작시 적용되기 위환 함수수
   override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainActivityViewModel::class.java)){
            return MainActivityViewModel(startingTotal) as T
        }
        throw IllegalArgumentException("UnKnown View Model Class")
    }
}