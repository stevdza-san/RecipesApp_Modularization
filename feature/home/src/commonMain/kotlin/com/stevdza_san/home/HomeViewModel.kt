package com.stevdza_san.home

import androidx.lifecycle.ViewModel
import com.stevdza_san.shared.domain.RecipesRepository

class HomeViewModel(
    private val repository: RecipesRepository
): ViewModel() {
    fun getAllRecipes() = repository.getAllRecipes()
}