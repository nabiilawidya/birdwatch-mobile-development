package com.capstonebangkit.birdwatch.data.remote.retrofit

import com.capstonebangkit.birdwatch.data.remote.response.AddBookmarkResponse
import com.capstonebangkit.birdwatch.data.remote.response.PredictResponse
import okhttp3.MultipartBody
import retrofit2.http.Header
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface ApiService {
    @Multipart
    @POST("predict")
    suspend fun uploadImage(
        @Header("Authorization") token: String,
        @Part file: MultipartBody.Part
    ): PredictResponse

    @Multipart
    @POST("addBookmark")
    suspend fun addBookmark(
        @Header("Authorization") token: String,
        @Part file: MultipartBody.Part
    ): AddBookmarkResponse
}