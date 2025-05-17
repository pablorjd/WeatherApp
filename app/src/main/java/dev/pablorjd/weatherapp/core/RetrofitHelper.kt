package dev.pablorjd.weatherapp.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Const.URL_BASE)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }
}