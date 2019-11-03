package com.android.sergiobelda.gramophone.data

import com.android.sergiobelda.gramophone.model.Album
import com.android.sergiobelda.gramophone.model.Artist
import com.android.sergiobelda.gramophone.model.Genre
import com.android.sergiobelda.gramophone.model.Track

val theDarkSide = Album(
    id = "1l19LQ476o",
    title = "The Dark Side Of The Moon",
    genres = arrayListOf(Genre.PROGRESSIVE_ROCK),
    artists = arrayListOf(pinkFloyd),
    numDiscs = 1,
    releaseYear = 1973,
    releaseMonth = 6,
    label = "Pink Floyd Records",
    tracks = arrayListOf(money),
    coverUri = "https://lh3.googleusercontent.com/MnVhY1-anquCtTZ4viM4zwxHV6igUfsvZZRBL11y7IRuErsolqgV1GKjbPO-1YVx0ogM3ujNZg=w400-h400-r"
)

val theWall = Album(
    id = "bYLmqd0w6B",
    title = "The Wall",
    genres = arrayListOf(Genre.PROGRESSIVE_ROCK),
    artists = arrayListOf(pinkFloyd),
    numDiscs = 2,
    releaseYear = 1979,
    releaseMonth = 8,
    label = "Pink Floyd Records",
    tracks = arrayListOf(anotherBrick),
    coverUri = "https://lh3.googleusercontent.com/I4-SHIS8Vj9zKhYXmbin83fVR6Eps8sLIChJCU6ad0PT722vm21yRA0GGGeT6Hhg3pw1dORV=w400-h400-r"
)