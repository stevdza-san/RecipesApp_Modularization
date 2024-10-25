package com.stevdza_san.recipes.domain

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector
import com.stevdza_san.navigation.Screen

sealed class BottomBarDestination(
    val screen: Screen,
    val icon: ImageVector
) {
    data object Home: BottomBarDestination(
        screen = Screen.Home,
        icon = Icons.Default.Home
    )
    data object Saved: BottomBarDestination(
        screen = Screen.Saved,
        icon = Icons.Default.Star
    )
    data object Joke: BottomBarDestination(
        screen = Screen.Joke,
        icon = Icons.Default.Face
    )
}

val bottomBarDestinations = listOf(
    BottomBarDestination.Home,
    BottomBarDestination.Saved,
    BottomBarDestination.Joke,
)