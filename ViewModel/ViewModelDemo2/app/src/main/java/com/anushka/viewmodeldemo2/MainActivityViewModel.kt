package com.anushka.viewmodeldemo2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal : Int) :ViewModel(){

//    private var total = 0
    //LiveData 를 사용하기 위해 변경
//    MutableLiveData와 LiveData의 차이점은 무엇입니까?
//    LiveData 객체의 데이터는 읽기만 가능합니다. 우리는 그 데이터를 업데이트할 수 없습니다.
//    MutableLive 데이터 클래스는 LiveData 클래스의 하위 클래스입니다. 변경 가능한 LiveData 개체를 통해
//    데이터를 변경하려고요.
// private 로 설정하지않으면 누구나 접근 가능하게 된다. 그건 좋지않음!
// 하지만 private 로 설정하면 MainActivity 에 참조가 안되어 오류가 난다
    private var total = MutableLiveData<Int>()
    // 참조가 가능한 또다른 변수를 선언하고 편집을 안하게 하기 위해 LiveData
    val totalData : LiveData<Int>
    get() = total


    init {
        //value 추가
        total.value = startingTotal
    }

//
//    fun getTotal():Int {
//        return total
//    }

    fun setTotal(input:Int){
        total.value =(total.value)?.plus(input)
    }
}