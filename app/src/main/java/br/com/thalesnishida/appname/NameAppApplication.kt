package br.com.thalesnishida.appname

import android.app.Application
import br.com.thalesnishida.appname.extentions.registerDataReceiver
import br.com.thalesnishida.appname.extentions.unRegisterDataReceiver
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class NameAppApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        registerDataReceiver()
    }

    override fun onTerminate() {
        super.onTerminate()
        unRegisterDataReceiver()
    }
}