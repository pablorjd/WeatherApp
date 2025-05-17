package dev.pablorjd.weatherapp.domain.model

data class WeatherDescriptionModel(
    val id: Int,
    val main: String,
    val description: String,
    val icon: String
)
