package com.cv.testcompose.ui

import androidx.compose.Composable
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.material.IconButton
import androidx.ui.material.TopAppBar
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.Favorite
import androidx.ui.res.vectorResource
import com.cv.testcompose.R

@Composable
fun TopAppBarComponent() {
    TopAppBar(
        title = { Text("App Name") },
        navigationIcon = {
            IconButton(onClick = { /* doSomething() */ }) {
                Image(asset = vectorResource(id = R.drawable.ic_nav_back))
                /* Icon(
                     imageResource(image(R.drawable.ic_nav_back))
                 )*/
            }
        },
        actions = {
            // Here, this is a RowScope and due to this, all children will be placed
            // horizontally.
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(Icons.Filled.Favorite)
            }
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(Icons.Filled.Favorite)
            }
        }
    )
}