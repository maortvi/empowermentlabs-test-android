package com.example.empowermentlabstest.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class RecipeModel(
    val id: Int,
    val title: String,
    val image: String,
)
