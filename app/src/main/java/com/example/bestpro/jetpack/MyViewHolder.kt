package com.example.bestpro.jetpack

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewHolder : ViewModel() {

    var testLiveData = MutableLiveData<String>()

    fun getTestData(content:String) {
        testLiveData.value = content
    }
}