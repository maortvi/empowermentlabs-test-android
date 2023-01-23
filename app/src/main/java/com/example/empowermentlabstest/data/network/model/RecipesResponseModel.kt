package com.example.empowermentlabstest.data.network.model

import com.example.empowermentlabstest.domain.model.RecipeModel
import kotlinx.serialization.Serializable

@Serializable
data class RecipesResponseModel(
    val recipes: List<RecipeModel>
)
