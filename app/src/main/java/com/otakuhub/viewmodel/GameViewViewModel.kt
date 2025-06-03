package com.otakuhub.viewmodel

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class GameViewViewModel {
    private val _gameList = MutableStateFlow<List<Game>>(emptyList())
    val gameList = _gameList.asStateFlow()

    fun addSampleGameList() {
        _gameList.value += Game("Mario", "Nintendo Switch")
    }
}