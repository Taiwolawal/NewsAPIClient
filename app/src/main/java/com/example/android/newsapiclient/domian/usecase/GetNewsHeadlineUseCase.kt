package com.example.android.newsapiclient.domian.usecase

import com.example.android.newsapiclient.data.model.APIResponse
import com.example.android.newsapiclient.data.util.Resource
import com.example.android.newsapiclient.domian.repository.NewsRepository

class GetNewsHeadlineUseCase(private  val newsRepository: NewsRepository) {

    suspend fun execute(country: String, page: Int): Resource<APIResponse>{
        return  newsRepository.getNewsHeadlines(country, page)
    }
}