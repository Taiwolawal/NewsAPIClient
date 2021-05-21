package com.example.android.newsapiclient.presentation.di

import com.example.android.newsapiclient.data.api.NewsAPIService
import com.example.android.newsapiclient.data.repository.dataSource.NewsRemoteDataSource
import com.example.android.newsapiclient.data.repository.dataSourceImpl.NewsRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule {

    @Singleton
    @Provides
    fun provideNewsRemoteDataSource(newsAPIService: NewsAPIService): NewsRemoteDataSource{
        return  NewsRemoteDataSourceImpl(newsAPIService)
    }
}