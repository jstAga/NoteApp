package com.example.noteapp.presentation.ui.fragments

import com.example.noteapp.databinding.FragmentMainBinding
import com.example.noteapp.domain.core.ui.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : BaseFragment<FragmentMainBinding, MainViewModel>(){

    override fun getViewModelClass(): Class<MainViewModel> = MainViewModel::class.java
    override fun getViewBinding(): FragmentMainBinding = FragmentMainBinding.inflate(layoutInflater)
}