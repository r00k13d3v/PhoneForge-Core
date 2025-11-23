# **README.md — PhoneForge-Core**

# PhoneForge-Core  
**The official backend engine of PhoneForge — synthetic phone number generation API.**

PhoneForge-Core is the backend service responsible for generating **realistic, fully synthetic, privacy-safe phone numbers** for testing, QA, anonymization and data engineering workloads.

It exposes a clean **REST API**, includes region-based templates, customizable patterns, and integrates with a relational database for persistence and configuration.

This repository contains **only the backend + database layer**.  
The optional user interface (PhoneForge-Dashboard) lives in a separate repository.

---

##  Features

- 🔢 Generate synthetic phone numbers (single or bulk)
- 🌍 Region-aware templates (ES, EU, International)
- ⚙️ Custom prefixes, formats and patterns
- 🗄️ Database persistence (patterns, logs, regions)
- 🔐 100% synthetic — GDPR-friendly, no use of real data
- 📡 REST API ready for integration with any frontend or system
- 🐳 Docker-ready (API + Database)

##  Tech Stack

- **Backend:** Java Spring Boot  
- **Database:** MySQL 8  
- **ORM:** JPA (Hibernate)  
- **Security:** Spring Security + JWT, rate limiting, input validation  
- **Docs:** Swagger / OpenAPI 3  
- **Infra:** Docker, Docker Compose


##  Roadmap

* [ ] Add API keys
* [ ] Add international region packs
* [ ] Add pattern validation tools
* [ ] Add dataset export (CSV/JSON)
* [ ] Add rate limiting per API key
* [ ] Add PhoneForge-Cloud (SaaS mode)

---

##  Contributing

Contributions, issues and feature suggestions are welcome.
Please open a pull request or create an issue.

---

##  License

Licensed under **Apache-2.0**.
See the `LICENSE` file for details.

---

© 2025 — Created by **r00k13d3v**

