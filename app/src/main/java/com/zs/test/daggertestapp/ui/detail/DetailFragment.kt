package com.zs.test.daggertestapp.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zs.test.daggertestapp.databinding.DetailFragmentBinding
import com.zs.test.daggertestapp.ui.BaseFragment
import javax.inject.Inject

class DetailFragment : BaseFragment() {

    lateinit var binding: DetailFragmentBinding

    @Inject
    lateinit var detailViewModel: DetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DetailFragmentBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        init()
    }

    private fun init() {
        binding.viewModel = detailViewModel
    }
}
