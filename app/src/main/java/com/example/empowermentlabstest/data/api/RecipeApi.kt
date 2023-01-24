package com.example.empowermentlabstest.data.api

import com.example.empowermentlabstest.data.network.model.RecipesResponseModel
import com.example.empowermentlabstest.data.network.model.SearchRecipeResponseModel

interface RecipeApi {

    suspend fun loadRandomRecipes(): RecipesResponseModel

    suspend fun searchRecipe(recipe: String): SearchRecipeResponseModel

}
