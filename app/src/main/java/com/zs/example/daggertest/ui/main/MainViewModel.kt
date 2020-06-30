package com.zs.example.daggertest.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zs.example.daggertest.common.TestData
import javax.inject.Inject

open class MainViewModel @Inject constructor(testData: TestData) : ViewModel() {
    val messageLiveData = MutableLiveData(testData.textA)
}
