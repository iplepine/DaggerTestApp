package com.zs.example.daggertest.ui.blue

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.zs.example.daggertest.databinding.BlueFragmentBinding
import com.zs.example.daggertest.ui.main.MainFragment

class BlueFragment : MainFragment() {

    companion object {
        fun newInstance() = BlueFragment()
    }

    //@Inject
    lateinit var viewModel: BlueViewModel

    /*val mainViewModel: MainViewModel by lazy {
        ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
    }*/

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = BlueFragmentBinding.inflate(inflater)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this, viewModelFactory).get(BlueViewModel::class.java)

        // TODO: Use the ViewModel
        /*(binding as? BlueFragmentBinding)?.apply {
            viewModel = mainViewModel
            lifecycleOwner = this@BlueFragment.viewLifecycleOwner
            changeTextButton.setOnClickListener { mainViewModel.messageLiveData.value = "Blue!" }
        }*/
    }

}
