package com.faizul.lovemedia.data.network.apiservice.republikaservice

import com.faizul.lovemedia.data.model.NewsResponse
import retrofit2.Call
import retrofit2.http.GET

interface RepublikaInternasionalService {
    @GET("/republika/internasional/")
    fun getRepublikaInternasionalNews(): Call<NewsResponse>
}