package com.faizul.lovemedia.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.faizul.lovemedia.data.model.NewsResponse
import com.faizul.lovemedia.data.repository.NewsRepository

class NewsViewModel(private val repository: NewsRepository): ViewModel() {
//    Republika
    val republikaTerbaruNews: LiveData<NewsResponse> = repository.republikaTerbaruNews
    val republikaKhazanahNews: LiveData<NewsResponse> = repository.republikaKhazanahNews
    val republikaInternasionalNews: LiveData<NewsResponse> = repository.republikaInternasionalNews

    fun getRepublikaTerbaruNews() {
        repository.getRepublikaTerbaruNews()
    }
    fun getRepublikaKhazanahNews() {
        repository.getRepublikaKhazanahNews()
    }
    fun getRepublikaInternasionalNews() {
        repository.getRepublikaInternasionalNews()
    }

//    CNN
    val cnnTerbaruNews: LiveData<NewsResponse> = repository.cnnTerbaruNews
    val cnnHiburanNews: LiveData<NewsResponse> = repository.cnnHiburanNews
    val cnnNasionalNews: LiveData<NewsResponse> = repository.cnnNasionalNews

    fun getCnnTerbaruNews() {
        repository.getCnnTerbaruNews()
    }
    fun getCnnHiburanNews() {
        repository.getCnnHiburanNews()
    }
    fun getCnnNasionalNews() {
        repository.getCnnNasionalNews()
    }

//    CNBC
    val cnbcTerbaruNews: LiveData<NewsResponse> = repository.cnbcTerbaruNews
    val cnbcTechNews: LiveData<NewsResponse> = repository.cnbcTechNews
    val cnbcLifestyleNews: LiveData<NewsResponse> = repository.cnbcLifestyleNews

    fun getCnbcTerbaruNews() {
        repository.getCnbcTerbaruNews()
    }
    fun getCnbcTechNews() {
        repository.getCnbcTechNews()
    }
    fun getCnbcLifestyleNews() {
        repository.getCnbcLifestyleNews()
    }
}