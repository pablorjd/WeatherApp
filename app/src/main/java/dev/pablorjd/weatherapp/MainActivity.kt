package dev.pablorjd.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.pablorjd.weatherapp.ui.theme.WeatherAppTheme
import dev.pablorjd.weatherapp.ui.theme.background
import dev.pablorjd.weatherapp.ui.theme.colorFont

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WeatherAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { paddingValues ->

                    Column(modifier = Modifier.padding(paddingValues)) {
                        Location()
                    }

                }
            }
        }
    }
}

@Composable
fun Location() {

    //https://github.com/pablorjd/SimpleAndroidMVVM/tree/master/app/src/main/java/com/cursokotlin/mvvmexample/ui
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(background)
            .padding(top = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Valparaíso",
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold,
            color = colorFont
        )
        //Spacer(modifier = Modifier.size(16.dp))
        Image(
            painter = painterResource(id = R.drawable.ic_sunny),
            contentDescription = "",
            modifier = Modifier.size(200.dp),
            colorFilter = ColorFilter.tint(Color.Yellow)
        )

        Spacer(modifier = Modifier.weight(1f))
        DescriptionWeather()
        Spacer(modifier = Modifier.weight(1f))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                //.fillMaxSize()
                .padding(32.dp),
            //horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            for (i in 1..5) {
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    Text(
                        text = "Lunes",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal
                        ,color = colorFont
                    )
                    Image(
                        painter = painterResource(id = R.drawable.ic_wind),
                        contentDescription = "",
                        modifier = Modifier.size(24.dp),
                        colorFilter = ColorFilter.tint(colorFont)
                    )
                    Text(
                        text = "12°",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal,
                        color = colorFont
                    )
                }
            }
           
        }
    }
}

@Composable
fun DescriptionWeather() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "4°",
            fontSize = 62.sp,
            fontWeight = FontWeight.Bold,
            color = colorFont,
            modifier = Modifier.padding(16.dp)
        )
        Text(text = "Viento", fontSize = 18.sp, color = colorFont)
        Row(modifier = Modifier.padding(16.dp)) {
            Image(
                painter = painterResource(id = R.drawable.ic_wind),
                contentDescription = "",
                modifier = Modifier.size(24.dp),
                colorFilter = ColorFilter.tint(colorFont)
            )
            Text(text = "9 ms", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = colorFont)

        }

    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WeatherAppTheme {

        Location()
    }
}