package com.example.android.newsapiclient.presentation.di

import com.example.android.newsapiclient.presentation.adapter.NewsAdapter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AdapterModule {

    @Singleton
    @Provides
    fun providesNewsAdapter(): NewsAdapter{
        return NewsAdapter()
    }
}