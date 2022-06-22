package com.example.animcanvas

import android.graphics.Canvas

class MarkDrawer : Drawn() {

    var state = AnimState.ANIMATING

    override fun draw(canvas: Canvas) {
        if (state == AnimState.ANIMATING) {
            canvas.drawLine(0f, 0f, 250f, 250f)
        }
    }
}