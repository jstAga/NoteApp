package com.example.noteapp.domain.core.utils

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.io.IOException

class EmitData {
    fun <T> emitData(data: T): Flow<Resource<T>> = flow {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(data))
        } catch (ioException: IOException) {
            emit(Resource.Error(ioException.localizedMessage ?: "unknown exception"))
        }
        return@flow
    }.flowOn(Dispatchers.IO)
}
