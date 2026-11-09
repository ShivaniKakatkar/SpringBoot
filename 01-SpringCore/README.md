# Spring Core

This project contains my practice code for the core concepts of the Spring Framework. Each concept is in its own package under `src/main/java/com`, with matching XML configuration files in `src/main/resources`.

## Topics Covered

| Package | Concept |
|---|---|
| `reference` | Setter injection with references to other beans |
| `constinjec` | Constructor injection |
| `collections` | Injecting collections (List, Set, Map, Properties) |
| `Standalonecollections` | Standalone collections using the `util` namespace |
| `autowiring` | Autowiring with XML configuration |
| `autowiringannotation` | Autowiring with `@Autowired` |
| `lifecycle` | Bean life cycle (init and destroy methods, annotations) |
| `stereotype` | Stereotype annotations (`@Component`, etc.) |
| `annotations` | Java-based configuration (`@Configuration`, `@Bean`) |
| `springcore` | Spring Boot application entry point |

## Tech Stack

- Java 21
- Spring Framework / Spring Boot
- Maven

## Project Structure

```
01-SpringCore
├── src
│   ├── main
│   │   ├── java/com/...        # Java classes grouped by concept
│   │   └── resources           # XML configuration files
│   └── test
├── pom.xml
└── README.md
```

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/ShivaniKakatkar/SpringBoot.git
   ```
2. Open the `01-SpringCore` folder in IntelliJ IDEA.
3. Let Maven load the dependencies.
4. Open the `Test.java` file inside any package and run its `main` method.

## Author

Shivani Kakatkar