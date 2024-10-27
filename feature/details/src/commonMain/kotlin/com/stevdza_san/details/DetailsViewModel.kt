package com.stevdza_san.details

import androidx.lifecycle.ViewModel
import com.stevdza_san.shared.domain.RecipesRepository

class DetailsViewModel(
    private val repository: RecipesRepository
): ViewModel() {
    fun getSelectedRecipe(id: Int) = repository.getSelectedRecipe(id)
    fun toggleFavorites(id: Int) = repository.toggleFavorite(id)
}