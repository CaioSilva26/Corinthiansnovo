package com.example.carto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carto.ui.theme.CartãoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartãoTheme {
                TextoCartao()


            }
        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun TextoCartao(){


Box {


    Image(
        painter = painterResource(id = R.drawable.vai_timao),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        alpha = 1.2F,
        modifier = Modifier.fillMaxSize()


    )
}
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(13.dp),
        modifier = Modifier.fillMaxSize()


        ){


        Text(
            text = "Corinthians",
            fontSize = 40.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Black,
            fontFamily = FontFamily.Default,
            lineHeight = 60.sp,
            color = Color.White,


        )
        Text(
            text = "Alvinegro",
            fontSize = 27.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Black,
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 500.dp)

        )
        Dedicatoria(nomes = "De: Caio")
        Dedicatoria(nomes = " Para: Todos")
    }

}

@Composable
fun Dedicatoria(nomes: String){
    Text(
        text = nomes,
        fontSize = 24.sp,
        textAlign = TextAlign.End,
        fontFamily = FontFamily.Default,
        color = Color.White,
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 16.dp),

    )
}




