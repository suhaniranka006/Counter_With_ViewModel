package com.example.counter_with_viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel:ViewModel() {

    //mutable live data to store counter
    private val _counter = MutableLiveData<Int>(0)
    val counter:LiveData<Int> = _counter   //exposed to live daata read only


    //fun to increment counter
    fun increment() {
        _counter.value = (_counter.value?:0) + 1
    }
}