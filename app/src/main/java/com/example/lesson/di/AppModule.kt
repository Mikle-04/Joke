package com.example.lesson.di

import com.example.lesson.data.JokeRepository
import com.example.lesson.presentetion.JokeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single { JokeRepository() }

    viewModel { JokeViewModel(get()) }
}