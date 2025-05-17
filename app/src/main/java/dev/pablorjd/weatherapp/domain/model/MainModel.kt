package dev.pablorjd.weatherapp.domain.model



data class MainModel(
    val temp: Double,
    val feelsLike: Double,
    val tempMin: Double,
    val tempMax: Double,
    val pressure: Long,
    val seaLevel: Long,
    val grndLevel: Long,
    val humidity: Long,
    val tempKf: Double
)
