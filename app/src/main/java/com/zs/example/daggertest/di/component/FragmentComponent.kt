package com.zs.example.daggertest.di.component

import com.zs.example.daggertest.ui.blue.BlueFragment
import com.zs.example.daggertest.ui.green.GreenFragment
import com.zs.example.daggertest.ui.red.RedFragment
import dagger.Subcomponent

@Subcomponent
interface FragmentComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): FragmentComponent
    }

    fun inject(fragment: RedFragment)
    fun inject(fragment: GreenFragment)
    fun inject(fragment: BlueFragment)
}