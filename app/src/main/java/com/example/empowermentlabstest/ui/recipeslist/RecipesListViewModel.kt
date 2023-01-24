package com.example.empowermentlabstest.ui.recipeslist

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.empowermentlabstest.domain.usecase.LoadRecipesListUseCase
import com.example.empowermentlabstest.domain.usecase.base.UseCaseResult
import com.example.empowermentlabstest.ui.navigation.AppDirections
import com.example.empowermentlabstest.ui.navigation.NavigationManager
import com.example.empowermentlabstest.ui.utils.mutableStateOf
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RecipesListViewModel
@Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val navigationManager: NavigationManager,
    private val loadRecipesListUseCase: LoadRecipesListUseCase
) : ViewModel() {

    var screenModel by savedStateHandle.mutableStateOf(RecipesListScreenModel())
        private set

    init {
        loadRecipesList()
    }

    private fun loadRecipesList() = viewModelScope.launch {
        when (val result = loadRecipesListUseCase.invoke(Unit)) {
            is UseCaseResult.Success -> {
                screenModel = screenModel.copy(
                    recipes = result.data.map {
                        it.title
                    }
                )
            }
            is UseCaseResult.Error -> {
                // TODO: Display error dialog to the user
                screenModel = screenModel.copy(
                    recipes = emptyList()
                )
            }
        }
    }

    fun onRecipeItemClick(title: String) = viewModelScope.launch {
        navigationManager.navigate(AppDirections.RecipeDetail(title))
    }

    fun onSearchClick() = viewModelScope.launch {
        navigationManager.navigate(AppDirections.SearchRecipe)
    }

}
