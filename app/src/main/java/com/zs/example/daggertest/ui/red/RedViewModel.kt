package com.zs.example.daggertest.ui.red

import com.zs.example.daggertest.common.TestData
import com.zs.example.daggertest.ui.main.MainViewModel
import javax.inject.Inject

open class RedViewModel @Inject constructor(testData: TestData) : MainViewModel(testData) {
}
