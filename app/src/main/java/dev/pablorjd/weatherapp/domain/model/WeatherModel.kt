package dev.pablorjd.weatherapp.domain.model

data class WeatherModel(
    val weather: List<MainModel>,
    val main: WeatherDescriptionModel,
    val name: String
)

//fun WeatherModel.toUIModel():
