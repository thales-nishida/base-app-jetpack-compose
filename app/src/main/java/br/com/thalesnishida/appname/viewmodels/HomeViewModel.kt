package br.com.thalesnishida.appname.viewmodels

import br.com.thalesnishida.appname.ui.state.HomeUIState
import kotlinx.coroutines.flow.StateFlow

interface HomeViewModel {
    val uiState: StateFlow<HomeUIState>
    fun setTest(test: String)
}