# 📁 MS Proyecto - Inovatech

Microservicio encargado de la gestión de proyectos de desarrollo.

Permite:

* Crear proyectos
* Modificar proyectos
* Eliminar proyectos
* Consultar proyectos registrados
* Administrar integrantes y tecnologías utilizadas

---

# 📌 Tecnologías utilizadas

* Java 21
* Spring Boot 3
* Spring Data JPA
* H2 Database
* Lombok
* Maven
* Postman

---

# 📦 Dependencias utilizadas

* Spring Web
* Spring Data JPA
* H2 Database
* Lombok
* DevTools
* Validation
* Spring Boot Starter Test

---

# 🛠 Requisitos previos

## ✅ Java 21

https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html

---

## ✅ Maven

https://maven.apache.org/download.cgi

---

## ✅ IntelliJ IDEA

https://www.jetbrains.com/idea/download/

---

## ✅ Postman

https://www.postman.com/downloads/

---

# ⚙ Configuración

## Puerto

server.port=9094

---

# 🗄 Base de datos H2

## Configuración

spring.datasource.url=jdbc:h2:file:./data/proyectodb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=admin
spring.datasource.password=admin

spring.jpa.hibernate.ddl-auto=update

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

---

# 🧪 Consola H2

Abrir:

http://localhost:9094/h2-console

---

# ▶ Cómo ejecutar

MsProyectoApplication

---

# 📡 Endpoints principales

## Crear proyecto

POST http://localhost:9090/api/proyectos

---

## Obtener proyectos

GET http://localhost:9090/api/proyectos

---

## Actualizar proyecto

PUT http://localhost:9090/api/proyectos/{id}

---

## Eliminar proyecto

DELETE http://localhost:9090/api/proyectos/{id}

---

# 📋 Información almacenada

Cada proyecto contiene:

* Nombre
* Integrantes
* Tecnologías utilizadas
* Área
* Estado

---

# 🏷 Áreas sugeridas

* Frontend
* Backend
* FullStack

---

# 📈 Estados sugeridos

* Planificación
* Activo
* En Progreso
* Revisión

---

# 🧠 Función del microservicio

Este microservicio:

* Centraliza la gestión de proyectos
* Permite organizar equipos de trabajo
* Registra tecnologías utilizadas
* Facilita el seguimiento de estados y áreas

---

# 🧪 Tests

mvn test

---

# 👨‍💻 Autores

Camilo Leiva ([cc.leiva@duocuc.cl](mailto:cc.leiva@duocuc.cl))

Nicolas Rivera ([nico.veraf@duocuc.cl](mailto:nico.veraf@duocuc.cl))

Ramiro Gomez ([ra.gomezv@duocuc.cl](mailto:ra.gomezv@duocuc.cl))

Laura Fontecilla ([la.fontecilla@duocuc.cl](mailto:la.fontecilla@duocuc.cl))

## Proyecto desarrollado para Inovatech.
