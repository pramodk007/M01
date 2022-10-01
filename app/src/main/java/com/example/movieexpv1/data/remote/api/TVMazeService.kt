package com.example.movieexpv1.data.remote.api

import com.example.movieexpv1.common.network.ApiResponse
import com.example.movieexpv1.di.app.domain.model.Show
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET

interface TVMazeService {

    @GET("shows")
    suspend fun fetchShowList(): Flow<ApiResponse<List<Show>>>
}