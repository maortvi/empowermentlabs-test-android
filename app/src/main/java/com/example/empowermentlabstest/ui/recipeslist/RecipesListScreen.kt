package com.example.empowermentlabstest.ui.recipeslist

import androidx.compose.runtime.Composable
import com.pgcm.sportapp.presentation.ui.component.defaultlist.DefaultListView

@Composable
fun RecipesListScreen() {
    val titles = listOf<String>("Hi", "Hello", "Good bye", "See you around")
    DefaultListView(
        titles = titles,
        onItemClick = {}
    )
}