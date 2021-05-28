package com.shahankbhat.myapp.repository

import com.shahankbhat.myapp.model.SampleModelResponse
import com.shahankbhat.myapp.service.MainService
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainRepository {
    private var service : Retrofit = Retrofit.Builder()
        .baseUrl("https://api.jsonstorage.net/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val api = service.create(MainService::class.java)
    suspend fun getSampleData() : Response<SampleModelResponse>{
        return api.getSampleData()
    }
}