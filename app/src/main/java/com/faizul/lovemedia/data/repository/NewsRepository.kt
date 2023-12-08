package com.faizul.lovemedia.data.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.faizul.lovemedia.data.model.NewsResponse
import com.faizul.lovemedia.data.network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NewsRepository {
    private val _republikaTerbaruNews = MutableLiveData<NewsResponse>()
    val republikaTerbaruNews: LiveData<NewsResponse> = _republikaTerbaruNews

    private val _republikaKhazanahNews = MutableLiveData<NewsResponse>()
    val republikaKhazanahNews: LiveData<NewsResponse> = _republikaKhazanahNews

    private val _republikaInternasionalNews = MutableLiveData<NewsResponse>()
    val republikaInternasionalNews: LiveData<NewsResponse> = _republikaInternasionalNews

    private val _cnnTerbaruNews = MutableLiveData<NewsResponse>()
    val cnnTerbaruNews: LiveData<NewsResponse> = _cnnTerbaruNews

    private val _cnnHiburanNews = MutableLiveData<NewsResponse>()
    val cnnHiburanNews: LiveData<NewsResponse> = _cnnHiburanNews

    private val _cnnNasionalNews = MutableLiveData<NewsResponse>()
    val cnnNasionalNews: LiveData<NewsResponse> = _cnnNasionalNews

    private val _cnbcTerbaruNews = MutableLiveData<NewsResponse>()
    val cnbcTerbaruNews: LiveData<NewsResponse> = _cnbcTerbaruNews

    private val _cnbcTechNews = MutableLiveData<NewsResponse>()
    val cnbcTechNews: LiveData<NewsResponse> = _cnbcTechNews

    private val _cnbcLifestyleNews = MutableLiveData<NewsResponse>()
    val cnbcLifestyleNews: LiveData<NewsResponse> = _cnbcLifestyleNews

    fun getRepublikaTerbaruNews() {
        ApiClient.getRepublikaTerbaruService.getRepublikaTerbaruNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _republikaTerbaruNews.postValue(response.body())
//                            Log.d("Hasil", response.body()!!.data.toString())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }

    fun getRepublikaKhazanahNews() {
        ApiClient.getRepublikaKhazanahService.getRepublikaKhazanahNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _republikaKhazanahNews.postValue(response.body())
//                            Log.d("Hasil", response.body()!!.data.toString())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }

    fun getRepublikaInternasionalNews() {
        ApiClient.getRepublikaInternasionalService.getRepublikaInternasionalNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _republikaInternasionalNews.postValue(response.body())
//                            Log.d("Hasil", response.body()!!.data.toString())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }

    fun getCnnTerbaruNews() {
        ApiClient.getCnnTerbaruService.getCnnTerbaruNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _cnnTerbaruNews.postValue(response.body())
//                            Log.d("Hasil", response.body()!!.data.toString())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }

    fun getCnnHiburanNews() {
        ApiClient.getCnnHiburanService.getCnnHiburanNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _cnnHiburanNews.postValue(response.body())
//                            Log.d("Hasil", response.body()!!.data.toString())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }

    fun getCnnNasionalNews() {
        ApiClient.getCnnNasionalService.getCnnNasionalNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _cnnNasionalNews.postValue(response.body())
//                            Log.d("Hasil", response.body()!!.data.toString())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }

    fun getCnbcTerbaruNews() {
        ApiClient.getCnbcTerbaruService.getCnbcTerbaruNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _cnbcTerbaruNews.postValue(response.body())
//                            Log.d("Hasil", response.body()!!.data.toString())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }

    fun getCnbcTechNews() {
        ApiClient.getCnbcTechService.getCnbcTechNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _cnbcTechNews.postValue(response.body())
//                            Log.d("Hasil", response.body()!!.data.toString())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }

    fun getCnbcLifestyleNews() {
        ApiClient.getCnbcLifestyleService.getCnbcLifestyleNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _cnbcLifestyleNews.postValue(response.body())
//                            Log.d("Hasil", response.body()!!.data.toString())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }
}