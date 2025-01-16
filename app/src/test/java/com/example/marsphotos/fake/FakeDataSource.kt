package com.example.marsphotos.fake

import com.example.marsphotos.network.MarsApiService
import com.example.marsphotos.network.MarsPhoto

object FakeDataSource {

    const val ID_ONE = "img1"
    const val ID_TWO = "img2"
    const val IMG_ONE = "url.1"
    const val IMG_TWO = "url.2"

    val photosList = listOf(
        MarsPhoto(id = ID_ONE, imgSrc = IMG_ONE),
        MarsPhoto(id = ID_TWO, imgSrc = this@FakeDataSource.IMG_TWO)
    )
}

class FakeMarsApiService : MarsApiService {
    override suspend fun getPhotos(): List<MarsPhoto> = FakeDataSource.photosList
}