package com.stevdza_san.recipes.di

import com.stevdza_san.di.koinModules
import com.stevdza_san.shared.di.repositoryModule
import org.koin.core.context.startKoin

fun initializeKoin() {
    startKoin {
        modules(repositoryModule, koinModules)
    }
}