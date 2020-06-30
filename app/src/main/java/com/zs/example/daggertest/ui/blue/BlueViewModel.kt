package com.zs.example.daggertest.ui.blue

import com.zs.example.daggertest.common.TestData
import com.zs.example.daggertest.ui.main.MainViewModel
import javax.inject.Inject

open class BlueViewModel @Inject constructor(testData: TestData) : MainViewModel(testData) {

}
