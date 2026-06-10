# Fase 1: Compilación (Docker hace el trabajo sucio)
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
# Copiamos el archivo de configuración de Maven
COPY pom.xml .
# Copiamos el código fuente
COPY src ./src
# Ejecutamos la compilación dentro de Docker (aquí se crea el target interno)
RUN mvn clean package -DskipTests

# Fase 2: Imagen final (Ligera y lista para correr)
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
# Copiamos el .jar desde la fase de compilación anterior
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8088
ENTRYPOINT ["java", "-jar", "app.jar"]