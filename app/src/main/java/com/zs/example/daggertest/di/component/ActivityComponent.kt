package com.zs.example.daggertest.di.component

import com.zs.example.daggertest.ui.MainActivity
import dagger.Subcomponent

@Subcomponent
interface ActivityComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): ActivityComponent
    }

    fun inject(activity: MainActivity)

    fun fragmentComponent(): FragmentComponent.Factory
}