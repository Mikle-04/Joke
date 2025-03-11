package com.example.lesson.data

import retrofit2.http.GET

interface Api {
    @GET("jokes/random")
    suspend fun getRandomJoke() : Joke
}