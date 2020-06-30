package com.zs.example.daggertest.ui.green

import com.zs.example.daggertest.common.TestData
import com.zs.example.daggertest.ui.main.MainViewModel
import javax.inject.Inject

open class GreenViewModel @Inject constructor(testData: TestData) : MainViewModel(testData) {

}
