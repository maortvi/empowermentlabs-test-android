package com.example.empowermentlabstest.data.network.api

import com.example.empowermentlabstest.data.api.RecipeApi
import com.example.empowermentlabstest.domain.model.RecipeModel
import io.ktor.client.*
import io.ktor.client.request.*

class KtorRecipeApi(
    private val client: HttpClient
) : RecipeApi {

    override suspend fun loadRandomRecipes(): List<RecipeModel> {
        return client.get(path = "")
    }

}
