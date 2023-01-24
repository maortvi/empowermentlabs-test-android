package com.example.empowermentlabstest.domain.repository

import com.example.empowermentlabstest.domain.model.RecipeModel

interface RecipeRepository {

    suspend fun loadRandomRecipes(): List<RecipeModel>

    suspend fun searchRecipe(recipe: String): List<RecipeModel>

}
