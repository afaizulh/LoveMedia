package com.faizul.lovemedia.data.network

import com.faizul.lovemedia.data.network.apiservice.cnbcservice.CnbcLifestyleService
import com.faizul.lovemedia.data.network.apiservice.cnbcservice.CnbcTechService
import com.faizul.lovemedia.data.network.apiservice.cnbcservice.CnbcTerbaruService
import com.faizul.lovemedia.data.network.apiservice.cnnservice.CnnHiburanService
import com.faizul.lovemedia.data.network.apiservice.cnnservice.CnnNasionalService
import com.faizul.lovemedia.data.network.apiservice.cnnservice.CnnTerbaruService
import com.faizul.lovemedia.data.network.apiservice.republikaservice.RepublikaInternasionalService
import com.faizul.lovemedia.data.network.apiservice.republikaservice.RepublikaKhazanahService
import com.faizul.lovemedia.data.network.apiservice.republikaservice.RepublikaTerbaruService
import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    private inline fun <reified T> createService(baseUrl: String): T {
        val loggingInterceptor =
            HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
        val client = OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()
        val retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create(Gson()))
            .client(client)
            .build()
        return retrofit.create(T::class.java)
    }
//    Republika News
    val getRepublikaTerbaruService = createService<RepublikaTerbaruService>("https://api-berita-indonesia.vercel.app")
    val getRepublikaKhazanahService = createService<RepublikaKhazanahService>("https://api-berita-indonesia.vercel.app/republika/khazanah/")
    val getRepublikaInternasionalService = createService<RepublikaInternasionalService>("https://api-berita-indonesia.vercel.app/republika/internasional/")

//    CNBC News
    val getCnbcTerbaruService = createService<CnbcTerbaruService>("https://api-berita-indonesia.vercel.app/cnbc/terbaru/")
    val getCnbcTechService = createService<CnbcTechService>("https://api-berita-indonesia.vercel.app/cnbc/tech/")
    val getCnbcLifestyleService = createService<CnbcLifestyleService>("https://api-berita-indonesia.vercel.app/cnbc/lifestyle/")

//    CNN News
    val getCnnTerbaruService = createService<CnnTerbaruService>("https://api-berita-indonesia.vercel.app/cnn/terbaru/")
    val getCnnNasionalService = createService<CnnNasionalService>("https://api-berita-indonesia.vercel.app/cnn/nasional/")
    val getCnnHiburanService = createService<CnnHiburanService>("https://api-berita-indonesia.vercel.app/cnn/hiburan/")
}