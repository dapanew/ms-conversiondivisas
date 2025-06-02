
# Prueba BBVA Construcion de Microservicios con Spring Boot
# ms-conversiondivisas

#1. Inicializador microservicio
esqueleto creado  con Spring Initializr: https://start.spring.io/
version de java 21
Spring Boot 3.2.0

## 2.Maven como gestor de dependencias
Dependencias:
Spring Web
Lombok				-> Simplifica el código Java reduciendo la necesidad de escribir código repetitivo
Validation			-> Permite validar objetos Java (como DTOs o entidades)
Spring Boot DevTools-> Herramientas de desarrollo que mejoran la productividad, como reinicio automático de la aplicación al detectar cambios 
logstash			-> Facilita el envío de logs estructurados (en formato JSON)
openfeign			-> Cliente HTTP declarativo para consumir APIs REST (como un cliente REST simplificado).
springdoc			-> Genera documentación automática de APIs REST usando OpenAPI 3 (Swagger UI integrado).

## 3. Herramientas de trabajo
VS Code: https://code.visualstudio.com/download


Validar compilación:
mvn clean compile
Validar empaquetado:
mvn clean package

##4. Desarrollar microservicio
Estructura Carpetas: 

###Dominio:
dto: Objetos de transferencia de datos

###Aplicación:

exceptions: Excepciones personalizadas
service: Interfaces de servicio e implementación, logica de negocio consumo de API,conversion de Divisa 

###Infraestructura:

controller: Controladores REST exposicion de operaciones 
config: Configuraciones
