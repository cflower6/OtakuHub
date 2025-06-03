package com.otakuhub.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import com.otakuhub.components.AddButton
import com.otakuhub.components.ItemCard
import com.otakuhub.viewmodel.GameViewViewModel

@Composable
fun GameScreen(viewModel: GameViewViewModel = viewModel()) {
    val gamesList = viewModel.gameList.collectAsState()

    LazyColumn {
        items(gamesList.value) { game ->
            ItemCard(
                title = game.name,
                subtitle = "Platform: ${game.platform}"
            )
        }
    }

    AddButton { viewModel.addSampleGameList() }
}