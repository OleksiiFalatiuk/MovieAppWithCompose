package com.example.movieappwithcompose.data.network

import com.example.movieappwithcompose.data.models.Movies
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("/shows")
    suspend fun getAllMovies(): Response<List<Movies>>

}