package com.example.movieexpv1.common.network

import com.example.movieexpv1.common.constants.Constants
import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import javax.inject.Inject

class AuthenticationInterceptor @Inject constructor() : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val original: Request = chain.request()
        val originalHttpUrl: HttpUrl = original.url

        val url = originalHttpUrl.newBuilder()
            .addQueryParameter(QUERY_PARAMETER_API_KEY,Constants.Api.API_KEY)
            .build()

        val requestBuilder: Request.Builder = original.newBuilder()
            .url(url)

        val request: Request = requestBuilder.build()
        return chain.proceed(request)
    }
    companion object {
        private const val QUERY_PARAMETER_API_KEY = "api_key"
        private const val QUERY_PARAMETER_LANGUAGE = "language"
    }
}