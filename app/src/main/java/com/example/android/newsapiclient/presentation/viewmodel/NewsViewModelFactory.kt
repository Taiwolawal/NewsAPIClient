package com.example.android.newsapiclient.presentation.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.android.newsapiclient.domian.usecase.*

@Suppress("UNCHECKED_CAST")
class NewsViewModelFactory(
    private val app: Application,
    private val getNewsHeadlineUseCase: GetNewsHeadlineUseCase,
    private val getSearchedNewsUseCase: GetSearchedNewsUseCase,
    private val saveNewsUseCase: SaveNewsUseCase,
    private  val getSavedNewsUseCase: GetSavedNewsUseCase,
    private val deleteSavedNewsUseCase: DeleteSavedNewsUseCase
): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NewsViewModel(
            app,
            getNewsHeadlineUseCase,
            getSearchedNewsUseCase,
            saveNewsUseCase,
            getSavedNewsUseCase,
            deleteSavedNewsUseCase
        ) as T
    }
}