package com.example.android.newsapiclient.presentation.di

import com.example.android.newsapiclient.data.db.ArticleDAO
import com.example.android.newsapiclient.data.repository.dataSource.NewsLocalDataSource
import com.example.android.newsapiclient.data.repository.dataSourceImpl.NewsLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalDataModule {
    @Singleton
    @Provides
    fun provideLocalDataSource(articleDAO: ArticleDAO): NewsLocalDataSource {
        return NewsLocalDataSourceImpl(articleDAO)
    }

}