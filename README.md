# CashFlow

## Overview
CashFlow is a financial management Android application designed to track expenses, income, and budget allocations efficiently. The project provides a user-friendly interface for managing financial records with insightful analytics and reporting features.

## Features
- **Expense Tracking**: Log and categorize expenses effortlessly.
- **Income Management**: Record and manage income sources.
- **Budget Allocation**: Set budget limits and track progress.
- **Analytics & Reports**: Gain insights with charts and summaries.
- **Multi-Currency Support**: Manage finances in different currencies.
- **Dark Mode Support**: Switch between light and dark themes.

## Tech Stack
- **UI Framework**: Jetpack Compose
- **Architecture**: Clean Architecture (with MVVM pattern)
- **State Management**: StateFlow, LiveData
- **Networking**: Retrofit, OkHttp
- **Database**: Room Database
- **Dependency Injection**: Hilt
- **Authentication**: Firebase Authentication

## Project Structure (Clean Architecture)
The project follows Clean Architecture principles with the following layers:

### **1. Presentation Layer**
- Jetpack Compose UI components
- ViewModels (using StateFlow & LiveData)

### **2. Domain Layer**
- Use Cases (business logic)
- Repository Interfaces (abstraction for data sources)

### **3. Data Layer**
- Repository Implementations (fetching from local and remote sources)
- Room Database (local storage)
- Retrofit API Service (network calls)
- Firebase Authentication (user authentication)

## Installation
### Prerequisites
Ensure you have the following installed:
- Android Studio (latest version)
- Java 11 or newer
- Gradle (bundled with Android Studio)

### Steps
1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/CashFlow.git
   cd CashFlow
   ```
2. Open the project in Android Studio.
3. Sync the Gradle dependencies.
4. Set up environment variables:
   - Copy `local.properties.example` to `local.properties` and configure necessary values.
5. Run the application on an emulator or physical device:
   ```sh
   ./gradlew installDebug
   ```

## Build & Deployment
To build the project for release:
```sh
./gradlew assembleRelease
```
To generate an APK:
```sh
./gradlew bundleRelease
```

## Testing
Run unit tests using:
```sh
./gradlew test
```
Run instrumentation tests:
```sh
./gradlew connectedAndroidTest
```

## Contribution Guidelines
1. Fork the repository and create a new feature branch.
2. Make necessary changes and commit with descriptive messages.
3. Push to your fork and submit a Pull Request.

## License
This project is licensed under the MIT License.

## Contact
For any inquiries, reach out to [markjeraldc@gmail.com] or open an issue in the repository.

