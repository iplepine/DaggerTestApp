package com.zs.example.daggertest.ui.green

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.zs.example.daggertest.databinding.GreenFragmentBinding
import com.zs.example.daggertest.ui.main.MainFragment
import com.zs.example.daggertest.ui.main.MainViewModel

class GreenFragment : MainFragment() {

    companion object {
        fun newInstance() = GreenFragment()
    }

    lateinit var viewModel: GreenViewModel

    val mainViewModel: MainViewModel by lazy {
        ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = GreenFragmentBinding.inflate(inflater)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(GreenViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
