package com.zs.test.daggertestapp.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zs.test.daggertestapp.model.user.UserRepository
import javax.inject.Inject

class MainViewModel @Inject constructor(private var userRepository: UserRepository) : ViewModel() {

    val text = MutableLiveData<String>().apply {
        value = "dagger test"
        value = userRepository.getUserName()
    }

    fun onClickChange() {
        text.value = text.value + "!"
    }
}
