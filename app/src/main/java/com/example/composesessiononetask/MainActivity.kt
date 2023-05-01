package com.example.composesessiononetask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.composesessiononetask.mainActivity.CenterText
import com.example.composesessiononetask.mainActivity.ImageViewWithRadius
import com.example.composesessiononetask.mainActivity.JustDot
import com.example.composesessiononetask.mainActivity.SubscribeButton
import com.example.composesessiononetask.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeSessionOneTaskTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MainBackground)
                ) {
                    PartOne(myModifier = Modifier.weight(0.6f))
                    PartTwo(myModifier = Modifier.weight(2f))
                    PartThree(myModifier = Modifier.weight(1f))
                }
            }
        }
    }

    @Composable
    fun PartOne(myModifier: Modifier) {
        Box(modifier=Modifier.padding(16.dp, 16.dp)) {
            JustDot(innerColor = Color.White)
        }
        Spacer(modifier = myModifier)
    }

    @Composable
    fun PartTwo(myModifier: Modifier) {
        Box(modifier = myModifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .align(Alignment.Center)
            ) {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Spacer(modifier = Modifier.weight(1f))
                    Box(modifier = Modifier.weight(1f)) {
                        ImageViewWithRadius(id = R.drawable.ic_video, 20 , padding = 20 , Purple500)
                    }
                    Spacer(modifier = Modifier.weight(1f))
                }
                CenterText(text = "WATCH\nVIDEO", textColor = Color.White, textSize = 36)
                CenterText(text = stringResource(id = R.string.just_text), textColor = Color.White)
                Spacer(modifier = Modifier.height(10.dp))
                Row(modifier = Modifier.fillMaxWidth()) {
                    Spacer(modifier = Modifier.weight(1f))
                    Row( horizontalArrangement = Arrangement.SpaceAround) {
                        JustDot(innerColor = Color.White)
                        Spacer(modifier = Modifier.width(8.dp))
                        JustDot()
                    }
                    Spacer(modifier = Modifier.weight(1f))
                }
            }
        }
    }

    @Composable
    fun PartThree(myModifier: Modifier) {
        Box(modifier = myModifier) {
            SubscribeButton(
                text = "Subscribed",
                verticalPadding = 8,
                horizontalPadding = 26,
                backgroundColor = ButtonGreen
            )
        }
    }
}