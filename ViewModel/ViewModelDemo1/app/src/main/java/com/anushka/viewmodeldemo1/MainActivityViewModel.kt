package com.anushka.viewmodeldemo1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

//    private var count = 0

    //LiveData 로 변경
//    var count = MutableLiveData<Int>()
    private var count = MutableLiveData<Int>()
    val countData : LiveData<Int>
    get() = count

    //초기값 설정
    init {
        count.value = 0
    }
//    fun getCurrentCount():Int{
//        return count
//    }

    fun getUpdatedCount(){
        count.value = (count.value)?.plus(1)
//        return ++count
    }

}