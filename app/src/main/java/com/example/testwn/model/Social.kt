package com.example.testwn.model


import com.google.gson.annotations.SerializedName

data class Social(
    @SerializedName("name")
    val name: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String
)