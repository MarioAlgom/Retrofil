package com.example.retrofil.api

import retrofit2.http.GET

interface jujuapi {
    @GET("https://botw-compendium.herokuapp.com/api/v3/compendium/all")
    suspend fun fetchContents(): String
}