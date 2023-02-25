package com.example.noteapp.data.model

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface NoteDao {

    @Insert
    fun addNote(noteEntity: NoteEntity)

    @Query("SELECT * FROM notes ")
    fun getAllNotes() : List<NoteEntity>

    @Update
    fun editNote(noteEntity:  NoteEntity)

    @Delete
    fun removeNote(noteEntity: NoteEntity)
}