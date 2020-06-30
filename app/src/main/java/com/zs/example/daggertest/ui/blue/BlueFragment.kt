package com.zs.example.daggertest.ui.blue

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.zs.example.daggertest.databinding.BlueFragmentBinding
import com.zs.example.daggertest.ui.main.MainFragment
import com.zs.example.daggertest.ui.main.MainViewModel

class BlueFragment : MainFragment() {

    companion object {
        fun newInstance() = BlueFragment()
    }

    lateinit var viewModel: BlueViewModel

    val mainViewModel: MainViewModel by lazy {
        ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
    }

    activity 에서 뷰모델 가져 왓을때 이거 사라지는 생명주기가 어찌 되나


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = BlueFragmentBinding.inflate(inflater)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(BlueViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
