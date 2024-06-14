package com.example.woofcanine.client

import com.example.woofcanine.service.DogsService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object DogsClient {

    private const val BASE_URL = "https://dog.ceo/api/breeds/list/"

    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val dogService : DogsService = retrofit.create(DogsService::class.java)

    //val postService: PostService = retrofit.create(PostService::class.java)

}