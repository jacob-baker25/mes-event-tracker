# mes-event-tracker
Java-based MES-style service for ingesting shop floor events and computing production metrics.

# Project Goal
Build a small MES-style ingestion + reporting service:

Input: timestamped “shop floor events” (posted as JSON)
Storage: SQL database
Output: query endpoints + a simple metrics endpoint (uptime/downtime + counts)

# Deliverables (what “done” looks like)
Be the end, the repo should have:
1. Spring Boot REST API
2. SQL persistence (SQLite at first, Postgres in v2)
3. Endpoints
	a. POST /events
		i.Create a new production event and store it
	b. GET /events (filters)
		i.Return stored events, optionally limited by line, machine, type, or time window
	c. GET /metrics/summary (counts + downtime minutes)
		i. Compute and return aggregate production metrics like counts and downtime minutes
	d. Validation + error handling (400s are clean)
	e. README with:
		i. Architecture diagram (simple)
		ii. Schema
		iii. Curl examples (How to talk to my server from a terminal)
		iv. How to run locally
	f. Git history showing incremental commits
	Optional (maybe in v2): Swagger UI, DOcker, a tiny “event simulator”

# The Pipeline (mental model)
Client (simulator/curl) → REST controller → validation → service layer → repository → SQL DB → metrics query → JSON response

# Why this project?

Manufacturing systems depend heavily on reliable software to bridge physical production equiptment and enterprise planninhg tools.
This project creates a simplified MES ingestion layer to help me better understand how these systems are implmented.

# License
MIT
