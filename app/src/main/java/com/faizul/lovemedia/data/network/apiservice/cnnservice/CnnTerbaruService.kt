package com.faizul.lovemedia.data.network.apiservice.cnnservice

import com.faizul.lovemedia.data.model.NewsResponse
import retrofit2.Call
import retrofit2.http.GET

interface CnnTerbaruService {
    @GET ("/cnn/terbaru/")
    fun getCnnTerbaruNews(): Call<NewsResponse>
}