package me.mariananino.tallergitgithubapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyPresentacion()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyPresentacion() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(18.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.height(40.dp))

        Image(
            painter = painterResource(id = R.drawable.mariana),
            contentDescription = "Foto de perfil",
            modifier = Modifier
                .size(140.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "MARIANA NIÑO",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "Desarrolladora Android, Ingeniera de Sistemas y de Mercados",
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(24.dp))
        Divider()
        Spacer(modifier = Modifier.height(16.dp))

        Column(modifier = Modifier.fillMaxWidth()) {
            Text(text = "EDAD", fontWeight = FontWeight.Bold, fontSize = 12.sp)
            Text(text = "20 años", fontSize = 14.sp)

            Spacer(modifier = Modifier.height(12.dp))

            Text(text = "CORREO", fontWeight = FontWeight.Bold, fontSize = 12.sp)
            Text(text = "mnino499@unab.edu.co", fontSize = 14.sp)

            Spacer(modifier = Modifier.height(12.dp))

            Text(text = "CIUDAD", fontWeight = FontWeight.Bold, fontSize = 12.sp)
            Text(text = "Bucaramanga, Colombia", fontSize = 14.sp)
        }
    }
}