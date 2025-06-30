package br.com.thalesnishida.easytik.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import br.com.thalesnishida.easytik.extentions.navigateTo
import br.com.thalesnishida.easytik.ui.screens.HomeScreen
import br.com.thalesnishida.easytik.viewmodels.impl.HomeViewModelImpl


fun NavGraphBuilder.homeScreen(navController: NavController) {
    composable<Home> {
        HomeScreen(navController, hiltViewModel<HomeViewModelImpl>())
    }
}

fun NavController.navigateToHomeScreen() {
    navigateTo(Home)
}