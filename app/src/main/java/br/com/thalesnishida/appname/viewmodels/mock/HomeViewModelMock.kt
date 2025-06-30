package br.com.thalesnishida.appname.viewmodels.mock

import androidx.lifecycle.ViewModel
import br.com.thalesnishida.appname.ui.state.HomeUIState
import br.com.thalesnishida.appname.viewmodels.HomeViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class HomeViewModelMock : ViewModel(), HomeViewModel {
    private val _uiState: MutableStateFlow<HomeUIState> = MutableStateFlow(HomeUIState())
    override val uiState: StateFlow<HomeUIState> get() = _uiState

    override fun setTest(test: String) {}
}