package com.cv.testcompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.material.Button
import androidx.ui.tooling.preview.Preview
import com.cv.testcompose.ui.AppTheme
import com.cv.testcompose.ui.TopAppBarComponent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
              //  Greeting("Android")
                TopAppBarComponent()
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
    Button(onClick = {/* To execute when button is clicked */}) {
        Text("I'm a Compose Button")
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AppTheme {
        Greeting("Android")
    }
}