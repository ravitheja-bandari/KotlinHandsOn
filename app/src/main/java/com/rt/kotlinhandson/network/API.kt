package com.rt.kotlinhandson.network

import com.rt.kotlinhandson.responses.Topics
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Field
import retrofit2.http.GET

 interface API {

    @GET ("topics")
    suspend fun getTopics() : Response<List<Topics>>

    fun login(@Field("email")email: String,@Field("password")password: String): Any


    companion object{
        operator fun invoke(): API {

            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://demo9358046.mockable.io/")
                .build()
                .create(API::class.java)
        }
    }
}