package com.poilkar.nehank.imageseachapp.api

import com.poilkar.nehank.imageseachapp.data.UnsplashPhoto


data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)