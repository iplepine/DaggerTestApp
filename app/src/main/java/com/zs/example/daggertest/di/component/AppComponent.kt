package com.zs.example.daggertest.di.component

import android.content.Context
import com.zs.example.daggertest.MyApp
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(app: MyApp)

    fun activityComponent(): ActivityComponent.Factory

}