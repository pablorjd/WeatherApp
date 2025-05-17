package dev.pablorjd.weatherapp.data.models

import com.google.gson.annotations.SerializedName

data class ApiResponse(
    @SerializedName("cod") val cod: String,
    @SerializedName("message") val message: Long,
    @SerializedName("cnt") val cnt: Long,
    @SerializedName("list") val list: List<Unit>,
    @SerializedName("city") val city: City
)

/*fun ApiResponse.toWeatherInformationList(): ApiResponse {
    return ApiResponse(
        cod = this.cod,
        message = this.message,
        cnt = this.cnt,
        //list = this.list.map { it.toWeatherInformation() },
        //city = this.city
    )
}*/
