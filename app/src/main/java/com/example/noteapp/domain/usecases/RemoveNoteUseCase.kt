package com.example.noteapp.domain.usecases

import com.example.noteapp.domain.model.Note
import com.example.noteapp.domain.repository.NoteRepository

class RemoveNoteUseCase(private val noteRepository: NoteRepository) {

    fun removeNote(note: Note) = noteRepository.removeNote(note)
}