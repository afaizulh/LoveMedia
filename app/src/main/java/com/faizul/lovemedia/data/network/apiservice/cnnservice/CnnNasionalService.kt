package com.faizul.lovemedia.data.network.apiservice.cnnservice

import com.faizul.lovemedia.data.model.NewsResponse
import retrofit2.Call
import retrofit2.http.GET

interface CnnNasionalService {
    @GET("/cnn/nasional/")
    fun getCnnNasionalNews(): Call<NewsResponse>
}