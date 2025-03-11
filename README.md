##Joke Teller##
Joke Teller — это Android-приложение, написанное на Kotlin, которое загружает случайные шутки про Чака Норриса через API Chuck Norris Jokes. Оно демонстрирует современные подходы к разработке: Jetpack Compose, Koin, Retrofit, Kotlin Coroutines и Flow.

##Основные возможности
-Одиночная загрузка: Нажмите кнопку "Load Joke", чтобы получить новую шутку.
-Фильтрация: Отображаются только шутки длиннее 50 символов.
-Состояния: Поддержка "Loading..." и обработка ошибок.

##Технологии
-Язык	Kotlin
-UI	Jetpack Compose
-DI	Koin
-Сеть	Retrofit + Gson
-Асинхронность	Coroutines + Flow

##Установка

##Требования
-Android Studio (Koala | 2024.1.1 или новее)
-Android SDK 21+
-Интернет для API и зависимостей
-Шаги
-Клонируйте репозиторий: git clone https://github.com/yourusername/joke-teller.git
-Откройте в Android Studio и синхронизируйте Gradle.
-Добавьте разрешение в AndroidManifest.xml:<uses-permission android:name="android.permission.INTERNET" />
Запустите на устройстве или эмуляторе.