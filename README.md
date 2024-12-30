# Reto Automatización

Este proyecto implementa una prueba de automatización utilizando Selenium y Cucumber para validar funcionalidades en la aplicación **OrangeHRM**. El propósito principal es realizar pruebas automatizadas de inicio de sesión y otras funcionalidades clave dentro del sistema.

---

## Estructura del Proyecto

```plaintext
reto-automatizacion/
├── .idea/                  # Archivos de configuración de IntelliJ IDEA
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.orangehrm.reto/  # Código fuente principal
│   │   │       └── Main.java         # Clase principal (placeholder)
│   │   └── resources/                # Recursos del proyecto
│   └── test/
│       ├── java/
│       │   ├── features/
│       │   │   └── login.feature      # Archivo Gherkin con los escenarios de prueba
│       │   ├── steps/
│       │   │   └── LoginSteps.java    # Definiciones de pasos para Cucumber
│       │   └── tasks/
│       │       ├── LoginTask.java     # Lógica para realizar el login
│       │       ├── RecruitmentTask.java # Placeholder para futuras pruebas
│       │       └── WebDriverTest.java # Configuración de WebDriver
├── target/                # Archivos compilados (generados automáticamente)
├── .gitignore             # Archivos ignorados por Git
├── pom.xml                # Configuración de Maven
└── README.md              # Documentación del proyecto (este archivo)
```

---

## Tecnologías Utilizadas

- **Lenguaje**: Java
- **Framework de Pruebas**: Selenium
- **Herramienta BDD**: Cucumber
- **Gestor de Dependencias**: Maven
- **IDE**: IntelliJ IDEA

---

## Requisitos Previos

1. **Java**: Asegúrate de tener Java 11 o superior instalado.
2. **Maven**: Instalar Apache Maven para manejar las dependencias del proyecto.
3. **WebDriver**: Descargar el controlador para el navegador que se usará (por ejemplo, ChromeDriver).
4. **IDE**: Se recomienda usar IntelliJ IDEA para facilitar el desarrollo.
5. **Git**: Para clonar y gestionar el repositorio.

---

## Configuración del Proyecto

### 1. Clonar el Repositorio

```bash
git clone https://github.com/gabodo/reto-automatizacion.git
cd reto-automatizacion
```

### 2. Instalar Dependencias

Ejecuta el siguiente comando para instalar todas las dependencias definidas en el archivo `pom.xml`:

```bash
mvn clean install
```

### 3. Configurar el WebDriver

Asegúrate de tener el driver del navegador configurado en tu sistema. Por ejemplo:

- Para ChromeDriver:
  - Descarga el driver desde [ChromeDriver](https://chromedriver.chromium.org/downloads).
  - Añádelo al `PATH` del sistema.

---

## Ejecución de las Pruebas

### 1. Desde el IDE

1. Abre el proyecto en IntelliJ IDEA.
2. Ejecuta los tests desde las clases en el paquete `test/java` o desde el archivo `login.feature`.

### 2. Desde la Línea de Comandos

Ejecuta los siguientes comandos para correr las pruebas con Maven:

```bash
mvn test
```

---

## Escenarios de Prueba

El archivo `login.feature` define los escenarios en lenguaje Gherkin:

```gherkin
Feature: Login Functionality
  Scenario: Successful login with valid credentials
    Given the user navigates to the login page
    When the user enters valid credentials
    Then the user should see the Dashboard
```

---

## Pendientes

- Agregar más pruebas para las funcionalidades del módulo de reclutamiento.
- Configurar un pipeline CI/CD para pruebas automatizadas.
- Mejorar el manejo de excepciones en `WebDriverTest.java`.

---

## Contribuciones

Las contribuciones son bienvenidas. Por favor, abre un issue o un pull request si tienes alguna mejora o corrección.

---

## Autor

Proyecto desarrollado por [Gabodo](https://github.com/gabodo).
