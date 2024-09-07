package dev.pablorjd.weatherapp.data.models

import com.google.gson.annotations.SerializedName

data class ApiResponse(
    @SerializedName("cod") val cod: String,
    @SerializedName("message") val message: Long,
    @SerializedName("cnt") val cnt: Long,
    @SerializedName("list") val list: List<WeatherInformation>,
    @SerializedName("city") val city: City
)
