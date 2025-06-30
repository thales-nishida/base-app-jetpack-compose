package br.com.thalesnishida.appname.extentions

import androidx.navigation.NavController
import br.com.thalesnishida.appname.navigation.Route

fun NavController.navigateTo(route: Route) {
    val currentRoute = currentBackStackEntry?.destination?.route
    navigate(route) {
        currentRoute?.let {
            popUpTo(it) {
                inclusive = true
            }
        }
    }
}