package com.shahankbhat.myapp.model

import com.google.gson.annotations.SerializedName

data class Tutorial(
    @SerializedName("name")
    val name: String?,
    @SerializedName("imageurl")
    val imageurl: String?,
    @SerializedName("description")
    val description: String?
)