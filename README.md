# Weather App

A simple Android weather application built with Jetpack Compose and Retrofit that displays current weather information for any city.

## Features

* Search weather by city name
* Displays city name, country, temperature, and weather condition
* Shows a card with additional information:

  * Humidity
  * Wind Speed
  * UV Index
  * Precipitation
  * Local Time
  * Local Date
* Asynchronous image loading using Coil


## Tech Stack

* **Language:** Kotlin
* **UI:** Jetpack Compose
* **Networking:** Retrofit with Gson converter
* **Image Loading:** Coil
* **Architecture:** MVVM with LiveData

## Getting Started

### Prerequisites

* Android Studio Flamingo (or later)
* Gradle 8.0+
* Kotlin 1.8+

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/M-Subhan10/Weather-APP.git
   ```
2. Open Android Studio and select **Open an existing project**.
3. Navigate to the cloned `Weather-APP` folder.
4. Let Gradle sync and build the project.

### Running the App

1. Connect an Android device or start an emulator.
2. Click **Run** in Android Studio or execute:

   ```bash
   ./gradlew installDebug
   ```

## Dependencies

Key dependencies in `build.gradle.kts`:

```kotlin
implementation("com.squareup.retrofit2:retrofit:2.11.0")
implementation("com.squareup.retrofit2:converter-gson:2.11.0")
implementation("io.coil-kt:coil-compose:2.5.0")
implementation("androidx.compose.material3:material3:1.0.1")
implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
implementation("androidx.activity:activity-compose:1.7.0")
```

## Contributing

Contributions are welcome! Feel free to open issues and submit pull requests.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.


Made with ❤️ by Muhammad Subhan
