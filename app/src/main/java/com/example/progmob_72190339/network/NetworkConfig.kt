package com.example.progmob_72190339.network

import com.example.progmob_72190339.model.ResponsePetani
import com.example.progmob_72190339.model.ResponseUsersItem
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

class NetworkConfig {
    fun getInterceptor() : OkHttpClient {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY
        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()
        return okHttpClient
    }

    fun getRetrofit() : Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://192.168.100.134/Slim_72190339/public/")
            .client(getInterceptor())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            }
        fun getService() = getRetrofit().create(Users::class.java)
    }
    interface Users {
        @GET("users")
        fun getUsers(): Call<List<ResponseUsersItem>>

        @GET("petani/")
        fun getPetaniAll(): Call<ResponsePetani>

    }