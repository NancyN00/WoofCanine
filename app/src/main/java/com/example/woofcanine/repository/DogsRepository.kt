package com.example.woofcanine.repository

import com.example.woofcanine.model.Message
import com.example.woofcanine.service.Resource
import kotlinx.coroutines.flow.Flow


interface DogsRepository {
    suspend fun getDogs(): Flow<Resource<List<Message>>>
}








