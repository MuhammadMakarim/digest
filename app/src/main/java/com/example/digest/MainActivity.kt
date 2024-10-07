package com.example.digest

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import com.example.digest.ui.theme.DigestTheme
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DigestTheme {
                DigSplashPreview()
            }
        }
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }

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
}

