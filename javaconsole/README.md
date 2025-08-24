# Java Console URL Checker

This project is a simple Java application that checks the status of a given URL and measures the response time. It utilizes Java's built-in HTTP client to send GET requests and print the response details.

## Project Structure

```
javaconsole
├── .github
│   └── workflows
│       └── ci.yml
├── src
│   └── main
│       └── java
│           └── Main.java
├── .gitignore
├── build.gradle
└── README.md
```

## Requirements

- Java 11 or higher
- Gradle

## Setup

1. Clone the repository:
   ```
   git clone <repository-url>
   cd javaconsole
   ```

2. Build the project using Gradle:
   ```
   ./gradlew build
   ```

## Usage

To run the application, use the following command:
```
java -cp build/libs/javaconsole.jar Main <url>
```
Replace `<url>` with the URL you want to check.

## GitHub Actions

This project includes a GitHub Actions workflow for continuous integration. The workflow is defined in `.github/workflows/ci.yml` and will automatically build and test the application whenever changes are pushed to the repository.

## License

This project is licensed under the MIT License.