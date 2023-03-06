package com.example.noteapp.presentation.ui.fragments.main

import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import com.example.noteapp.R
import com.example.noteapp.databinding.FragmentMainBinding
import com.example.noteapp.presentation.ui.fragments.main.adapter.MainAdapter
import com.example.noteapp.presentation.ui.utils.BaseFragment
import com.example.noteapp.presentation.ui.utils.UIState
import com.example.noteapp.presentation.ui.utils.showToast
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainFragment : BaseFragment<FragmentMainBinding, MainViewModel>() {

    override val viewModel: MainViewModel by viewModels()
    private val adapter by lazy { MainAdapter() }
    override fun getViewBinding(): FragmentMainBinding = FragmentMainBinding.inflate(layoutInflater)

    override fun initRequests() {
        super.initRequests()
        viewModel.getAllNotes()
    }

    override fun initSubscribers() {
        super.initSubscribers()
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.getAllNotesState.collect { state ->
                    when (state) {
                        is UIState.Empty -> {}
                        is UIState.Error -> {
                            requireActivity().showToast(state.message)
                        }
                        is UIState.Loading -> {} // progressBar
                        is UIState.Success -> {
                            adapter.addData(state.data)
                        }
                    }
                }
            }
        }
    }

    override fun initListener() {
        super.initListener()
        binding.fabAddNote.setOnClickListener {
            findNavController().navigate(R.id.addNoteFragment)
        }
    }

    override fun initViews() {
        super.initViews()
        binding.rvNotes.adapter = adapter
    }
}