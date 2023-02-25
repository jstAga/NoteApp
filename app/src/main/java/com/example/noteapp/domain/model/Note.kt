package com.example.noteapp.domain.model

class Note(
    val id: Int = DEFAULT_NOTE_ID,
    val title: String,
    val description: String,
) {
    companion object {
        const val DEFAULT_NOTE_ID = 0
    }
}