package com.shahankbhat.myapp.service

import com.shahankbhat.myapp.model.SampleModelResponse
import retrofit2.Response
import retrofit2.http.GET

interface MainService {

    @GET("v1/json/a685e85b-e90a-421b-8e11-9973179fa471")
    suspend fun getSampleData() : Response<SampleModelResponse>
}