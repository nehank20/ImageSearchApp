package com.poilkar.nehank.imageseachapp.data

import android.app.DownloadManager
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.poilkar.nehank.imageseachapp.api.UnsplashApi
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UnsplashRepository @Inject constructor(private val unsplashApi: UnsplashApi) {

    fun getSearchResults(query: String) =
        Pager(
            config = PagingConfig(
                pageSize = 20,
                maxSize = 100,
                enablePlaceholders = false
            ),
            pagingSourceFactory = {
                UnsplashPagingSource(unsplashApi,query)
            }
        ).liveData
}