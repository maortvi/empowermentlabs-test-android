package com.example.empowermentlabstest.data.api

import com.example.empowermentlabstest.domain.model.RecipeModel

interface RecipeApi {

    suspend fun loadRandomRecipes(): List<RecipeModel>

}
