# Places Web Service

Servicio Web básico que entrega recursos en formato JSON. Desarrollado con las siguientes tecnologías:

- Java
- Gradle
- Spring Boot

Este proyecto no utiliza ninguna base de datos y entrega siempre los mismos recursos para los Endpoints desarrollados. 
Para conocer más acerca de los endpoints abrir [el archivo de Postman](https://github.com/programacionmaster/places/blob/master/postman/Places.postman_collection.json) que se encuentra en el directorio `postman` del
repositorio.

## Instalación

A continuación una guía de como ejecutar el servicio web en un ambiente local.

### Requisitos

- Java 11 instalado
- Código fuente del proyecto

Se puede descargar Java Open Source desde las siguientes fuentes:

- [OpenJDK](https://openjdk.java.net/)
- [Amazon Corretto](https://aws.amazon.com/es/corretto/)

### ¿Cómo ejecutar?

Dentro del directorio principal del proyecto ejecutar lo siguiente: `./gradlew bootRun`