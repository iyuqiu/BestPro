package com.example.router.logic.network

import com.example.router.RouterApplication
import com.example.router.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {

    @GET("v2.6/${RouterApplication.TOKEN}/101.6656,39.2072/realtime")
    fun searchPlace(@Query("query") query:String): Call<PlaceResponse>
}