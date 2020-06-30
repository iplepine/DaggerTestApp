package com.zs.example.daggertest.di.component

import com.zs.example.daggertest.di.module.TestModule
import com.zs.example.daggertest.di.module.ViewModelFactoryModule
import com.zs.example.daggertest.di.scope.ActivityScope
import com.zs.example.daggertest.ui.MainActivity
import com.zs.example.daggertest.ui.blue.BlueFragment
import com.zs.example.daggertest.ui.green.GreenFragment
import com.zs.example.daggertest.ui.main.MainFragment
import com.zs.example.daggertest.ui.red.RedFragment
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface ActivityComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): ActivityComponent
    }

    fun inject(activity: MainActivity)
    fun inject(fragment: MainFragment)
    fun inject(fragment: RedFragment)
    fun inject(fragment: GreenFragment)
    fun inject(fragment: BlueFragment)

    fun fragmentComponent(): FragmentComponent.Factory
}