package dev.pablorjd.weatherapp.data.network

import dev.pablorjd.weatherapp.data.models.ApiResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {

    @GET("/forecast")
    suspend fun getWeatherForecast(
        @Query("lat") latitude: Double,
        @Query("lon") longitude: Double,
        @Query("appid") apiKey: String
    ): ApiResponse

}