package com.example.digest

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.digest.ui.theme.DigestTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import org.eclipse.paho.client.mqttv3.*

class MainActivity : ComponentActivity() {
    private lateinit var mqttClientManager: MqttClientManager
    private var messageState by mutableStateOf("")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DigestTheme {
                DigSplash()
            }
        }
        mqttClientManager = MqttClientManager(
            applicationContext,
            "tcp://broker.emqx.io:1883",
            "galihashari",
            { message ->
                messageState = message
            }
        )
        mqttClientManager.connect()

        Handler(Looper.getMainLooper()).postDelayed({
            setContent {
                DigestTheme {
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        MqttView(messageState)
                    }
                }
            }
        }, 3000)
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun MqttView(messageState: String) {
        Column {
            TopAppBar(title = { Text(text = "MQTT message") })
            Surface {
                Column {
                    Text(text = "MESSAGE:")
                    Text(text = messageState)
                }
            }
        }
    }
}