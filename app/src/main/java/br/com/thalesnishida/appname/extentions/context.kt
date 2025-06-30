package br.com.thalesnishida.appname.extentions

import android.content.Context
import android.content.IntentFilter
import android.net.ConnectivityManager
import br.com.thalesnishida.appname.receivers.MobileDataReceiver

@Suppress("DEPRECATION")
fun Context.registerDataReceiver() {
    val intentFilter = IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION)
    registerReceiver(MobileDataReceiver.mobileDataReceivers, intentFilter)
}

fun Context.unRegisterDataReceiver() {
    unregisterReceiver(MobileDataReceiver.mobileDataReceivers)
}

