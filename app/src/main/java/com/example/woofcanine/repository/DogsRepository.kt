package com.example.woofcanine.repository

import com.example.woofcanine.model.Message
import com.example.woofcanine.service.Resource


interface DogsRepository {
    suspend fun getDogs(): Resource<List<Message>>
}








