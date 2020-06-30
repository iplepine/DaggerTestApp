package com.zs.example.daggertest.ui.green

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.zs.example.daggertest.databinding.GreenFragmentBinding
import com.zs.example.daggertest.ui.MainActivity
import com.zs.example.daggertest.ui.main.MainFragment
import com.zs.example.daggertest.ui.main.MainViewModel

class GreenFragment : MainFragment() {

    companion object {
        fun newInstance() = GreenFragment()
    }

    //@Inject
    lateinit var viewModel: GreenViewModel

    //@Inject
    lateinit var mainViewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = GreenFragmentBinding.inflate(inflater)
        return binding.root
    }

    override fun onAttach(context: Context) {
        (requireActivity() as MainActivity).component.inject(this)
        super.onAttach(context)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this, viewModelFactory).get(GreenViewModel::class.java)
        mainViewModel =
            ViewModelProvider(requireActivity(), viewModelFactory).get(MainViewModel::class.java)

        // TODO: Use the ViewModel
        (binding as? GreenFragmentBinding)?.apply {
            viewModel = mainViewModel
            lifecycleOwner = this@GreenFragment.viewLifecycleOwner
            changeTextButton.setOnClickListener { mainViewModel.messageLiveData.value = "Green!" }
        }
    }

}
