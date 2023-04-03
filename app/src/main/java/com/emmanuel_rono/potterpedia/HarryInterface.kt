package com.emmanuel_rono.potterpedia
import retrofit2.Response
import retrofit2.http.GET
interface HarryInterface {
    @GET("/characters")
    suspend fun getCharacters(): Response<List<PotterDataItem>>
}