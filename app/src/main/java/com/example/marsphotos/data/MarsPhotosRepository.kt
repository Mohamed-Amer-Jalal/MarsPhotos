package com.example.marsphotos.data

import com.example.marsphotos.network.MarsApiService
import com.example.marsphotos.network.MarsPhoto

/**
 * واجهة لاسترجاع صور المريخ.
 */
interface MarsPhotosRepository {
    suspend fun getMarsPhotos(): List<MarsPhoto>
}

/**
 * تنفيذ الشبكة للمستودع باستخدام MarsApiService.
 */
class NetworkMarsPhotosRepository(private val marsApiService: MarsApiService) : MarsPhotosRepository {
    override suspend fun getMarsPhotos(): List<MarsPhoto> = marsApiService.getPhotos()
}