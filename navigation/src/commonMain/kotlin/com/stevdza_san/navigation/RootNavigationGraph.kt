package com.stevdza_san.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.stevdza_san.root.RootScreen
import com.stevdza_san.settings.SettingsScreen
import com.stevdza_san.shared.navigation.Screen

@Composable
fun RootNavigationGraph() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.Root
    ) {
        composable<Screen.Root> {
            RootScreen(
                navigateToSettings = {
                    navController.navigate(Screen.Settings)
                }
            )
        }
        composable<Screen.Settings> {
            SettingsScreen(
                navigateBack = {
                    navController.navigateUp()
                }
            )
        }
    }
}