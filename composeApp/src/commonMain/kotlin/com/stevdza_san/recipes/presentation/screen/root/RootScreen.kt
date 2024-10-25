package com.stevdza_san.recipes.presentation.screen.root

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.stevdza_san.navigation.BottomBarNavigationGraph
import com.stevdza_san.recipes.domain.bottomBarDestinations
import com.stevdza_san.recipes.presentation.component.CustomNavigationDrawer
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RootScreen(
    drawerState: DrawerState,
    navigateToSettings: () -> Unit
) {
    val scope = rememberCoroutineScope()
    val navController = rememberNavController()
    val backstackEntry by navController.currentBackStackEntryAsState()
    val currentDestinationRoute by remember {
        derivedStateOf {
            backstackEntry?.destination?.route
        }
    }
    val isTopBarVisible by remember {
        derivedStateOf {
            currentDestinationRoute?.contains("Details") == false
        }
    }

    CustomNavigationDrawer(
        drawerState = drawerState,
        onSettings = navigateToSettings
    ) {
        Scaffold(
            topBar = {
                AnimatedVisibility(
                    visible = isTopBarVisible,
                    enter = slideInVertically(initialOffsetY = { -it }),
                    exit = slideOutVertically(targetOffsetY = { -it })
                ) {
                    TopAppBar(
                        title = {
                            Text(
                                text = parseTopBarTitle(
                                    route = currentDestinationRoute
                                )
                            )
                        },
                        navigationIcon = {
                            IconButton(
                                onClick = {
                                    scope.launch {
                                        drawerState.open()
                                    }
                                }
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Menu,
                                    contentDescription = null
                                )
                            }
                        }
                    )
                }
            },
            bottomBar = {
                NavigationBar {
                    bottomBarDestinations.forEach { destination ->
                        NavigationBarItem(
                            selected = checkIfItemSelected(
                                currentDestinationRoute = currentDestinationRoute,
                                bottomBarDestination = destination.screen.toString()
                            ),
                            label = { Text(destination.screen.toString()) },
                            icon = {
                                Icon(
                                    imageVector = destination.icon,
                                    contentDescription = null
                                )
                            },
                            onClick = {
                                navController.navigate(destination.screen) {
                                    popUpTo(navController.graph.findStartDestination().route!!) {
                                        saveState = true
                                    }
                                    launchSingleTop = true
                                    restoreState = true
                                }
                            }
                        )
                    }
                }
            }
        ) { padding ->
            val animatedTopPadding by animateDpAsState(
                targetValue = if (isTopBarVisible) padding.calculateTopPadding() else 0.dp,
                animationSpec = tween(durationMillis = 300)
            )
            val modifiedPadding = PaddingValues(
                start = padding.calculateStartPadding(LocalLayoutDirection.current),
                top = animatedTopPadding,
                end = padding.calculateEndPadding(LocalLayoutDirection.current),
                bottom = padding.calculateBottomPadding()
            )
            BottomBarNavigationGraph(
                navController = navController,
                paddingValues = modifiedPadding
            )
        }
    }
}

private fun parseTopBarTitle(route: String?): String {
    return if (route?.contains("Home") == true) "Food Recipes"
    else if (route?.contains("Saved") == true) "Saved Recipes"
    else if (route?.contains("Joke") == true) "Daily Joke"
    else "Food Recipes"
}

private fun checkIfItemSelected(
    bottomBarDestination: String?,
    currentDestinationRoute: String?
): Boolean {
    return if ((currentDestinationRoute?.contains("Home") == true || currentDestinationRoute?.contains("Details") == true) && bottomBarDestination?.contains("Home") == true) true
    else if (currentDestinationRoute?.contains(bottomBarDestination.toString()) == true) true
    else false
}