-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS dbLinktic;

-- Seleccionar la base de datos
USE dbLinktic;
-- Creación de la tabla ASEGURADOS
CREATE TABLE ASEGURADOS (
    Id INT AUTO_INCREMENT PRIMARY KEY,
    TipoIdentificacion INT,
    NumeroIdentificacion INT,
    Apellidos VARCHAR(255),
    Nombres VARCHAR(255),
    Sexo INT,
    FechaNacimiento DATE
);

-- Insertar datos en la tabla ASEGURADOS
INSERT INTO ASEGURADOS (TipoIdentificacion, NumeroIdentificacion, Apellidos, Nombres, Sexo, FechaNacimiento)
VALUES
    (1, 79000001, 'APELLIDO1', 'NOMBRE1', 1, '1945-01-10'),
    (1, 79000002, 'APELLIDO2', 'NOMBRE2', 1, '1950-01-10'),
    (1, 79000003, 'APELLIDO3', 'NOMBRE3', 1, '1955-01-10'),
    (2, 51000001, 'APELLIDO4', 'NOMBRE4', 2, '1960-01-10'),
    (2, 51000002, 'APELLIDO5', 'NOMBRE5', 2, '1965-01-10'),
    (2, 51000003, 'APELLIDO6', 'NOMBRE6', 2, '1970-01-10');

-- Creación de la tabla AMPAROS
CREATE TABLE AMPAROS (
    Codigo INT PRIMARY KEY,
    Nombre VARCHAR(255)
);

-- Insertar datos en la tabla AMPAROS
INSERT INTO AMPAROS (Codigo, Nombre)
VALUES
    (1, 'Muerte accidental'),
    (2, 'Desmembración'),
    (3, 'Auxilio funerario'),
    (4, 'Renta vitalicia');

-- Creación de la tabla PRIMAS
CREATE TABLE PRIMAS (
    Codigo INT,
    EdadMinima INT,
    EdadMaxima INT,
    PorcentajePrima DECIMAL(10, 5),
    PRIMARY KEY (Codigo, EdadMinima, EdadMaxima)
);

-- Insertar datos en la tabla PRIMAS
INSERT INTO PRIMAS (Codigo, EdadMinima, EdadMaxima, PorcentajePrima)
VALUES
    (1, 18, 45, 0.02304),
    (1, 46, 75, 0.02012),
    (2, 18, 50, 0.1809),
    (2, 51, 70, 0.16043),
    (3, 18, 60, 0.14123),
    (3, 61, 70, 0.1545),
    (4, 18, 50, 0.12123),
    (4, 51, 70, 0.1345);
