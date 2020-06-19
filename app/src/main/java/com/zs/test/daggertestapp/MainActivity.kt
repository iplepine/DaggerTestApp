package com.zs.test.daggertestapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.zs.test.daggertestapp.di.component.MainActivityComponent
import com.zs.test.daggertestapp.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    lateinit var component: MainActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        component = (applicationContext as TestApp).component.mainComponent().create()

        super.onCreate(savedInstanceState)

        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }

        Log.e("MainActivity", component.userRepository().getUserName())
    }
}
