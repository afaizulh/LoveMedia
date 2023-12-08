package com.faizul.lovemedia.data.network.apiservice.republikaservice

import com.faizul.lovemedia.data.model.NewsResponse
import retrofit2.Call
import retrofit2.http.GET

interface RepublikaKhazanahService {
    @GET("/republika/khazanah/")
    fun getRepublikaKhazanahNews(): Call<NewsResponse>
}