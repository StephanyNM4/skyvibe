CREATE TABLE aerolinea ( 
    idaerolinea INT NOT NULL AUTO_INCREMENT, 
    nombreaerolinea   VARCHAR(30), 
    PRIMARY KEY (idaerolinea) 
); 

CREATE TABLE asientos ( 
    idasiento      INT NOT NULL AUTO_INCREMENT, 
    idtipoasiento  INT NOT NULL, 
    idvuelo        VARCHAR(30) NOT NULL, 
    nombreasiento  VARCHAR(10), 
    disponible     CHAR(1), 
    PRIMARY KEY (idasiento), 
    FOREIGN KEY (idtipoasiento) REFERENCES tipoasiento (idtipoasiento), 
    FOREIGN KEY (idvuelo) REFERENCES vuelos (idvuelo) 
); 

CREATE TABLE boletos ( 
    idboleto   INT NOT NULL AUTO_INCREMENT, 
    idcliente  INT NOT NULL, 
    idescala   INT, 
    idasiento  INT NOT NULL, 
    precio     DECIMAL(10, 2), 
    PRIMARY KEY (idboleto), 
    FOREIGN KEY (idcliente) REFERENCES clientes (idcliente), 
    FOREIGN KEY (idescala) REFERENCES escalas (idescala), 
    FOREIGN KEY (idasiento) REFERENCES asientos (idasiento) 
); 

CREATE TABLE clientes ( 
    idcliente INT NOT NULL AUTO_INCREMENT, 
    nombre    VARCHAR(30), 
    apellido  VARCHAR(30), 
    correo    VARCHAR(20), 
    contrasena VARCHAR(30), 
    telefono  VARCHAR(20), 
    PRIMARY KEY (idcliente) 
); 

CREATE TABLE escalas ( 
    idescala          INT NOT NULL AUTO_INCREMENT, 
    idvuelopadre      VARCHAR(30) NOT NULL, 
    idvuelo           VARCHAR(30) NOT NULL, 
    nombreaeropuerto  VARCHAR(100), 
    PRIMARY KEY (idescala), 
    FOREIGN KEY (idvuelopadre) REFERENCES vuelos (idvuelo), 
    FOREIGN KEY (idvuelo) REFERENCES vuelos (idvuelo) 
); 

CREATE TABLE rutas ( 
    idruta     INT NOT NULL AUTO_INCREMENT, 
    origen     VARCHAR(50), 
    destino    VARCHAR(50), 
    distancia  DECIMAL(10, 2), 
    PRIMARY KEY (idruta) 
); 

CREATE TABLE tipoasiento ( 
    idtipoasiento INT NOT NULL AUTO_INCREMENT, 
    tipoasiento   VARCHAR(50), 
    preciobase    DECIMAL(10, 2), 
    PRIMARY KEY (idtipoasiento) 
); 

CREATE TABLE vuelos ( 
    idvuelo       VARCHAR(30) NOT NULL, 
    idaerolinea   INT NOT NULL, 
    idruta        INT NOT NULL, 
    fechapartida  DATE, 
    numerovuelo   INT, 
    horallegada   VARCHAR(15), 
    horapartida   VARCHAR(15), 
    gate          INT, 
    tipovuelo     CHAR, 
    PRIMARY KEY (idvuelo), 
    FOREIGN KEY (idaerolinea) REFERENCES aerolinea (idaerolinea), 
    FOREIGN KEY (idruta) REFERENCES rutas (idruta) 
) 

-- Insertar rutas con distancias reales en la tabla rutas
INSERT INTO rutas (origen, destino, distancia) VALUES 
    ('Estados Unidos', 'Francia', 5550.00),
    ('Estados Unidos', 'Reino Unido', 5550.00),
    ('Reino Unido', 'Francia', 500.00),

    ('Japón', 'Ucrania', 2000.00),
    ('Japón', 'China', 2000.00),
    ('China', 'Ucrania', 17000.00),

    ('Honduras', 'Noruega', 1000.00),
    ('Honduras', 'España', 3000.00),
    ('España', 'Noruega', 11000.00),

    ('Honduras', 'Argentina', 1000.00),
    ('Honduras', 'Colombia', 3000.00),
    ('Colombia', 'Argentina', 11000.00),

    ('Italia', 'Rusia', 6000.00),
    ('Italia', 'Polonia', 3000.00),
    ('Polonia', 'Rusia', 3000.00);


    ('Francia', 'Estados Unidos', 5550.00),
    ('Reino Unido', 'Estados Unidos', 5550.00),
    ('Francia', 'Reino Unido', 500.00),

    ('Ucrania', 'Japón', 2000.00),
    ('China', 'Japón', 2000.00),
    ('Ucrania', 'China', 17000.00),

    ('Noruega', 'Honduras', 1000.00),
    ('España', 'Honduras', 3000.00),
    ('Noruega', 'España', 11000.00),

    ('Argentina', 'Honduras', 1000.00),
    ('Colombia', 'Honduras', 3000.00),
    ('Argentina', 'Colombia', 11000.00),

    ('Rusia', 'Italia', 6000.00),
    ('Polonia', 'Italia', 3000.00),
    ('Rusia', 'Polonia', 3000.00);

    -- Insertar 10 vuelos en la tabla vuelos
INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo)
VALUES 
    ('AA1B', 1, 1, TO_DATE('2023-01-10', 'YYYY-MM-DD'), 145, '15:45', '11:15', 7, false),
    ('AA2B', 4, 2, TO_DATE('2023-04-15', 'YYYY-MM-DD'), 110, '08:15', '06:30', 4, true),
    ('AA3B', 5, 3, TO_DATE('2023-05-10', 'YYYY-MM-DD'), 215, '18:30', '15:40', 8, true),

    ('BB1C', 2, 4, TO_DATE('2023-02-20', 'YYYY-MM-DD'), 489, '19:00', '16:15', 2, false),
    ('BB2C', 6, 5, TO_DATE('2023-06-25', 'YYYY-MM-DD'), 350, '21:45', '18:30', 6, true),
    ('BB3C', 7, 6, TO_DATE('2023-07-20', 'YYYY-MM-DD'), 455, '13:15', '10:00', 5, true),
    
    ('CC1D', 3, 7, TO_DATE('2023-03-30', 'YYYY-MM-DD'), 890, '00:30', '21:45', 4, false),
    ('CC2D', 8, 8, TO_DATE('2023-09-10', 'YYYY-MM-DD'), 515, '10:00', '06:45', 2, true),
    ('CC3D', 1, 9, TO_DATE('2023-09-15', 'YYYY-MM-DD'), 616, '16:30', '13:15', 10, true),
    
    ('DD1E', 3, 10, TO_DATE('2023-03-30', 'YYYY-MM-DD'), 890, '00:30', '21:45', 4, false),
    ('DD2E', 1, 11, TO_DATE('2023-09-15', 'YYYY-MM-DD'), 616, '16:30', '13:15', 10, true),
    ('DD3E', 2, 12, TO_DATE('2023-11-01', 'YYYY-MM-DD'), 777, '21:15', '18:00', 1, true);

    ('EE1F', 3, 13, TO_DATE('2023-03-22', 'YYYY-MM-DD'), 789, '23:00', '20:15', 3, false),
    ('EE2F', 4, 14, TO_DATE('2023-04-10', 'YYYY-MM-DD'), 101, '08:00', '05:45', 2, true),
    ('EE3F', 5, 15, TO_DATE('2023-05-05', 'YYYY-MM-DD'), 202, '17:30', '14:20', 6, true),
    
    ('FF1G', 1, 16, TO_DATE('2023-01-01', 'YYYY-MM-DD'), 123, '14:30', '10:00', 5, false),
    ('FF2G', 8, 17, TO_DATE('2023-08-29', 'YYYY-MM-DD'), 505, '09:30', '06:15', 1, true),
    ('FF3G', 2, 18, TO_DATE('2023-10-20', 'YYYY-MM-DD'), 707, '20:45', '17:30', 10, true),
    
    ('HH1I', 1, 19, TO_DATE('2023-01-01', 'YYYY-MM-DD'), 123, '14:30', '10:00', 5, false),
    ('HH2I', 6, 20, TO_DATE('2023-06-18', 'YYYY-MM-DD'), 303, '21:15', '18:00', 7, true),
    ('HH3I', 7, 21, TO_DATE('2023-07-12', 'YYYY-MM-DD'), 404, '12:45', '09:30', 4, true),
    
    ('II1J', 1, 22, TO_DATE('2023-01-01', 'YYYY-MM-DD'), 123, '14:30', '10:00', 5, false),
    ('II2J', 8, 23, TO_DATE('2023-08-29', 'YYYY-MM-DD'), 505, '09:30', '06:15', 1, true),
    ('II3J', 2, 24, TO_DATE('2023-09-03', 'YYYY-MM-DD'), 606, '16:00', '12:45', 9, true),
    
    ('JJ1K', 1, 25, TO_DATE('2023-01-01', 'YYYY-MM-DD'), 123, '14:30', '10:00', 5, false),
    ('JJ2K', 4, 26, TO_DATE('2023-09-03', 'YYYY-MM-DD'), 606, '16:00', '12:45', 9, true),
    ('JJ3K', 2, 27, TO_DATE('2023-10-20', 'YYYY-MM-DD'), 707, '20:45', '17:30', 10, true),
    
    ('KK1L', 1, 28, TO_DATE('2023-01-01', 'YYYY-MM-DD'), 123, '14:30', '10:00', 5, false),
    ('KK2L', 8, 29, TO_DATE('2023-08-29', 'YYYY-MM-DD'), 505, '09:30', '06:15', 1, true),
    ('KK3L', 2, 30, TO_DATE('2023-10-20', 'YYYY-MM-DD'), 707, '20:45', '17:30', 10, true);
