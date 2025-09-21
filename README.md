# Proyecto de Automatización E2E con Serenity BDD

Este proyecto implementa pruebas automatizadas end-to-end utilizando Serenity BDD con el patrón Screenplay para la página web Demoblaze.

## Pre-requisitos

- Java 18
- Gradle
- Navegador web (Chrome)


## Configuración del Proyecto

1. Clonar el repositorio: https://github.com/Danycorrea/RetoE2ESofka.git
2. Abrir el proyecto en tu IDE preferido (yo usé IntelliJ IDEA).
3. Asegurarse de tener Java 18 configurado

## Ejecución de Pruebas

### Usando Gradle

Para ejecutar las pruebas con Chrome (por defecto):
```bash
./gradlew clean test
```

## Reportes

- Reporte ejecución realizada se encuentra en: `reporte/serenity/index.html`

## Características Implementadas

- Pruebas E2E del flujo de compra
- Manejo de alertas del navegador
- Patrón Screenplay
- Page Objects
- Cucumber para BDD

## Stack Tecnológico

- Serenity BDD
- Cucumber
- Selenium WebDriver
- JUnit
- Gradle
- Java 18

