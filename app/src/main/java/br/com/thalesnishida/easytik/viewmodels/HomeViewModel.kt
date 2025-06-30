package br.com.thalesnishida.easytik.viewmodels

import br.com.thalesnishida.easytik.ui.state.HomeUIState
import kotlinx.coroutines.flow.StateFlow

interface HomeViewModel {
    val uiState: StateFlow<HomeUIState>
    fun setTest(test: String)
}