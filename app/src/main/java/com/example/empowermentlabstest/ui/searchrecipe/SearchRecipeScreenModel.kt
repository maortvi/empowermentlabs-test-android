package com.example.empowermentlabstest.ui.searchrecipe

import android.os.Parcelable
import com.example.empowermentlabstest.ui.utils.emptyString
import kotlinx.parcelize.Parcelize

@Parcelize
data class SearchRecipeScreenModel(
    val search: String = emptyString,
    val recipes: List<String> = emptyList()
) : Parcelable
