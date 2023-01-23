package com.example.empowermentlabstest.ui.recipeslist

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class RecipesListScreenModel(
    val recipes: List<String> = emptyList()
) : Parcelable
