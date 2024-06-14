package com.example.woofcanine.service

import com.example.woofcanine.model.Dogs
import com.example.woofcanine.model.Message
import retrofit2.http.GET

interface DogsService {

    @GET("all")
    suspend fun getDogsList() : List<Message>

}