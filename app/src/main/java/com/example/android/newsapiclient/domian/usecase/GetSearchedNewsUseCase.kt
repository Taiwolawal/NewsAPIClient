package com.example.android.newsapiclient.domian.usecase


import com.example.android.newsapiclient.data.model.APIResponse
import com.example.android.newsapiclient.data.util.Resource
import com.example.android.newsapiclient.domian.repository.NewsRepository

class GetSearchedNewsUseCase (private  val newsRepository: NewsRepository) {

    suspend fun execute(search: String): Resource<APIResponse> {
        return newsRepository.getSearchedNews(search)
    }
}

