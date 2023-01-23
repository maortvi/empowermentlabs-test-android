package com.example.empowermentlabstest.data.repository

import com.example.empowermentlabstest.data.api.RecipeApi
import com.example.empowermentlabstest.domain.model.RecipeModel
import com.example.empowermentlabstest.domain.repository.RecipeRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

class RecipeRepositoryImpl(
    private val coroutineDispatcher: CoroutineDispatcher,
    private val recipeApi: RecipeApi
) : RecipeRepository {

    override suspend fun loadRandomRecipes(): List<RecipeModel> =
        withContext(coroutineDispatcher) {
            recipeApi.loadRandomRecipes()
        }

}
