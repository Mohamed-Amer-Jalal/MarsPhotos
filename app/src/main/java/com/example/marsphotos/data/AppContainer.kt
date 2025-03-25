package com.example.marsphotos.data

import com.example.marsphotos.network.MarsApiService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

/**
 * تجمع تبعيات التطبيق؛ DefaultAppContainer تهيئ Retrofit وMarsApiService لإنشاء مستودع صور المريخ.
 */
interface AppContainer {
    val marsPhotosRepository: MarsPhotosRepository
}

class DefaultAppContainer : AppContainer {
    private val retrofit =
        Retrofit.Builder().baseUrl("https://android-kotlin-fun-mars-server.appspot.com")
            .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
            .build()

    private val retrofitService: MarsApiService by lazy { retrofit.create(MarsApiService::class.java) }

    override val marsPhotosRepository: MarsPhotosRepository by lazy {
        NetworkMarsPhotosRepository(retrofitService)
    }
}