package com.example.demo_live_viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveViewModel :ViewModel() {
  //  var count = 0
 var count = MutableLiveData<Int>()

    init {
        count.value =0
    }
     fun updateCount(){
         count.value =(count.value)?.plus(1)
     }
}