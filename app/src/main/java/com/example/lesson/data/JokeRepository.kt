package com.example.lesson.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class JokeRepository {
    private val api: Api = Retrofit.Builder()
        .baseUrl("https://api.chucknorris.io/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(Api::class.java)

     fun fetchJokeFlow(): Flow<String> = flow {
        val rsult = api.getRandomJoke().value
        emit(rsult)
    }
}