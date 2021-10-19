package com.hssoft.equipmentaccounting.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState

/**
 * Should show list of rental point
 */


@Composable
fun HomeScreen(viewModel: HomeScreenViewModel) {
    Surface(color = MaterialTheme.colors.background) {
        val state = viewModel.equipmentList.collectAsState()
        Column {
            state.value.forEach { equipment ->
                Text(text = equipment.name)
            }
        }
    }
}