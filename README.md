# Hospital Appointment Management API (Java Spring Boot)

A basic RESTful API for booking and managing hospital appointments.

## Features
- Book appointments
- List all appointments
- Built with Spring Boot, Java, and MySQL

## How to Run
1. Ensure MySQL is running and create a database named `hospital_db`
2. Set your MySQL username and password in `application.properties`
3. Run the app using your IDE or:

```
./mvnw spring-boot:run
```

## How to Deploy
### Option 1: Run Locally
- Use IntelliJ or VS Code
- Install dependencies and run the Spring Boot app

### Option 2: Deploy to Render (free hosting)
1. Push code to GitHub
2. Go to [https://render.com](https://render.com) and sign up
3. Create a new Web Service
4. Connect your GitHub repo
5. Set the build command: `./mvnw clean install`
6. Set the start command: `java -jar target/*.jar`

Ensure your MySQL database is accessible remotely if using cloud hosting.