package com.otakuhub.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import com.otakuhub.components.AddButton
import com.otakuhub.components.ItemCard
import com.otakuhub.viewmodel.PokemonViewModel

@Composable
fun PokemonScreen(viewModel: PokemonViewModel = viewModel()) {
    val pokemonCardList = viewModel.pokemonCardList.collectAsState()

    LazyColumn {
        items(pokemonCardList.value) { pokemonCard ->
            ItemCard(
                title = pokemonCard.name,
                subtitle = "Set: ${pokemonCard.set}"
            )
        }
    }

    AddButton { viewModel.addSamplePokemonCardList() }
}