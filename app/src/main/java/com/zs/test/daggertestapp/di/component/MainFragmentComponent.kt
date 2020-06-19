package com.zs.test.daggertestapp.di.component

import com.zs.test.daggertestapp.di.module.MainFragmentModule
import com.zs.test.daggertestapp.di.scope.FragmentScope
import com.zs.test.daggertestapp.ui.main.MainFragment
import dagger.Subcomponent

@FragmentScope
@Subcomponent(modules = [MainFragmentModule::class])
interface MainFragmentComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): MainFragmentComponent
    }

    fun inject(fragment: MainFragment)
}