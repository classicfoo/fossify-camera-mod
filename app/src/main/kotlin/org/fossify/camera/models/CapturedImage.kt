package org.fossify.camera.models

import android.graphics.Rect

data class CapturedImage(
    val data: ByteArray,
    val format: Int,
    val width: Int,
    val height: Int,
    val cropRect: Rect,
    val rotationDegrees: Int,
    val shouldUseExifOrientation: Boolean,
)
