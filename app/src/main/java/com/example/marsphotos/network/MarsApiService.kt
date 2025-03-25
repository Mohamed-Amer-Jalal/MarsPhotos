package com.example.marsphotos.network

import retrofit2.http.GET

/**
 * واجهة لجلب صور المريخ عبر طلب GET باستخدام Retrofit.
 */
interface MarsApiService {
    @GET("photos")
    suspend fun getPhotos(): List<MarsPhoto>
}