package com.stevdza_san.shared.di

import com.stevdza_san.shared.domain.RecipesRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { RecipesRepository() }
}