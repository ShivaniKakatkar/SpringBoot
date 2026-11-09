# Profile Concepts

A Spring Boot project that demonstrates **Spring Profiles**. Profiles let the same application use different configuration and different beans in different environments (dev, staging, prod).

## What This Project Shows

- Default configuration in `application.properties`
- Environment-specific files: `application-dev.properties`, `application-staging.properties`, `application-prod.properties`
- Selecting the active profile with `spring.profiles.active`
- Using `@Profile` to choose which bean is created
- Two implementations of one interface (`NotificationService`), where the active profile decides which one is used
- Simple REST controllers to see the result in the browser

## Tech Stack

- Java 21
- Spring Boot 4.1.2
- Maven

## Project Structure

```
05-ProfileConcepts
├── src
│   └── main
│       ├── java/com/strikes/profileDemo
│       │   ├── controller
│       │   │   ├── DemoController
│       │   │   └── NotificationController
│       │   ├── service
│       │   │   ├── NotificationService            (interface)
│       │   │   ├── NotificationServiceImpl        (real implementation)
│       │   │   └── DummyNotificationServiceImpl   (dummy implementation)
│       │   └── ProfileDemoApplication
│       └── resources
│           ├── application.properties
│           ├── application-dev.properties
│           ├── application-staging.properties
│           └── application-prod.properties
├── pom.xml
└── README.md
```

## Profiles

| Profile | File | Purpose |
|---|---|---|
| default | `application.properties` | Settings shared by all profiles |
| dev | `application-dev.properties` | Local development |
| staging | `application-staging.properties` | Pre-production testing |
| prod | `application-prod.properties` | Production |

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/ShivaniKakatkar/SpringBoot.git
   cd SpringBoot/05-ProfileConcepts
   ```
2. Run with the default profile:
   ```bash
   mvn spring-boot:run
   ```
3. Run with a specific profile:
   ```bash
   mvn spring-boot:run "-Dspring-boot.run.profiles=dev"
   mvn spring-boot:run "-Dspring-boot.run.profiles=staging"
   mvn spring-boot:run "-Dspring-boot.run.profiles=prod"
   ```
4. Open the endpoints in the browser, for example `http://localhost:8080/...` (use the paths defined in `DemoController` and `NotificationController`).

## Notes

- If no profile is set, Spring Boot logs: `No active profile set, falling back to 1 default profile: "default"`.
- If you get "Port 8080 was already in use", stop the other running app or set a different `server.port` in the profile file.

## Author

Shivani Kakatkar