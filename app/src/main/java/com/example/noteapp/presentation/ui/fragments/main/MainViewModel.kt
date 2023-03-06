package com.example.noteapp.presentation.ui.fragments.main

import androidx.lifecycle.viewModelScope
import com.example.noteapp.domain.core.ui.BaseViewModel
import com.example.noteapp.domain.model.Note
import com.example.noteapp.domain.usecases.GetAllNotesUseCase
import com.example.noteapp.domain.utils.Resource
import com.example.noteapp.presentation.ui.utils.UIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getAllNotesUseCase: GetAllNotesUseCase,
) : BaseViewModel() {

    private val _getAllNotesState = MutableStateFlow<UIState<List<Note>>>(UIState.Empty())
    val getAllNotesState = _getAllNotesState.asStateFlow()

    fun getAllNotes() {
        viewModelScope.launch(Dispatchers.IO) {
            getAllNotesUseCase.getAllNotes().collect() { res ->
                when (res) {
                    is Resource.Error -> {
                        if (res.message != null) {
                            _getAllNotesState.value = UIState.Error(res.message)
                        }
                    }
                    is Resource.Loading -> {
                        _getAllNotesState.value = UIState.Loading()
                    }
                    is Resource.Success -> {
                        if (res.data != null) {
                            _getAllNotesState.value = UIState.Success(res.data)
                        }
                    }
                }
            }
        }
    }
}