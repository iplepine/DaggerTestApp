package com.zs.test.daggertestapp.di.module

import com.zs.test.daggertestapp.di.component.MainFragmentComponent
import dagger.Module

@Module(subcomponents = [MainFragmentComponent::class])
abstract class MainActivityModule {
}