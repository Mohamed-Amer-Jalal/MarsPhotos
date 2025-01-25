package com.example.marsphotos.fake

import com.example.marsphotos.data.NetworkMarsPhotosRepository
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test

class NetworkMarsRepositoryTest {

    @Test
    fun networkMarsPhotosRepository_getMarsPhotos_verifyPhotoList() = runTest {
        assertEquals(
            FakeDataSource.photosList,
            NetworkMarsPhotosRepository(marsApiService = FakeMarsApiService()).getMarsPhotos()
        )
    }
}