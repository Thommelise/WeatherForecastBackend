### README (Dansk)

## Weather Dashboard Applikation

Denne Weather Dashboard er en full-stack webapplikation, der viser realtids vejroplysninger og en 7-dages vejrudsigt for Aarhus, Danmark. Applikationen er bygget med Java til backend og Angular til frontend, og anvender Open-Meteo API til at hente vejrinformation.

### Brugte teknologier
- **Backend:** Java (Spring Boot)
- **Frontend:** Angular
- **API:** [Open-Meteo Weather API](https://open-meteo.com/)
- **HTTP Klienter:** `RestTemplate` (Java), `HttpClient` (Angular)
- **Data Binding:** Jackson (til JSON deserialisering i Java)
- **CORS Håndtering:** Konfigureret i Spring Boot

---

### Krav

Inden du starter applikationen, skal du sørge for at have følgende installeret:
- **Java 17** eller nyere
- **Maven** (til at bygge og køre Java backend)
- **Node.js** og **npm** (til at bygge og køre Angular frontend)

---

## Java Backend

#### Teknologier:
- **Spring Boot (Java)**
- **Maven** til afhængighedsstyring og bygge projektet
- **Port:** `8080`

### Sådan starter du backend:

1. **Klon repository:**
   ```bash
   git clone https://github.com/your-repository/weather-dashboard.git
   cd weather-dashboard
   ```

2. **Byg backend:**
   Inde i projektmappen (hvor `pom.xml` er placeret), kør følgende kommando for at bygge projektet:
   ```bash
   mvn clean install
   ```

3. **Kør backend:**
   Når buildet er færdigt, kør følgende kommando for at starte Spring Boot serveren:
   ```bash
   mvn spring-boot:run
   ```

4. **Adgang til API’et:**
   Backend vil køre på `http://localhost:8080`. Du kan teste vejr-endpointet ved at besøge:
   ```
   http://localhost:8080/api/weather?lat=56.1518&lon=10.2064
   ```


## Ports

- **Java Backend:** Kører på `http://localhost:8080`

### CORS Konfiguration

Hvis du støder på CORS-problemer, når frontend forsøger at anmode om data fra backend, er Spring Boot backend konfigureret til at tillade anmodninger fra `http://localhost:4200`. Dette er konfigureret i backendprojektet.

---

### Projektstruktur

#### Backend (Java):
```
src/
├── main/
│   ├── java/com/example/weatherApp
│   │   ├── controller/  # REST API controller for vejropdateringer
│   │   ├── service/     # Service der kommunikerer med Open-Meteo API
│   │   └── model/       # Modeller for vejrrespons
│   └── resources/
│       └── application.properties  # Konfiguration for Spring Boot
└── test/  # Enhedstest
```

### Hvordan det fungerer

- **Backend** henter data fra Open-Meteo API'et baseret på den angivne lokation (Aarhus).
- **Frontend** sender HTTP-anmodninger til backend for at hente vejrinformationen og vise det på et brugervenligt dashboard.

---

### Problemer & Fejlretning

#### Almindelige problemer:
- **CORS Problem:** Sørg for, at backendens CORS-konfiguration tillader anmodninger fra frontend. Dobbelttjek, at `localhost:4200` er tilladt i Spring Boot konfigurationen.
- **Port konflikter:** Sørg for, at backend kører på port `8080`, og at frontend kører på port `4200`. Hvis andre services bruger disse porte, kan du justere portkonfigurationen i `application.properties` (for backend) eller `proxy.conf.json` (for Angular).

---

### Konklusion
Dette vejr-dashboard er en løsning til at spore realtids vejroplysninger og vejrudsigt for Better Developers' kontor i Aarhus.
