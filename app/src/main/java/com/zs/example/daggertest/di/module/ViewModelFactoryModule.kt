package com.zs.example.daggertest.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.zs.example.daggertest.common.ViewModelFactory
import com.zs.example.daggertest.common.ViewModelKey
import com.zs.example.daggertest.ui.green.GreenViewModel
import com.zs.example.daggertest.ui.main.MainViewModel
import com.zs.example.daggertest.ui.red.RedViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelFactoryModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun mainViewModel(viewModel: MainViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(RedViewModel::class)
    abstract fun redViewModel(viewModel: RedViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(GreenViewModel::class)
    abstract fun greenViewModel(viewModel: GreenViewModel): ViewModel

    //Add more ViewModels here
}