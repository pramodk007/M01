package com.example.movieexpv1.common.network

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

inline fun <REMOTE> networkResource(
    crossinline fetchFromRemote: suspend () -> Flow<ApiResponse<REMOTE>>,
) = flow<Resource<REMOTE>> {

    emit(Resource.loading(null))

    fetchFromRemote().collect { apiResponse ->
        when (apiResponse) {
            is ApiSuccessResponse -> {
                apiResponse.body?.let {
                    emit(Resource.success(it))
                }
            }
            is ApiErrorResponse -> {
                emit(Resource.error(apiResponse.errorMessage, null))
            }
            is ApiEmptyResponse -> {
                emit(Resource.success(null))
            }
        }
    }
}