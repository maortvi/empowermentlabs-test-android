package com.example.empowermentlabstest.domain.usecase

import com.example.empowermentlabstest.domain.di.IODispatcher
import com.example.empowermentlabstest.domain.model.RecipeModel
import com.example.empowermentlabstest.domain.repository.RecipeRepository
import com.example.empowermentlabstest.domain.usecase.base.BaseUseCase
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

class SearchRecipeUseCase
@Inject constructor(
    @IODispatcher
    coroutineDispatcher: CoroutineDispatcher,
    private val recipeRepository: RecipeRepository
) : BaseUseCase<String, List<RecipeModel>>(coroutineDispatcher) {

    override suspend fun run(params: String) =
        recipeRepository.searchRecipe(params)

}