package com.zs.example.daggertest.ui.red

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.zs.example.daggertest.databinding.RedFragmentBinding
import com.zs.example.daggertest.ui.main.MainFragment
import com.zs.example.daggertest.ui.main.MainViewModel

class RedFragment : MainFragment() {

    companion object {
        fun newInstance() = RedFragment()
    }

    lateinit var viewModel: RedViewModel

    val mainViewModel: MainViewModel by lazy {
        ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = RedFragmentBinding.inflate(inflater)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RedViewModel::class.java)
        // TODO: Use the ViewModel
        (binding as? RedFragmentBinding)?.apply {
            viewModel = mainViewModel
            lifecycleOwner = this@RedFragment.viewLifecycleOwner
            changeTextButton.setOnClickListener { mainViewModel.messageLiveData.value = "RED!" }
        }
    }

}
