package com.example.digest

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import org.eclipse.paho.client.mqttv3.*

class MonitoringDigester : ComponentActivity() {

    private lateinit var mqttAndroidClient: MqttClientManager

    @Composable
    fun MainScreen() {
        var input by remember { mutableStateOf(TextFieldValue("")) }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Button(onClick = { connect() }) {
                Text("Connect to Broker")
            }

            Spacer(modifier = Modifier.height(16.dp))

            BasicTextField(
                value = input,
                onValueChange = { input = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .background(Color.LightGray)
                    .padding(16.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Button(onClick = { publish("galihashari", input.text) }) {
                Text("Publish Message")
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                MainScreen()
            }
        }
    }

    private fun connect() {
        mqttAndroidClient = MqttClientManager(
            applicationContext,
            "tcp://broker.emqx.io:1883",
            "galihashari",
            { message -> Log.d("galihasharir", "message: $message") }
        )

        mqttAndroidClient.connect()
    }

    private fun subscribe(topic: String, qos: Int = 1) {
        mqttAndroidClient.subscribe(topic, qos)
    }

    private fun publish(topic: String, msg: String, qos: Int = 1, retained: Boolean = false) {
        mqttAndroidClient.publish(topic, msg, qos, retained)
    }
}