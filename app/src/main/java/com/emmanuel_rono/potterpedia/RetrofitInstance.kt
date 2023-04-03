package com.emmanuel_rono.potterpedia

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance
{
    //initialise API
    val api: HarryInterface by lazy {
        Retrofit.Builder()
            .baseUrl("https://hp-api.onrender.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build() //to build the api
            .create(HarryInterface::class.java) //Builds the object
    }

}