package com.zs.example.daggertest.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zs.example.daggertest.MyApp
import com.zs.example.daggertest.R
import com.zs.example.daggertest.di.component.ActivityComponent
import com.zs.example.daggertest.ui.red.RedFragment

class MainActivity : AppCompatActivity() {

    val component: ActivityComponent by lazy {
        (applicationContext as MyApp).appComponent.activityComponent().create()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(
                    R.id.container,
                    RedFragment.newInstance()
                )
                .commitNow()
        }
    }

}
