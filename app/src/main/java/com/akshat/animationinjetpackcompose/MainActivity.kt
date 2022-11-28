package com.akshat.animationinjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.akshat.animationinjetpackcompose.ui.theme.AnimationInJetPackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimationInJetPackComposeTheme {
                Home()
            }
        }
    }
}
