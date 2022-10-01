package com.example.movieexpv1.data.repository

import com.example.movieexpv1.common.network.Resource
import com.example.movieexpv1.common.network.networkResource
import com.example.movieexpv1.data.remote.api.TVMazeService
import com.example.movieexpv1.di.app.domain.model.Show
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class ShowRepository @Inject constructor(
    private val tvMazeService: TVMazeService
) {
    fun getShowList(): Flow<Resource<List<Show>>> {
        val networkResource = networkResource(
            fetchFromRemote = {
               tvMazeService.fetchShowList()
            }
        ).map {
            when (it.status) {
                Resource.Status.LOADING -> {
                    Resource.loading(null)
                }
                Resource.Status.SUCCESS -> {
                    val show = it.data
                    Resource.success(show)
                }
                Resource.Status.ERROR -> {
                    Resource.error(it.message!!, null)
                }
            }

        }
        return networkResource.flowOn(Dispatchers.IO)
    }
}