package com.faizul.lovemedia.data.network.apiservice.cnbcservice

import com.faizul.lovemedia.data.model.NewsResponse
import retrofit2.Call
import retrofit2.http.GET

interface CnbcTerbaruService {
    @GET("/cnbc/terbaru/")
    fun getCnbcTerbaruNews(): Call<NewsResponse>
}