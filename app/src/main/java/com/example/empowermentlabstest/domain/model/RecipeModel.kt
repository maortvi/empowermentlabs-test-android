package com.example.empowermentlabstest.domain.model

data class RecipeModel(
    val id: Int,
    val title: String,
    val readyInMinutes: Int,
    val servings: Int,
    val image: String,
)
