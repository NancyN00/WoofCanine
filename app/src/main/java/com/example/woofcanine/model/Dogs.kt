package com.example.woofcanine.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Dogs(
    @SerialName("message")
    val message: Message,
    @SerialName("status")
    val status: String
)