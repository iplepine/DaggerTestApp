package com.zs.example.daggertest.ui.red

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.zs.example.daggertest.databinding.RedFragmentBinding
import com.zs.example.daggertest.ui.MainActivity
import com.zs.example.daggertest.ui.main.MainFragment
import com.zs.example.daggertest.ui.main.MainViewModel

class RedFragment : MainFragment() {

    companion object {
        fun newInstance() = RedFragment()
    }

    lateinit var viewModel: RedViewModel
    lateinit var mainViewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = RedFragmentBinding.inflate(inflater)
        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (requireActivity() as MainActivity).component.inject(this)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel =
            ViewModelProvider(this, viewModelFactory).get(RedViewModel::class.java)
        mainViewModel =
            ViewModelProvider(requireActivity(), viewModelFactory).get(MainViewModel::class.java)

        // TODO: Use the ViewModel
        (binding as? RedFragmentBinding)?.apply {
            viewModel = mainViewModel
            lifecycleOwner = this@RedFragment.viewLifecycleOwner
            changeTextButton.setOnClickListener { mainViewModel.messageLiveData.value = "RED!" }
        }
    }

}
