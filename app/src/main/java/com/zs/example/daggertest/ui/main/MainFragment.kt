package com.zs.example.daggertest.ui.main

import android.os.Bundle
import android.widget.Button
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.zs.example.daggertest.R
import com.zs.example.daggertest.ui.blue.BlueFragment
import com.zs.example.daggertest.ui.green.GreenFragment
import com.zs.example.daggertest.ui.red.RedFragment

open abstract class MainFragment : Fragment() {

    enum class FragmentTabName { RED, GREEN, BLUE }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        init()
    }

    lateinit var binding: ViewDataBinding

    private fun init() {
        binding.root.findViewById<Button>(R.id.changeToRed).setOnClickListener {
            changeFragment(FragmentTabName.RED)
        }
        binding.root.findViewById<Button>(R.id.changeToGreen).setOnClickListener {
            changeFragment(FragmentTabName.GREEN)
        }
        binding.root.findViewById<Button>(R.id.changeToBlue).setOnClickListener {
            changeFragment(FragmentTabName.BLUE)
        }
    }

    fun changeFragment(fragmentName: FragmentTabName) {
        val fragment = when (fragmentName) {
            FragmentTabName.RED -> RedFragment.newInstance()
            FragmentTabName.GREEN -> GreenFragment.newInstance()
            FragmentTabName.BLUE -> BlueFragment.newInstance()
        }

        parentFragmentManager.beginTransaction()
            .replace(
                R.id.container,
                fragment
            )
            .commitNow()
    }
}
