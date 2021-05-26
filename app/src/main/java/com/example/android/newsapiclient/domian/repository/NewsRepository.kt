package com.example.android.newsapiclient.domian.repository

import com.example.android.newsapiclient.data.model.APIResponse
import com.example.android.newsapiclient.data.model.Article
import com.example.android.newsapiclient.data.util.Resource
import kotlinx.coroutines.flow.Flow

interface NewsRepository {

    suspend fun getNewsHeadlines(country: String, page: Int): Resource<APIResponse>

    suspend fun getSearchedNews(country: String,searchQuery:String,page: Int) : Resource<APIResponse>

    suspend fun saveNews(article: Article)

    suspend fun deleteNews(article: Article)

    //We could have used List<Article> only  but we want to get real time updates from the database
    fun getSavedNews(): Flow<List<Article>>
}