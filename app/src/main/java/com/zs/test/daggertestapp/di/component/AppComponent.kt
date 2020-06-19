package com.zs.test.daggertestapp.di.component

import com.zs.test.daggertestapp.TestApp
import com.zs.test.daggertestapp.di.module.AppModule
import com.zs.test.daggertestapp.di.module.MainActivityModule
import com.zs.test.daggertestapp.di.scope.AppScope
import com.zs.test.daggertestapp.model.user.UserRepository
import com.zs.test.daggertestapp.ui.BaseFragment
import dagger.Component

@AppScope
@Component(modules = [AppModule::class, MainActivityModule::class])
interface AppComponent {
    fun inject(app: TestApp)
    fun inject(fragment: BaseFragment)

    fun userRepository(): UserRepository

    fun mainComponent(): MainActivityComponent.Factory
}