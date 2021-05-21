package com.example.android.newsapiclient.presentation.di

import android.app.Application
import com.example.android.newsapiclient.domian.usecase.GetNewsHeadlineUseCase
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
        getNewsHeadlineUseCase: GetNewsHeadlineUseCase
    ): NewsViewModelFactory{
        return  NewsViewModelFactory(application,getNewsHeadlineUseCase)
    }
}