package com.example.grafik.ui.graphicss

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import com.example.grafik.ui.graphicss.convertation.CPlane

class CPainter(context: Context, attrs: AttributeSet? ) : View(context,attrs) {

    constructor(context: Context) : this(context, null)

    val bgPaint = Paint()
    val osiPaint = Paint()
//    val plane = CPlane()
    init{
        bgPaint.color=0xffffffd8.toInt()
        osiPaint.color=0xff0000ff.toInt()
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawPaint(bgPaint)
        canvas?.drawLine(0F,height/2.toFloat(),  width.toFloat(),height/2.toFloat(),osiPaint)
        canvas?.drawLine(width/2.toFloat(),0F, width/2.toFloat(), height.toFloat(),osiPaint)

    }


}