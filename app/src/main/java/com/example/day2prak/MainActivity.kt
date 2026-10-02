package com.example.day2prak

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.day2prak.ui.theme.Day2prakTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Day2prakTheme{
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Memanggil Layout standar dengan padding dari Scaffold
                    TugasPraktikumLayout(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}