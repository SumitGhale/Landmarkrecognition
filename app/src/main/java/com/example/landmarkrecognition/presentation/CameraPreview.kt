package com.example.landmarkrecognition.presentation

import androidx.camera.view.LifecycleCameraController
import androidx.camera.view.PreviewView
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.LifecycleOwner

@Composable
fun CameraPreview(
    controller: LifecycleCameraController,
    modifier: Modifier
){
    val lifeCycleOwner = LocalLifecycleOwner.current
    AndroidView(factory = {
        PreviewView(it).apply{
            this.controller = controller
            controller.bindToLifecycle(lifeCycleOwner)
        }
    }, modifier = modifier)
}