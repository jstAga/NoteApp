package com.example.noteapp.presentation.ui.fragments.addNote

import com.example.noteapp.domain.core.ui.BaseViewModel
import com.example.noteapp.domain.model.Note
import com.example.noteapp.domain.usecases.AddNoteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AddNoteViewModel @Inject constructor(private val addNoteUseCase: AddNoteUseCase) : BaseViewModel() {

    fun addNote(title : String, description : String){
        addNoteUseCase.addNote(Note(title = title, description = description))
    }
}