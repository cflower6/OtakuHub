package com.otakuhub.viewmodel

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class PokemonViewModel {
    private val _pokemonCardList = MutableStateFlow<List<PokemonCard>>(emptyList())
    val pokemonCardList = _pokemonCardList.asStateFlow()

    fun addSamplePokemonCardList() {
        _pokemonCardList.value += PokemonCard("Charizard", "Base Set")
    }
}