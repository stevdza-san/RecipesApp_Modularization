package com.stevdza_san.recipes

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.stevdza_san.navigation.RootNavigationGraph
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext

@Composable
@Preview
fun App() {
    MaterialTheme {
        KoinContext {
            RootNavigationGraph()
        }
    }
}