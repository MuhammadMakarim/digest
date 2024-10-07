package com.example.digest

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.layout.ContentScale
import com.example.digest.ui.theme.DigestTheme

@Composable
fun DigSplash() {
    val infiniteTransition = rememberInfiniteTransition()

    // Animation for rotation
    val rotation = infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(2000, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        )
    )

    // Animation for color transition
    val colorTransition = infiniteTransition.animateColor(
        initialValue = Color.White,
        targetValue = Color(0xFF3CE5FC),
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 2000, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        )
    )

    Box(modifier = Modifier.fillMaxSize()) {
        BackgroundImage()
        CenteredContent(rotation.value, colorTransition.value)
    }
}

@Composable
fun BackgroundImage() {
    Image(
        painter = painterResource(id = R.drawable.splashscreen_bgn),
        contentDescription = "Background Image",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun CenteredContent(rotation: Float, arcColor: Color) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.size(300.dp)
        ) {
            RotatingArc(rotation, arcColor)
            StaticLogo()
        }
    }
}

@Composable
fun RotatingArc(rotation: Float, arcColor: Color) {
    Canvas(
        modifier = Modifier
            .size(250.dp)
            .graphicsLayer(rotationZ = rotation)
    ) {
        drawArc(
            color = arcColor,
            startAngle = 0f,
            sweepAngle = 270f,
            useCenter = false,
            topLeft = Offset(0f, 0f),
            size = size,
            style = Stroke(width = 10f)
        )

        drawArc(
            color = Color(0xFF11DCE8).copy(alpha = 0.5f),
            startAngle = 0f,
            sweepAngle = 360f,
            useCenter = false,
            topLeft = Offset(0f, 0f),
            size = size,
            style = Stroke(width = 10f)
        )
    }
}

@Composable
fun StaticLogo() {
    Image(
        painter = painterResource(id = R.drawable.logo_digester),
        contentDescription = "DigestSense Logo",
        modifier = Modifier.size(200.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun DigSplashPreview() {
    DigestTheme {
        DigSplash()
    }
}
