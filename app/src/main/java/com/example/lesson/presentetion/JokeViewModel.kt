package com.example.lesson.presentetion

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lesson.data.JokeRepository
import com.example.lesson.ui.model.JokeState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch

class JokeViewModel(private val repository: JokeRepository) : ViewModel() {
    private val _state = MutableStateFlow<JokeState>(JokeState.Idle)
    val state: StateFlow<JokeState> get() = _state

    fun loadJoke() {
        viewModelScope.launch {
            repository.fetchJokeFlow()
                .flowOn(Dispatchers.IO)
                .filter { it.length > 50 }
                .map { "Фильтрованная штка: $it" }
                .onStart { _state.value = JokeState.Loading }
                .catch { e -> _state.value = JokeState.Error("Error: ${e.message}") }
                .collect { joke -> _state.value = JokeState.Success(joke) }
        }


    }

}