package com.zs.example.daggertest.di.component

import android.content.Context
import com.zs.example.daggertest.MyApp
import com.zs.example.daggertest.di.module.TestModule
import com.zs.example.daggertest.di.module.ViewModelFactoryModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ViewModelFactoryModule::class, TestModule::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(app: MyApp)

    fun activityComponent(): ActivityComponent.Factory

}