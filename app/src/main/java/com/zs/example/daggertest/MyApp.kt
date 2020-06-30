package com.zs.example.daggertest

import androidx.multidex.MultiDexApplication
import com.zs.example.daggertest.di.component.AppComponent
import com.zs.example.daggertest.di.component.DaggerAppComponent

class MyApp : MultiDexApplication() {
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(this)
    }

    override fun onCreate() {
        super.onCreate()

        appComponent.inject(this)
    }
}
