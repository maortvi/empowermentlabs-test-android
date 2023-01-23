package com.example.empowermentlabstest.ui.recipeslist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RecipesListViewModel @Inject constructor() : ViewModel() {

    private val _uiState = MutableStateFlow(RecipesListScreenModel())
    val uiState: StateFlow<RecipesListScreenModel> = _uiState.asStateFlow()

    init {
        loadRecipesList()
    }

    private fun loadRecipesList() = viewModelScope.launch {
        _uiState.update { recipesListScreenModel ->
            recipesListScreenModel.copy(listOf("Hello", "Hi", "Good bye", "See you later"))
        }
    }
}