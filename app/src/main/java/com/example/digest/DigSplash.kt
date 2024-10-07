package com.example.digest

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.digest.ui.theme.DigestTheme

@Composable
fun DigSplash() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.splashscreen_bgn),
            contentDescription = "Background Image",
            modifier = Modifier.fillMaxSize()
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.size(1000.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.loader),
                    contentDescription = "Loader Logo",
                    modifier = Modifier.size(950.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.logo_digester),
                    contentDescription = "DigestSense Logo",
                    modifier = Modifier.size(225.dp)
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
