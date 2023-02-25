package com.example.noteapp.domain.usecases

import com.example.noteapp.domain.repository.NoteRepository

class GetAllNotesUseCase(private val noteRepository: NoteRepository) {

    fun getAllNotes() = noteRepository.getAllNotes()
}