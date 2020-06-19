package com.zs.test.daggertestapp.di.module

import android.content.Context
import com.zs.test.daggertestapp.di.component.MainActivityComponent
import com.zs.test.daggertestapp.di.scope.AppScope
import dagger.Module
import dagger.Provides

@Module(subcomponents = [MainActivityComponent::class])
class AppModule(private val context: Context) {

    @AppScope
    @Provides
    fun provideContext(): Context {
        return this.context
    }
}