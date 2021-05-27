package com.example.grafik

import android.content.Context
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.Manifest

class locationhelper:LocationListener {
    companion object{
        //СОХРАНЁННОЕ МЕСТОПОЛОЖЕНИЕ
        var imHere: Location? =null

        //Начало мониторирования координат устройства
        fun startlocationlistening(context: Context){
            val locationManager=context.getSystemService(Context.LOCATION_SERVICE) as LocationManager
            //запрос на получение измененных координат
            if(context.checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                //при ошибке доступа СФОРМИРОВАТЬ ЗАПРОС
                return
            }
            locationManager.requestLocationUpdates(
                    LocationManager.GPS_PROVIDER,//cпособ определения координат
                    500L,//КОЛИЧЕСТВО МИЛИСЕКУНД МЕЖДУ ИЗВЕЩЕНИЯМИ(Имеет рекомендательный хар-р)
                    10F,//мин. расстояние в метрах об изменении устр-ва, чтобы служба нас известила
                    locationhelper()//класс,получающий уведомление от службы
            )



        }


        }
    }



    override fun onLocationChanged(location: Location) {
        //метод вызывается системой при изменении местоположения устройства
        imHere = location
    }
}