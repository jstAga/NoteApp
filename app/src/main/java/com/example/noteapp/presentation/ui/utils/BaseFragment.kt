package com.example.noteapp.presentation.ui.utils

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.example.noteapp.domain.core.ui.BaseViewModel

abstract class BaseFragment<VBinding : ViewBinding, ViewModel : BaseViewModel> : Fragment() {

    protected abstract val viewModel: ViewModel

    protected lateinit var binding: VBinding
    protected abstract fun getViewBinding(): VBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        initRequests()
        initSubscribers()
        initListener()
    }

    open fun initViews() {}

    open fun initRequests() {}

    open fun initSubscribers(){}

    open fun initListener() {}

    private fun init() {
        binding = getViewBinding()
    }
}



