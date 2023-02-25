package com.example.noteapp.data.repository

import com.example.noteapp.data.mappers.toNote
import com.example.noteapp.data.mappers.toNoteEntity
import com.example.noteapp.data.model.NoteDao
 import com.example.noteapp.domain.model.Note
import com.example.noteapp.domain.repository.NoteRepository

class NoteRepositoryImpl(private val noteDao: NoteDao) : NoteRepository {

    override fun addNote(note: Note) {
        noteDao.addNote(note.toNoteEntity())
    }

    override fun getAllNotes(): List<Note> {
        return noteDao.getAllNotes().map { it.toNote() }
    }

    override fun editNote(note: Note) {
        noteDao.editNote(note.toNoteEntity())
    }

    override fun removeNote(note: Note) {
        noteDao.removeNote(note.toNoteEntity())
    }
}