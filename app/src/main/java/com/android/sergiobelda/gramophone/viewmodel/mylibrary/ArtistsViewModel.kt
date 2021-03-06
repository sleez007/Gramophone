package com.android.sergiobelda.gramophone.viewmodel.mylibrary

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.sergiobelda.gramophone.data.*
import com.android.sergiobelda.gramophone.model.Artist
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class ArtistsViewModel : ViewModel(), CoroutineScope {
    private val job = Job()
    private val artistsLiveData: MutableLiveData<ArrayList<Artist>> by lazy {
        MutableLiveData<ArrayList<Artist>>().also {
            loadArtists()
        }
    }

    fun getArtists() : LiveData<ArrayList<Artist>> {
        return artistsLiveData
    }

    private fun loadArtists() {
        launch(Dispatchers.Main) {
            val artists = withContext(Dispatchers.IO) {
                arrayListOf(bobMarley, davidGilmour, ledZeppelin, makaya, milesDavis, pinkFloyd)
            }
            artistsLiveData.value = artists
        }
    }

    override val coroutineContext: CoroutineContext
        get() = job + Dispatchers.Main
}