# DocBot - API REST

This is the backend REST API for **DocBot**, a conversational assistant designed to process, document, and respond to user messages.  
The API is built with **Spring Boot** and is currently under development. You can test the endpoints using **Postman**.

---
## Requirements

- Java 17+
- Maven 3+
- PostgreSQL

---

## Installation & Run

Clone the repository and navigate into the backend folder:

```bash
git clone https://github.com/your-username/docbot-backend.git
cd docbot-backend
mvn spring-boot:run
```
The API will be available at:
http://localhost:8080

---

## Testing with Postman

Currently, this development version uses Spanish language with medical technical terms.
You can customize the intentions in the file intentions.json.

```
{
"sender": "12345",
"message": "Quiero ver el historial medico",
"timestamp": "2025-08-14T18:30:00.000+00:00"
}
```
**Example response**  
This request triggers the patient's clinical history service and returns all previous medical history.