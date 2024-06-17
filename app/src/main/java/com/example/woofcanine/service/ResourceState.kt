package com.example.woofcanine.service

import com.example.woofcanine.model.Message

data class ResourceState(
    val isLoading: Boolean = false,
    val dogs: List<Message> = emptyList(),
    val message: String = ""
)
