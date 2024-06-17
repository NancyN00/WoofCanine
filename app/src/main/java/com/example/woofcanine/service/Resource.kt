package com.example.woofcanine.service

import com.example.woofcanine.model.Message
import kotlinx.coroutines.flow.Flow

sealed class Resource<T>(val data: Any? = null, val message: String? = null){
    class Success<T>(data: Flow<Resource<List<Message>>>): Resource<T>(data)
    class Error<T>(message: String, data: T? = null): Resource<T>(data, message)
    class Loading<T>(data: T? = null): Resource<T>(data)
}
