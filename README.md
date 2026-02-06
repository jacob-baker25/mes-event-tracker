***Project In Progress**

# mes-event-tracker
Java-based MES-style service for ingesting shop floor events and computing production metrics.

# Project Goal
Build a small MES-style ingestion + reporting service:

Input: timestamped “shop floor events” (posted as JSON)
Storage: SQL database
Output: query endpoints + a simple metrics endpoint (uptime/downtime + counts)

# Deliverables (what “done” looks like)

By the end, the repo should have:

1. **Spring Boot REST API**
2. **SQL persistence** (SQLite at first, Postgres in v2)
3. **Endpoints**
   - **POST /events**
     - Create a new production event and store it
   - **GET /events** (filters)
     - Return stored events, optionally limited by line, machine, type, or time window
   - **GET /metrics/summary** (counts + downtime minutes)
     - Compute and return aggregate production metrics like counts and downtime minutes
   - **Validation + error handling**
     - Clean 400-level client errors
4. **README containing:**
   - Architecture diagram (simple)
   - Schema
   - Curl examples (how to talk to the server from a terminal)
   - How to run locally
5. **Git history showing incremental commits**

**Optional (maybe in v2):**
- Swagger UI
- Docker
- A tiny “event simulator”


# The Pipeline (mental model)
Client (simulator/curl) → REST controller → validation → service layer → repository → SQL DB → metrics query → JSON response

# Why this project?

Manufacturing systems depend heavily on reliable software to bridge physical production equiptment and enterprise planninhg tools.
This project creates a simplified MES ingestion layer to help me better understand how these systems are implmented.

# License
MIT
