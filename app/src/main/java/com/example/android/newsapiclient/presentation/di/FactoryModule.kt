package com.example.android.newsapiclient.presentation.di

import android.app.Application
import com.example.android.newsapiclient.domian.usecase.*
import com.example.android.newsapiclient.presentation.viewmodel.NewsViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {

    @Singleton
    @Provides
    fun provideNewsViewModelFactory(
        application: Application,
        getNewsHeadlineUseCase: GetNewsHeadlineUseCase,
        getSearchedNewsUseCase: GetSearchedNewsUseCase,
        saveNewsUseCase: SaveNewsUseCase,
        getSavedNewsUseCase: GetSavedNewsUseCase,
        deleteSavedNewsUseCase: DeleteSavedNewsUseCase
    ): NewsViewModelFactory {
        return NewsViewModelFactory(
            application,
            getNewsHeadlineUseCase,
            getSearchedNewsUseCase,
            saveNewsUseCase,
            getSavedNewsUseCase,
            deleteSavedNewsUseCase
        )
    }
}