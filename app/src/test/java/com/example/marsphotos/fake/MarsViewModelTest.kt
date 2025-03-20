package com.example.marsphotos.fake

import com.example.marsphotos.ui.screens.MarsUiState
import com.example.marsphotos.ui.screens.MarsViewModel
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test

class MarsViewModelTest {

    @Test
    fun marsViewModel_getMarsPhotos_verifyMarsUiStateSuccess() = runTest {
        assertEquals(
            MarsUiState.Success(FakeDataSource.photosList),
            MarsViewModel(marsPhotosRepository = FakeNetworkMarsPhotosRepository()).marsUiState
        )
    }
}