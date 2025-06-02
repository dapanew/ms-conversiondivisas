# Prueba BBVA - Construcción de Microservicios con Spring Boot

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
