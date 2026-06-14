# Spring Core Demo

A Spring Boot Maven project demonstrating core Spring Framework concepts and best practices.

## Project Details

- **Project Name**: spring-core-demo
- **Group ID**: in.codekredos
- **Artifact ID**: spring-code-demo
- **Build Tool**: Maven
- **Java Version**: 17
- **Spring Boot Version**: 3.1.5

## Project Structure

```
spring-core-demo/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── in/codekredos/
│   │   │       └── SpringCoreDemoApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
├── pom.xml
└── README.md
```

## Building the Project

### Prerequisites
- Java Development Kit (JDK) 17 or higher
- Maven 3.6.0 or higher

### Build Instructions

1. Navigate to the project directory:
   ```bash
   cd spring-core-demo
   ```

2. Build the project:
   ```bash
   mvn clean compile
   ```

3. Package the project:
   ```bash
   mvn clean package
   ```

## Running the Application

To run the application:

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080` by default.

## Dependencies

### Included
- **spring-boot-starter-web**: For building web applications
- **spring-boot-starter-test**: For testing

## Configuration

Application settings can be configured in `src/main/resources/application.properties`:

- `spring.application.name`: Application name
- `server.port`: Server port (default: 8080)
- `logging.level.root`: Root logging level

## Development

### IDE Setup
This project is compatible with:
- IntelliJ IDEA
- Eclipse
- Visual Studio Code (with appropriate extensions)

## License

This project is open source and available under the MIT License.
