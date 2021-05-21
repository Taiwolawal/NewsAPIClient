package com.example.android.newsapiclient.presentation.di

import com.example.android.newsapiclient.domian.repository.NewsRepository
import com.example.android.newsapiclient.domian.usecase.GetNewsHeadlineUseCase
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
}