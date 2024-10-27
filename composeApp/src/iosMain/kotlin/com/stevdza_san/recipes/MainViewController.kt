package com.stevdza_san.recipes

import androidx.compose.ui.window.ComposeUIViewController
import com.stevdza_san.recipes.di.initializeKoin

fun MainViewController() = ComposeUIViewController(
    configure = { initializeKoin() }
) { App() }