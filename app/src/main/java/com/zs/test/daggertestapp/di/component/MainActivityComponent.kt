package com.zs.test.daggertestapp.di.component

import com.zs.test.daggertestapp.MainActivity
import com.zs.test.daggertestapp.di.module.MainActivityModule
import com.zs.test.daggertestapp.di.scope.ActivityScope
import com.zs.test.daggertestapp.model.user.UserRepository
import dagger.Subcomponent
import dagger.android.AndroidInjector

@ActivityScope
@Subcomponent(modules = [MainActivityModule::class])
interface MainActivityComponent : AndroidInjector<MainActivity> {

    @Subcomponent.Factory
    interface Factory {
        fun create(): MainActivityComponent
    }

    fun userRepository(): UserRepository
    fun mainFragmentComponent(): MainFragmentComponent.Factory
}