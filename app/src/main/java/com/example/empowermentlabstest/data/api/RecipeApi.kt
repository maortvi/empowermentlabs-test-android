package com.example.empowermentlabstest.data.api

import com.example.empowermentlabstest.data.network.model.RecipesResponseModel

interface RecipeApi {

    suspend fun loadRandomRecipes(): RecipesResponseModel

}
