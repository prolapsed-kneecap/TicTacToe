package com.example.animcanvas

import android.graphics.Canvas

abstract class Drawn {
    var createTime = 0

    abstract fun draw(canvas: Canvas)
}