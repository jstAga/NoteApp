package com.example.noteapp.domain.repository


import com.example.noteapp.domain.model.Note

interface NoteRepository {

    fun addNote(note: Note)

    fun editNote(note: Note)

    fun getAllNotes() : List<Note>

    fun removeNote(note: Note)
}