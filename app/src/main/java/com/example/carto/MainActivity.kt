package com.example.carto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
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




    Image(
        painter = painterResource(id = R.drawable.corinthians),
        contentDescription =null,
        contentScale = ContentScale.Crop,
        alpha = 1.2F,
        modifier = Modifier.fillMaxSize()
    )

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(15.dp),
        modifier = Modifier.fillMaxSize()

        ){


        Text(
            text = "Salve o Corinthians",
            fontSize = 40.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Black,
            fontFamily = FontFamily.Default,
            lineHeight = 60.sp,
            color = Color.Gray,

        )
        Text(
            text = "Por que tá foda",
            fontSize = 27.sp,
            textAlign = TextAlign.Center,
            color = Color.Gray,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp)

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
        fontWeight = FontWeight.Black,
        fontFamily = FontFamily.Default,
        color = Color.Gray,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp)
    )
}

