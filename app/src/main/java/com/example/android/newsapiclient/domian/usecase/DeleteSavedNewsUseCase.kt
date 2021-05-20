package com.example.android.newsapiclient.domian.usecase

import com.example.android.newsapiclient.data.model.Article
import com.example.android.newsapiclient.domian.repository.NewsRepository

class DeleteSavedNewsUseCase (private val newsRepository: NewsRepository) {

    suspend fun  execute(article: Article) = newsRepository.deleteNews(article)
}