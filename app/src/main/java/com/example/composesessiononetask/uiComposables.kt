package com.example.composesessiononetask.mainActivity

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composesessiononetask.ui.theme.ButtonGreen
import com.example.composesessiononetask.ui.theme.Purple200


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun CenterText(
    text: String,
    textSize: Int = 18,
    textColor: Color = Color.White,
    horizontalMargin: Int = 0,
    verticalMargin: Int = 0
) {
    Box(
        Modifier
            .fillMaxWidth()
            .padding(horizontalMargin.dp, verticalMargin.dp)
    ) {
        Text(
            text = text, color = textColor, fontSize = textSize.sp, textAlign = TextAlign.Center,
            modifier = Modifier
                .align(Alignment.Center)
                .padding(4.dp, 8.dp)
        )
    }
}

@Composable
fun SubscribeButton(
    text: String,
    textSize: Int = 18,
    textColor: Color = Color.White,
    horizontalPadding: Int = 0,
    verticalPadding: Int = 0,
    backgroundColor: Color = Purple200
) {
    val context = LocalContext.current
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Button(
            onClick = {
                Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier
                .align(Alignment.Center),
            shape = RoundedCornerShape(20),
            colors = ButtonDefaults.buttonColors(backgroundColor = ButtonGreen)
        ) {
            Box(
                modifier = Modifier
                    .padding(horizontalPadding.dp, verticalPadding.dp)
            ) {
                Text(
                    text = text,
                    color = textColor,
                    fontSize = textSize.sp
                )
            }
        }
    }
}

@Composable
fun ImageViewWithRadius(
    id: Int,
    radius: Int = 0,
    padding: Int = 0,
    backgroundColor: Color = Color.Transparent
) {
    Image(
        painter = painterResource(id = id), contentDescription = null, modifier = Modifier
            .clip(RoundedCornerShape(radius.dp))
            .background(backgroundColor)
            .padding(padding.dp)
    )
}

@Composable
fun JustDot(borderColor: Color = Color.White, innerColor: Color= Color.Transparent) {
    Box(
        modifier = Modifier
            .width(9.dp)
            .height(9.dp)
            .clip(CircleShape)
            .border(1.dp,borderColor, CircleShape)
            .background(innerColor)

    ) {

    }
}