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
    // Infinite transition for continuous rotation animation
    val infiniteTransition = rememberInfiniteTransition()

    // Animate rotation from 0 to 360 degrees for the rotating line
    val rotation = infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(2000, easing = LinearEasing), // 2000ms for smooth rotation
            repeatMode = RepeatMode.Restart
        ), label = ""
    )

    // Animate the color of the arc from white to light blue
    val colorTransition = infiniteTransition.animateColor(
        initialValue = Color.White, // Starting color
        targetValue = Color(0xFF3CE5FC), // Target color
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 2000, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ), label = ""
    )

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        // Use ContentScale.Crop to ensure the background image covers the entire screen
        Image(
            painter = painterResource(id = R.drawable.splashscreen_bgn),
            contentDescription = "Background Image",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop // This ensures the image fills the entire area
        )

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.size(300.dp) // Adjusted size for the circular line and logo
            ) {
                // Rotating circular line animation
                Canvas(
                    modifier = Modifier
                        .size(250.dp)
                        .graphicsLayer(rotationZ = rotation.value) // Apply rotation animation
                ) {
                    drawArc(
                        color = colorTransition.value, // Use animated color
                        startAngle = 0f,
                        sweepAngle = 270f, // Arc angle, adjust if needed
                        useCenter = false,
                        topLeft = Offset(0f, 0f),
                        size = size,
                        style = Stroke(width = 10f) // Line width
                    )
                }

                // Adding the ellipsis with blur effect
                Canvas(
                    modifier = Modifier.size(250.dp) // Same size as the rotating arc
                ) {
                    drawArc(
                        color = Color(0xFF11DCE8).copy(alpha = 0.5f), // Ellipse color with some transparency
                        startAngle = 0f,
                        sweepAngle = 360f,
                        useCenter = false,
                        topLeft = Offset(0f, 0f),
                        size = size,
                        style = Stroke(width = 10f) // Width of the ellipse
                    )
                }

                // Static DigestSense logo in the center of the circular line
                Image(
                    painter = painterResource(id = R.drawable.logo_digester),
                    contentDescription = "DigestSense Logo",
                    modifier = Modifier.size(200.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DigSplashPreview() {
    DigestTheme {
        DigSplash()
    }
}