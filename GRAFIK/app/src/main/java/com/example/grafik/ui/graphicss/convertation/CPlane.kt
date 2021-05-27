package com.example.grafik.ui.graphicss.convertation

import java.lang.Math.abs

class CPlane(
    var xMin: Float,
    var xMax: Float,
    var yMin: Float,
    var yMax: Float,
    var width: Int,
    var height: Int
) {
    fun odin(){
        var yy=yMax-yMin
       var xx=xMax-xMin
        //отступ слева
        var kx1=abs(xMin-0)/xx
        //отступ снизу
        var ky1=abs(yMax-0)/yy

        //первая линия
        var x0=0F
        var y0=ky1*height
        var x1=width
        var y1=y0
          //  вторая линия
        var x00=width*kx1
        var y00=0F
        var x11=x00
        var y11=height

    }


}
