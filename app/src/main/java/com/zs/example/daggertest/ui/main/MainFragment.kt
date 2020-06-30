package com.zs.example.daggertest.ui.main

import android.content.Context
import android.os.Bundle
import android.widget.Button
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.zs.example.daggertest.R
import com.zs.example.daggertest.ui.MainActivity
import com.zs.example.daggertest.ui.blue.BlueFragment
import com.zs.example.daggertest.ui.green.GreenFragment
import com.zs.example.daggertest.ui.red.RedFragment
import javax.inject.Inject

open abstract class MainFragment : Fragment() {

    enum class FragmentTabName { RED, GREEN, BLUE }

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    lateinit var binding: ViewDataBinding

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        init()
    }

    override fun onAttach(context: Context) {
        (requireActivity() as MainActivity).component.inject(this)
        super.onAttach(context)
    }

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
