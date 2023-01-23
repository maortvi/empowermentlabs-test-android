package com.example.empowermentlabstest.ui.recipeslist

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.empowermentlabstest.ui.navigation.AppDirections
import com.example.empowermentlabstest.ui.navigation.NavigationManager
import com.example.empowermentlabstest.ui.utils.mutableStateOf
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RecipesListViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle, private val navigationManager: NavigationManager
) : ViewModel() {

    var screenModel by savedStateHandle.mutableStateOf(RecipesListScreenModel())
        private set

    init {
        loadRecipesList()
    }

    private fun loadRecipesList() = viewModelScope.launch {
        screenModel = screenModel.copy(
            recipes = listOf("Hello", "Hi", "Good bye", "See you later")
        )
    }

    fun onRecipeItemClick() = viewModelScope.launch {
        navigationManager.navigate(AppDirections.RecipeDetail)
    }

    fun onSearchClick() = viewModelScope.launch {
        navigationManager.navigate(AppDirections.SearchRecipe)
    }

}
