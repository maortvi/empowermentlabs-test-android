package com.example.empowermentlabstest.ui.recipedetail

import android.os.Parcelable
import com.example.empowermentlabstest.ui.utils.emptyString
import kotlinx.parcelize.Parcelize

@Parcelize
data class RecipeDetailScreenModel(
    val title: String = emptyString
) : Parcelable
