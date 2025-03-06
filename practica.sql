-- Crear la base de datos
CREATE DATABASE practica;

-- Usar la base de datos
USE practica;

-- Crear la tabla arbol
CREATE TABLE arbol (
    id_arbol BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre_comun VARCHAR(100) NOT NULL,
    tipo_flor VARCHAR(100),
    dureza_madera VARCHAR(50),
    altura_promedio DECIMAL(5,2),
    activo BOOLEAN DEFAULT TRUE
);

-- Crear usuario y otorgarle permisos
CREATE USER 'usuario_practica'@'localhost' IDENTIFIED BY 'la_Clave';
GRANT ALL PRIVILEGES ON practica.* TO 'usuario_practica'@'localhost';
FLUSH PRIVILEGES;




USE practica;

INSERT INTO arbol (nombre_comun, tipo_flor, dureza_madera, altura_promedio, activo) VALUES
    ('Roble', 'Sin flor', 'Dura', 20.50, TRUE),
    ('Pino', 'Cono', 'Blanda', 30.75, TRUE),
    ('Cerezo', 'Blanca', 'Media', 10.20, TRUE),
    ('Caoba', 'Roja', 'Dura', 25.60, TRUE),
    ('Álamo', 'Amarilla', 'Blanda', 18.30, FALSE);
