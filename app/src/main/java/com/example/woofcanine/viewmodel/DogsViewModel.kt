package com.example.woofcanine.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.woofcanine.repository.DogsRepository
import com.example.woofcanine.service.Resource
import com.example.woofcanine.service.ResourceState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class DogsViewModel (private val dogsRepository: DogsRepository): ViewModel() {

    private val _dogs = MutableStateFlow(ResourceState())
    val state = _dogs.asStateFlow()

    init {
        getDogss()
    }

    private fun getDogss() {
        viewModelScope.launch {
            dogsRepository.getDogs().collect { result ->

                when (result) {
                    is Resource.Loading -> {
                        _dogs.value = ResourceState(
                            isLoading = true
                        )
                    }

                    is Resource.Success -> {
                        _dogs.value = ResourceState(
                            characters = result.data ?: emptyList()
                        )
                    }

                    is Resource.Error -> {
                        _dogs.value = ResourceState(
                            message = result.message ?: "Something went wrong"
                        )
                    }

                    else -> {}
                }
            }


        }
    }
}