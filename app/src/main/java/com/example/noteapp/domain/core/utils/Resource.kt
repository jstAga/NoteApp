package com.example.noteapp.domain.core.utils

sealed class Resource<T>(data: T? = null, val message: String? = null) {
    class Loading<T> : Resource<T>()
    class Success<T>(data: T?) : Resource<T>(data = data)
    class Error<T>(message: String?, data: T? = null) : Resource<T>(data, message)
}