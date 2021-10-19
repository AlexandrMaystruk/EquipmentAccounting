package com.hssoft.equipmentaccounting

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class EquipmentApp : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}