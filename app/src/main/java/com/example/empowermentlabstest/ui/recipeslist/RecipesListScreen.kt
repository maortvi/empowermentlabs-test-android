package com.example.empowermentlabstest.ui.recipeslist

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun RecipesListScreen(
    viewModel: RecipesListViewModel = hiltViewModel(),
) {
    val uiState = viewModel.uiState.collectAsState()

//    DefaultListView(
//        titles = uiState.value.recipes,
//        onItemClick = { onItemClick }
//    )

}