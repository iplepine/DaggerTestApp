package com.zs.example.daggertest.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class MainViewModel : ViewModel() {
    val messageLiveData = MutableLiveData("Main")
}
