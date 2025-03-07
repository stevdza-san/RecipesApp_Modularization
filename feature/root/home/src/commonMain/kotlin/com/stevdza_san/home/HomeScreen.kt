package com.stevdza_san.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.stevdza_san.shared.component.RecipeView
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun HomeScreen(navigateToDetails: (Int) -> Unit) {
    val viewModel = koinViewModel<HomeViewModel>()
    val allRecipes = viewModel.getAllRecipes()
    Scaffold {
        LazyVerticalStaggeredGrid(
            modifier = Modifier
                .padding(horizontal = 12.dp),
            columns = StaggeredGridCells.Fixed(count = 2),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalItemSpacing = 12.dp
        ) {
            items(
                items = allRecipes,
                key = { it.id }
            ) {
                RecipeView(
                    recipe = it,
                    onClick = navigateToDetails
                )
            }
        }
    }
}