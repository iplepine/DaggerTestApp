package com.zs.test.daggertestapp

import android.util.Log
import androidx.multidex.MultiDexApplication
import com.zs.test.daggertestapp.di.component.AppComponent
import com.zs.test.daggertestapp.di.component.DaggerAppComponent
import com.zs.test.daggertestapp.di.module.AppModule
import com.zs.test.daggertestapp.model.user.UserRepository
import javax.inject.Inject

class TestApp : MultiDexApplication() {

    val component: AppComponent by lazy {
        DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
    
    @Inject
    lateinit var userRepository: UserRepository

    override fun onCreate() {
        super.onCreate()
        component.inject(this)
        init()
    }

    private fun init() {
        Log.e("asdfasdf", component.userRepository().getUserName())
        Log.e("MainActivity", userRepository.getUserName())
    }
}
