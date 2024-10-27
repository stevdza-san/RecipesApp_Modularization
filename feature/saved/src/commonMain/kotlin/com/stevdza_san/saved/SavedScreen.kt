package com.stevdza_san.saved

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.stevdza_san.shared.component.RecipeView
import com.stevdza_san.shared.domain.RecipesRepository
import org.koin.compose.koinInject

@Composable
fun SavedScreen(navigateToDetails: (Int) -> Unit) {
//    val favoriteRecipes = foodRecipes.filter { it.isFavorite }
    val repository = koinInject<RecipesRepository>()
    val viewModel = viewModel { SavedViewModel(repository) }
    val favoriteRecipes = viewModel.getSavedRecipes()

    Scaffold {
        if (favoriteRecipes.isNotEmpty()) {
            LazyVerticalStaggeredGrid(
                modifier = Modifier
                    .padding(horizontal = 12.dp),
                columns = StaggeredGridCells.Fixed(count = 2),
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                verticalItemSpacing = 12.dp
            ) {
                items(
                    items = favoriteRecipes,
                    key = { it.id }
                ) {
                    RecipeView(
                        recipe = it,
                        onClick = navigateToDetails
                    )
                }
            }
        } else {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "No saved recipes.")
            }
        }
    }
}