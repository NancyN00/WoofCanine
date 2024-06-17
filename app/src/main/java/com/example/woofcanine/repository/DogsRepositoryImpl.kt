package com.example.woofcanine.repository

import com.example.woofcanine.model.Message
import com.example.woofcanine.service.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException

class DogsRepositoryImpl : DogsRepository {
    override suspend fun getDogs(): Flow<Resource<List<Message>>> = flow {

            try {
                emit(Resource.Loading(data = null))

                emit(Resource.Success(data = getDogs()))

            }catch (e: HttpException){
                emit(Resource.Error(message = e.localizedMessage ?: "Something went wrong"))

            }catch (e: IOException){
                emit(Resource.Error(message = "network not connected"))
            }

        }
    }
