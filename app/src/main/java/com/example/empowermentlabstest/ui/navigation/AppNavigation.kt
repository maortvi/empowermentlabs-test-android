package com.example.empowermentlabstest.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.empowermentlabstest.ui.recipedetail.RecipeDetailScreen
import com.example.empowermentlabstest.ui.recipeslist.RecipesListScreen
import com.example.empowermentlabstest.ui.searchrecipe.SearchRecipeScreen

fun NavGraphBuilder.navigationGraph() {
    navigation(
        startDestination = AppDirections.RecipesList::class.toString(),
        route = AppDirections.Main::class.toString()
    ) {
        composable(
            route = AppDirections.RecipesList::class.toString()
        ) {
            RecipesListScreen()
        }
        composable(
            route = AppDirections.SearchRecipe::class.toString()
        ) {
            SearchRecipeScreen()
        }
        composable(
            route = AppDirections.RecipeDetail::class.toString()
        ) {
            RecipeDetailScreen()
        }
    }
}
