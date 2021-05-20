package com.example.android.newsapiclient.data.repository.dataSource

import com.example.android.newsapiclient.data.model.APIResponse
import retrofit2.Response

interface NewsRemoteDataSource {

    suspend fun getTopHeadlines(): Response<APIResponse>
}