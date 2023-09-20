package com.example.tarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaPresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Samu")
                }
            }
        }
    }
}

@Composable
fun Greeting(nombre: String, email: String, telefono: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $nombre!",
        modifier = modifier
    )
}


@Composable
fun imagenFondo(nombre: String, email: String, telefono: String, modifier: Modifier = Modifier){
    val imgFondo = painterResource(R.drawable.grupo4)
    Box{
        Image(
            painter = imgFondo,
            contentDescription = null
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarjetaPresentacionTheme {
        imagenFondo("Samu","samuelito14@gmail.com","(+34)432251235")
    }
}