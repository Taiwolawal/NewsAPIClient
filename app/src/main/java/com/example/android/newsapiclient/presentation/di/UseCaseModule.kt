package com.example.android.newsapiclient.presentation.di

import com.example.android.newsapiclient.domian.repository.NewsRepository
import com.example.android.newsapiclient.domian.usecase.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Singleton
    @Provides
    fun providesGetNewsHeadlinesUseCase(newsRepository: NewsRepository): GetNewsHeadlineUseCase{
        return  GetNewsHeadlineUseCase(newsRepository)
    }

    @Singleton
    @Provides
    fun provideGetSearchedNewsUseCase(
        newsRepository: NewsRepository
    ): GetSearchedNewsUseCase {
        return GetSearchedNewsUseCase(newsRepository)
    }

    @Singleton
    @Provides
    fun provideSaveNewsUseCase(
        newsRepository: NewsRepository
    ): SaveNewsUseCase {
        return SaveNewsUseCase(newsRepository)
    }

    @Singleton
    @Provides
    fun provideSGetSavedNewsUseCase(
        newsRepository: NewsRepository
    ): GetSavedNewsUseCase {
        return GetSavedNewsUseCase(newsRepository)
    }

    @Singleton
    @Provides
    fun provideDeleteSavedNewsUseCase(
        newsRepository: NewsRepository
    ): DeleteSavedNewsUseCase {
        return DeleteSavedNewsUseCase(newsRepository)
    }
}