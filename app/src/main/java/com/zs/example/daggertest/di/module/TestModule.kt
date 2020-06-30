package com.zs.example.daggertest.di.module

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class TestModule {

    @Provides
    @Named("A")
    fun provideTextA(): String {
        return "TextA"
    }

    @Provides
    @Named("B")
    fun provideTextB(): String {
        return "TextB"
    }
}