package com.example.android.newsapiclient.data.db

import androidx.room.*
import com.example.android.newsapiclient.data.model.Article
import kotlinx.coroutines.flow.Flow

@Dao
interface ArticleDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(article: Article)

    //If we want real time live updates for view, we use either livedata OR flow.
    @Query("SELECT * FROM articles")
    fun getAllArticles(): Flow<List<Article>>

    @Delete
    suspend fun deleteArticle(article: Article)
}