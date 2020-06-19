package com.zs.test.daggertestapp.ui.main

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zs.test.daggertestapp.MainActivity
import com.zs.test.daggertestapp.databinding.MainFragmentBinding
import com.zs.test.daggertestapp.di.component.MainFragmentComponent
import com.zs.test.daggertestapp.ui.BaseFragment
import javax.inject.Inject

class MainFragment : BaseFragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    lateinit var component: MainFragmentComponent
    lateinit var binding: MainFragmentBinding

    @Inject
    lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = MainFragmentBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        init()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        component = (requireActivity() as MainActivity)
            .component
            .mainFragmentComponent()
            .create()
        component.inject(this)
    }

    private fun init() {
        binding.viewModel = viewModel

        Log.e("MainFragment", "")
    }
}
