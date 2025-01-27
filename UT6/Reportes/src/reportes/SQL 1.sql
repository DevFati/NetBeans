
-- Crear la base de datos
DROP DATABASE IF EXISTS ConcesionarioDB;

CREATE DATABASE ConcesionarioDB;

-- Usar la base de datos
USE ConcesionarioDB;

-- Crear una tabla para almacenar información de vehículos
CREATE TABLE Vehiculos (
    id INT AUTO_INCREMENT PRIMARY KEY, -- Identificador único
    marca VARCHAR(50) NOT NULL,        -- Marca del vehículo
    modelo VARCHAR(50) NOT NULL,       -- Modelo del vehículo
    año INT NOT NULL,                  -- Año del vehículo
    precio DECIMAL(10, 2) NOT NULL,    -- Precio
    stock INT NOT NULL                 -- Cantidad en stock
);

-- Insertar algunos datos de ejemplo en vehículos
INSERT INTO Vehiculos (marca, modelo, año, precio, stock)
VALUES
('Toyota', 'Corolla', 2023, 20000.00, 10),
('Honda', 'Civic', 2023, 22000.00, 8),
('BMW', 'Serie 3', 2023, 40000.00, 5),
('Mercedes-Benz', 'Clase C', 2021, 45000.00, 4),
('Audi', 'A4', 2021, 42000.00, 6),
('Tesla', 'Model 3', 2021, 50000.00, 3),
('Ford', 'Mustang', 2024, 55000.00, 2),
('Chevrolet', 'Camaro', 2024, 52000.00, 3),
('Porsche', '911', 2024, 90000.00, 1),
('Ferrari', '488', 2024, 250000.00, 1);

-- Consultar los datos para verificar
SELECT * FROM Vehiculos;
