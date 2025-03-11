package com.example.lesson.ui.model

sealed class JokeState {
    object Idle : JokeState() // Начальное состояние или отсутствие данных
    object Loading : JokeState() // Загрузка
    data class Success(val joke: String) : JokeState() // Успешно загруженная шутка
    data class Error(val message: String) : JokeState() // Ошибка
}