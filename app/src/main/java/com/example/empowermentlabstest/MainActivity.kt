package com.example.empowermentlabstest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.empowermentlabstest.ui.navigation.EmpowermentLabsScreen
import com.example.empowermentlabstest.ui.recipedetail.RecipeDetailScreen
import com.example.empowermentlabstest.ui.recipeslist.RecipesListScreen
import com.example.empowermentlabstest.ui.searchrecipe.SearchRecipeScreen
import com.example.empowermentlabstest.ui.theme.EmpowermentLabsTestTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EmpowermentLabsTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    AppScreen()
                }
            }
        }
    }
}

@Composable
fun AppScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = EmpowermentLabsScreen.valueOf(
        backStackEntry?.destination?.route ?: EmpowermentLabsScreen.Start.name
    )

    Scaffold(
        topBar = {
            EmpowermentLabsAppBar(
                currentScreen = currentScreen,
                canNavigateBack = navController.previousBackStackEntry != null,
                navigateUp = { navController.navigateUp() }
            )
        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = EmpowermentLabsScreen.Start.name,
            modifier = modifier.padding(paddingValues)
        ) {
            composable(route = EmpowermentLabsScreen.Start.name) {
                RecipesListScreen()
            }
            composable(route = EmpowermentLabsScreen.SearchRecipe.name) {
                SearchRecipeScreen()
            }
            composable(route = EmpowermentLabsScreen.RecipeDetail.name) {
                RecipeDetailScreen()
            }
        }
    }
}

@Composable
fun EmpowermentLabsAppBar(
    currentScreen: EmpowermentLabsScreen,
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = { Text(stringResource(currentScreen.title)) },
        modifier = modifier,
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = stringResource(R.string.back_button)
                    )
                }
            }
        }
    )
}
