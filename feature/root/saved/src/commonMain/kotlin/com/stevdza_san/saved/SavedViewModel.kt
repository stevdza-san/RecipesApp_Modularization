package com.stevdza_san.saved

import androidx.lifecycle.ViewModel
import com.stevdza_san.shared.domain.RecipesRepository

class SavedViewModel(
    private val repository: RecipesRepository
): ViewModel() {
    fun getSavedRecipes() = repository.getSavedRecipes()
}