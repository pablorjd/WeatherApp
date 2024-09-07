package dev.pablorjd.weatherapp.data.models

import com.google.gson.annotations.SerializedName

data class WeatherInformation(
    @SerializedName("dt") val dt: Long,
    @SerializedName("main") val main: Main,
    @SerializedName("weather") val weather: List<Weather>,
    @SerializedName("clouds") val clouds: Clouds,
    @SerializedName("wind") val wind: Wind,
    @SerializedName("visibility") val visibility: Long,
    @SerializedName("pop") val pop: Long,
    @SerializedName("sys") val sys: Sys,
    @SerializedName("dt_txt") val dtTxt: String
)
