# Climb-Management

Backend for a climbing gym management system, built as a practice project. A gym operator manages multiple gyms, each with several sectors, each sector hosting one or more routes — depending on which belay type the sector supports.

> **Status: work in progress.** The base project structure (entities, repositories, DTOs, exception handling) is in place. Currently only the `createGym` endpoint is fully implemented and tested; all other endpoints are planned but not yet built.

## Tech Stack

- Java 21
- Spring Boot (Web, Data JPA, Validation)
- H2 (in-memory database, for development)
- Lombok
- Maven

## Domain Overview

- **Gym** — a climbing gym with a maximum number of sectors (`maxSectors`).
- **Sector** — a wall section belonging to exactly one gym, built for exactly one belay type (`TOPROPE`, `LEAD`, or `AUTO`).
- **Route** — a climbing route with a name, grade, colour and belay type. A route can hang in one or more compatible sectors at the same time.

A `LEAD` sector also supports `TOPROPE` routes (a lead wall has both quickdraws and a top anchor), while `TOPROPE` and `AUTO` sectors only support their own type.

## Getting Started

```bash
git clone <repo-url>
cd climb-management
./mvnw spring-boot:run
```

The application starts on `http://localhost:8080`. The H2 console (if enabled) is available at `/h2-console`.

## API Status

| Method | Endpoint                            | Description                      | Status        |
| ------ | ----------------------------------- | -------------------------------- | ------------- |
| POST   | `/api/gym`                          | Create a gym                     | ✅ implemented |
| GET    | `/api/gym`                          | List all gyms                    | 🔲 planned     |
| GET    | `/api/gym/{id}`                     | Get a single gym                 | 🔲 planned     |
| PUT    | `/api/gym/{id}`                     | Update a gym                     | 🔲 planned     |
| DELETE | `/api/gym/{id}`                     | Delete a gym                     | 🔲 planned     |
| POST   | `/api/sector`                       | Create a sector                  | 🔲 planned     |
| GET    | `/api/sector/{id}`                  | Get a single sector              | 🔲 planned     |
| PUT    | `/api/sector/{id}`                  | Update a sector                  | 🔲 planned     |
| DELETE | `/api/sector/{id}`                  | Delete a sector                  | 🔲 planned     |
| POST   | `/api/route`                        | Create a route                   | 🔲 planned     |
| GET    | `/api/route`                        | List / filter routes             | 🔲 planned     |
| POST   | `/api/route/{id}/sector/{sectorId}` | Assign a route to another sector | 🔲 planned     |
| POST   | `/api/route/{id}/retire`            | Retire a route                   | 🔲 planned     |

### Example: Create Gym

```
POST /api/gyms
Content-Type: application/json

{
  "name": "Boulderwelt Wien",
  "address": "Hauptstraße 1, 1010 Wien",
  "manager": "Anna Berger",
  "maxSectors": 3
}
```

Returns `201 Created` with the full gym data, or `400 Bad Request` if a required field is missing.

## Project Structure

```
src/main/java/com/example/climbmanagement
├── controller/       REST controllers
├── service/          business logic and validation rules
├── repository/        Spring Data JPA repositories
├── entity/            JPA entities
│   └── enums/          RouteType, ColorType, GradeType, StatusType
├── dto/               request/response DTOs
└── exception/         custom exceptions and the global exception handler
```

## Testing

A Postman collection covering the full set of planned endpoints and business rules (validation errors, conflict cases, cleanup flow) is included: [`Kletterhallen_API.postman_collection.json`](https://claude.ai/chat/Kletterhallen_API.postman_collection.json). Requests for endpoints that aren't implemented yet will fail until the corresponding controller is added.

## Roadmap

- [x] Project setup, base entities, global exception handling
- [x] `POST /api/gyms`
- [ ] Remaining Gym endpoints (get, update, delete)
- [ ] Sector endpoints
- [ ] Route endpoints incl. sector-assignment and retire logic
- [ ] Filtering and validation edge cases
- [ ] Frontend