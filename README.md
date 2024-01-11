# Sistema de Liquidación

Sistema de liquidación que realiza cálculos basados en parámetros específicos.

## Instalación

1. Clona el repositorio: 

## Requisitos del Sistema

- Java 17 o superior
- MySQL 5.7 o superior

## Estructura del Proyecto

com
<br>
|-- api
<br>
|   |-- crud
<br>
|       |-- controllers
<br>
|       |   |-- LiquidacionController.java
<br>
|       |
<br>
|       |-- models
<br>
|       |   |-- AseguradosModel.java
<br>
|       |   |-- PrimasModel.java<br>
|       |   |-- AmparosModel.java<br>
|       |<br>
|       |-- repositories<br>
|       |   |-- IAseguradosRepository.java<br>
|       |   |-- IPrimasRepository.java<br>
|       |   |-- IAmparosRepository.java<br>
|       |<br>
|       |-- services<br>
|           |-- AseguradoService.java<br>
|<br>
|-- Application.java<br>


## Configuración de la Base de Datos

1. Ejecuta el script SQL en `BD/ScripBdMySql.sql.sql` para crear las tablas necesarias.

## Uso

1. Configura las propiedades de conexión a la base de datos en `application.properties`.
2. Ejecuta la aplicación y accede a `http://localhost:8080` en tu navegador.

## Funcionalidades

- Cálculo de liquidación basado en parámetros específicos.

