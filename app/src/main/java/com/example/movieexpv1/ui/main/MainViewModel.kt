package com.example.movieexpv1.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.movieexpv1.common.network.Resource
import com.example.movieexpv1.data.repository.ShowRepository
import com.example.movieexpv1.di.app.domain.model.Show
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val showRepository: ShowRepository
) : ViewModel() {
    private var _showFlow = Channel<Resource<List<Show>>>(Channel.BUFFERED)
    var showFlow = _showFlow.receiveAsFlow()

    fun getShows() {
        viewModelScope.launch {
            showRepository.getShowList()
                .catch {
                    _showFlow.send(Resource.error(it.message!!))
                }
                .collect {
                    _showFlow.send(it)
                }
        }
    }
}
