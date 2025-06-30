package br.com.thalesnishida.easytik

import android.app.Application
import br.com.thalesnishida.easytik.extentions.registerDataReceiver
import br.com.thalesnishida.easytik.extentions.unRegisterDataReceiver
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class EasytikAppApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        registerDataReceiver()
    }

    override fun onTerminate() {
        super.onTerminate()
        unRegisterDataReceiver()
    }
}