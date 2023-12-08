package com.faizul.lovemedia.data.network.apiservice.cnbcservice

import com.faizul.lovemedia.data.model.NewsResponse
import retrofit2.Call
import retrofit2.http.GET

interface CnbcLifestyleService {
    @GET("/cnbc/lifestyle/")
    fun getCnbcLifestyleNews(): Call<NewsResponse>
}