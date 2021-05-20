package com.example.android.newsapiclient.domian.usecase

import com.example.android.newsapiclient.data.model.Article
import com.example.android.newsapiclient.domian.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase (private val newsRepository: NewsRepository) {

     fun execute(): Flow<List<Article>> = newsRepository.getSavedNews()
}