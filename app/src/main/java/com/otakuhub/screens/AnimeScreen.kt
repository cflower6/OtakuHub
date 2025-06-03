package com.otakuhub.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import com.otakuhub.components.AddButton
import com.otakuhub.components.ItemCard
import com.otakuhub.viewmodel.AnimeViewModel

@Composable
fun AnimeScreen(viewModel: AnimeViewModel = viewModel()) {
    val animeList = viewModel.animeList.collectAsState()

    LazyColumn {
        items(animeList.value) { anime ->
            ItemCard(
                title = anime.title,
                subtitle = "Episodes: ${anime.episodesWatched}"
            )
        }
    }

    AddButton { viewModel.addSampleAnime() }
}