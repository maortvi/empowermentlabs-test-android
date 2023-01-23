package com.example.empowermentlabstest.ui.navigation

import android.os.Bundle
import androidx.navigation.NavOptionsBuilder

sealed class AppDirections(
    override val args: Bundle? = null,
    override val navBuilder: NavOptionsBuilder.() -> Unit = { launchSingleTop = true }
) : NavigationCommand {

    object Main : AppDirections(
        navBuilder = {
            launchSingleTop = true
            popUpTo(0) { inclusive = true }
        }
    )

    object RecipesList : AppDirections(
        navBuilder = {
            launchSingleTop = true
            popUpTo(0) { inclusive = true }
        }
    )

    object SearchRecipe : AppDirections()

    object RecipeDetail : AppDirections()

}
