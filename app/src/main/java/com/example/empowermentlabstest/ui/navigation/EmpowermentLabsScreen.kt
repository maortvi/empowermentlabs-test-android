package com.example.empowermentlabstest.ui.navigation

import androidx.annotation.StringRes
import com.example.empowermentlabstest.R

enum class EmpowermentLabsScreen(
    @StringRes val title: Int
) {
    Start(title = R.string.app_name),
    SearchRecipe(title = R.string.search_recipe),
    RecipeDetail(title = R.string.recipe_detail),
}
