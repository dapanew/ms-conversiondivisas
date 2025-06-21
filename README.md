# Construcción de Microservicio:  ms-conversiondivisa con Spring Boot

## 1. Inicialización del Microservicio
- **Esqueleto creado con**: [Spring Initializr](https://start.spring.io/)
- **Versión de Java**: 21
- **Versión de Spring Boot**: 3.2.0

## 2. Configuración del Proyecto
### Gestor de Dependencias
- **Maven**

### Dependencias Principales
| Dependencia               | Descripción                                                                 |
|---------------------------|-----------------------------------------------------------------------------|
| **Spring Web**            | Para construir aplicaciones web y APIs REST.                                |
| **Lombok**                | Simplifica el código reduciendo boilerplate (getters, setters, constructores). |
| **Validation**            | Validación de objetos Java (DTOs/entidades) con anotaciones como `@NotNull`. |
| **Spring Boot DevTools**  | Herramientas de desarrollo (reinicio automático, configuración para dev).   |
| **Logstash**              | Envío de logs estructurados en JSON a sistemas como ELK.                    |
| **OpenFeign**             | Cliente HTTP declarativo para consumir APIs REST.                           |
| **SpringDoc**             | Genera documentación automática de APIs (OpenAPI 3 + Swagger UI).           |

## 3. Herramientas de Desarrollo
- **IDE Principal**: [VS Code](https://code.visualstudio.com/download)

### Comandos Útiles
```bash
# Validar compilación
mvn clean compile

# Generar empaquetado (JAR)
mvn clean package
```
## 4. Estructura del Proyecto
```bash
src/
├── main/
│   ├── java/
│   │   ├── dominio/
│   │   │   └── dto/                # Objetos de transferencia de datos
│   │   ├── aplicacion/
│   │   │   ├── exceptions/         # Excepciones personalizadas
│   │   │   └── service/            # Lógica de negocio y consumo de APIs
│   │   └── infraestructura/
│   │       ├── controller/         # Controladores REST
│   │       └── config/             # Configuraciones globales
│   └── resources/
│       └── application.properties  # Configuración de la aplicación
```
## 5. OpenAPI
- ** Configurar Springdoc: basica. 

- ** Probar API: Acceder a http://localhost:8080/swagger-ui/index.html

## 6. Logstash: 
- ** Generacion de  logs en formato json, para luego hacer una estrategia de monitoreo como grafana. 

## 7. Pruebas con Postman
- ** Importar en Postman: https://www.postman.com/downloads/ para hacer Pruebas: en la carpeta postman se encuentra el archivo test_bbva divisas.postman_collection que tiene la descripcion,
 y  pruebas  de ejemplo para el  consumo del microservicio.
 
##  8. Diagrama de  Arquitectura DRAWIO: 
- ** En  en la carpeta diagramaArquitectura se encuentra el archivo arq_micro_conversion_divisa.drawio, que tiene la arquitectura propuesta para el microservicio, este se debe importar  con DRAWIO:  https://www.drawio.com/
