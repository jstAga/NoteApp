package com.example.noteapp.data.repository

import com.example.noteapp.data.mappers.toNote
import com.example.noteapp.data.mappers.toNoteEntity
import com.example.noteapp.data.local.NoteDao
import com.example.noteapp.domain.model.Note
import com.example.noteapp.domain.repository.NoteRepository
import com.example.noteapp.domain.core.utils.EmitData
import com.example.noteapp.domain.core.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(private val noteDao: NoteDao, private val emitData: EmitData) : NoteRepository {

    override fun addNote(note: Note): Flow<Resource<Unit>> = flow<Resource<Unit>> {
        emitData.emitData(noteDao.addNote(note.toNoteEntity()))
    }.flowOn(Dispatchers.IO)


    override fun getAllNotes(): Flow<Resource<List<Note>>> = flow<Resource<List<Note>>> {
        emitData.emitData(noteDao.getAllNotes().map { it.toNote() })
    }.flowOn(Dispatchers.IO)

    override fun editNote(note: Note): Flow<Resource<Unit>> = flow<Resource<Unit>> {
        emitData.emitData(noteDao.editNote(note.toNoteEntity()))
    }.flowOn(Dispatchers.IO)

    override fun removeNote(note: Note): Flow<Resource<Unit>> = flow<Resource<Unit>> {
        emitData.emitData(noteDao.removeNote(note.toNoteEntity()))
    }.flowOn(Dispatchers.IO)
}