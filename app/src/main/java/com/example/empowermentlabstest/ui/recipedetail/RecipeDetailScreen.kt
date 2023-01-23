package com.example.empowermentlabstest.ui.recipedetail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.empowermentlabstest.R

@Composable
fun RecipeDetailScreen() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(text = stringResource(id = R.string.app_name))
    }

}