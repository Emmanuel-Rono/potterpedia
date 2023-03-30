package com.emmanuel_rono.potterpedia

import retrofit2.http.GET

interface HarryInterface {
    @GET("/characters")
    suspend fun  getCharacters():retrofit2.Response<PotterDataItem>
}