package com.stevdza_san.di

import com.stevdza_san.details.DetailsViewModel
import com.stevdza_san.home.HomeViewModel
import com.stevdza_san.saved.SavedViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val koinModules = module {
    viewModel { HomeViewModel(repository = get()) }
    viewModel { DetailsViewModel(repository = get()) }
    viewModel { SavedViewModel(repository = get()) }
}