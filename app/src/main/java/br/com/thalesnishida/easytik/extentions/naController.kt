package br.com.thalesnishida.easytik.extentions

import androidx.navigation.NavController
import br.com.thalesnishida.easytik.navigation.Route

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