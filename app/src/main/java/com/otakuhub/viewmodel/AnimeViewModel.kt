package com.otakuhub.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class AnimeViewModel : ViewModel() {
    private val _animeList = MutableStateFlow<List<Anime>>(emptyList())
    val animeList = _animeList.asStateFlow()

    fun addSampleAnime() {
        _animeList.value += Anime("Jujutsu Kaisen", 12)
    }
}
