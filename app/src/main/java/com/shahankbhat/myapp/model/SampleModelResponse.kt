package com.shahankbhat.myapp.model


import com.google.gson.annotations.SerializedName

data class SampleModelResponse(
    @SerializedName("tutorials")
    val tutorials: ArrayList<Tutorial>?
)