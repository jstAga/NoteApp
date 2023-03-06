package com.example.noteapp.presentation.ui.fragments.addNote

import androidx.fragment.app.viewModels
import com.example.noteapp.databinding.FragmentAddNoteBinding
import com.example.noteapp.presentation.ui.utils.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddNoteFragment : BaseFragment<FragmentAddNoteBinding, AddNoteViewModel>(){

    override val viewModel: AddNoteViewModel by viewModels()
    override fun getViewBinding(): FragmentAddNoteBinding = FragmentAddNoteBinding.inflate(layoutInflater)

}