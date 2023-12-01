
-- Insertar datos en la tabla aerolinea
    INSERT INTO aerolinea (nombreaerolinea) VALUES ('Air F.M');
    INSERT INTO aerolinea (nombreaerolinea) VALUES ('Claus Airlines');
    INSERT INTO aerolinea (nombreaerolinea) VALUES ('Delta Air');
    INSERT INTO aerolinea (nombreaerolinea) VALUES ('Blue Airlines');
    INSERT INTO aerolinea (nombreaerolinea) VALUES ('Lufthansa');
    INSERT INTO aerolinea (nombreaerolinea) VALUES ('World Airways');
    INSERT INTO aerolinea (nombreaerolinea) VALUES ('Air Clear');
    INSERT INTO aerolinea (nombreaerolinea) VALUES ('KLM Royal');
    INSERT INTO aerolinea (nombreaerolinea) VALUES ('Air T.O.M');


-- Insertar datos en la tabla clientes
    INSERT INTO clientes (nombre, apellido, correo, contrasena, telefono) VALUES ('Juan', 'Pérez', 'juan@gmail.com', 'contrasena123', '123-456-7890');
    INSERT INTO clientes (nombre, apellido, correo, contrasena, telefono) VALUES ('María', 'Gómez', 'maria@gmail.com', 'clave456', '987-654-3210');
    INSERT INTO clientes (nombre, apellido, correo, contrasena, telefono) VALUES ('Carlos', 'Rodríguez', 'carlos@gmail.com', 'miclave123', '555-123-7890');
    INSERT INTO clientes (nombre, apellido, correo, contrasena, telefono) VALUES ('Laura', 'López', 'laura@gmail.com', 'password789', '111-222-3333');
    INSERT INTO clientes (nombre, apellido, correo, contrasena, telefono) VALUES ('Roberto', 'Sánchez', 'roberto@gmail.com', 'secreto987', '444-555-6666');
    INSERT INTO clientes (nombre, apellido, correo, contrasena, telefono) VALUES ('Ana', 'Martínez', 'ana@gmail.com', 'acceso456', '777-888-9999');

-- Insertar tipos de asientos en la tabla tipo asiento
    INSERT INTO tipoasiento (tipoasiento, preciobase) VALUES ('Primera Clase', 200.00);
    INSERT INTO tipoasiento (tipoasiento, preciobase) VALUES ('Ejecutivo', 150.00);
    INSERT INTO tipoasiento (tipoasiento, preciobase) VALUES ('Normal', 100.00);

-- Insertar rutas en la tabla rutas
    INSERT INTO rutas (origen, destino, distancia) VALUES ('Estados Unidos', 'Francia', 5550.00);
    INSERT INTO rutas (origen, destino, distancia) VALUES ('Estados Unidos', 'Reino Unido', 5550.00);
    INSERT INTO rutas (origen, destino, distancia) VALUES ('Reino Unido', 'Francia', 500.00);

    INSERT INTO rutas (origen, destino, distancia) VALUES ('Japón', 'Ucrania', 2000.00);
    INSERT INTO rutas (origen, destino, distancia) VALUES ('Japón', 'China', 2000.00);
    INSERT INTO rutas (origen, destino, distancia) VALUES ('China', 'Ucrania', 17000.00);

    INSERT INTO rutas (origen, destino, distancia) VALUES ('Honduras', 'Noruega', 1000.00);
    INSERT INTO rutas (origen, destino, distancia) VALUES ('Honduras', 'España', 3000.00);
    INSERT INTO rutas (origen, destino, distancia) VALUES ('España', 'Noruega', 11000.00);

    INSERT INTO rutas (origen, destino, distancia) VALUES ('Honduras', 'Argentina', 1000.00);
    INSERT INTO rutas (origen, destino, distancia) VALUES ('Honduras', 'Colombia', 3000.00);
    INSERT INTO rutas (origen, destino, distancia) VALUES ('Colombia', 'Argentina', 11000.00);

    INSERT INTO rutas (origen, destino, distancia) VALUES ('Italia', 'Rusia', 6000.00);
    INSERT INTO rutas (origen, destino, distancia) VALUES ('Italia', 'Polonia', 3000.00);
    INSERT INTO rutas (origen, destino, distancia) VALUES ('Polonia', 'Rusia', 3000.00);


    INSERT INTO rutas (origen, destino, distancia) VALUES ('Francia', 'Estados Unidos', 5550.00);
    INSERT INTO rutas (origen, destino, distancia) VALUES ('Reino Unido', 'Estados Unidos', 5550.00);
    INSERT INTO rutas (origen, destino, distancia) VALUES ('Francia', 'Reino Unido', 500.00);

    INSERT INTO rutas (origen, destino, distancia) VALUES ('Ucrania', 'Japón', 2000.00);
    INSERT INTO rutas (origen, destino, distancia) VALUES ('China', 'Japón', 2000.00);
    INSERT INTO rutas (origen, destino, distancia) VALUES ('Ucrania', 'China', 17000.00);

    INSERT INTO rutas (origen, destino, distancia) VALUES ('Noruega', 'Honduras', 1000.00);
    INSERT INTO rutas (origen, destino, distancia) VALUES ('España', 'Honduras', 3000.00);
    INSERT INTO rutas (origen, destino, distancia) VALUES ('Noruega', 'España', 11000.00);

    INSERT INTO rutas (origen, destino, distancia) VALUES ('Argentina', 'Honduras', 1000.00);
    INSERT INTO rutas (origen, destino, distancia) VALUES ('Colombia', 'Honduras', 3000.00);
    INSERT INTO rutas (origen, destino, distancia) VALUES ('Argentina', 'Colombia', 11000.00);

    INSERT INTO rutas (origen, destino, distancia) VALUES ('Rusia', 'Italia', 6000.00);
    INSERT INTO rutas (origen, destino, distancia) VALUES ('Polonia', 'Italia', 3000.00);
    INSERT INTO rutas (origen, destino, distancia) VALUES ('Rusia', 'Polonia', 3000.00);

    -- Insertar vuelos en la tabla vuelos
    INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo) VALUES ('AA1B', 1, 1, '2023-01-10', 145, '15:45', '11:15', 7, false);
    INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo) VALUES ('AA2B', 4, 2, '2023-04-15', 110, '08:15', '06:30', 4, true);
    INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo) VALUES ('AA3B', 5, 3, '2023-05-10', 215, '18:30', '15:40', 8, true);

    INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo) VALUES ('BB1C', 2, 4, '2023-02-20', 489, '19:00', '16:15', 2, false);
    INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo) VALUES ('BB2C', 6, 5, '2023-06-25', 350, '21:45', '18:30', 6, true);
    INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo) VALUES ('BB3C', 7, 6, '2023-07-20', 455, '13:15', '10:00', 5, true);
    
    INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo) VALUES ('CC1D', 3, 7, '2023-03-30', 890, '00:30', '21:45', 4, false);
    INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo) VALUES ('CC2D', 8, 8, '2023-09-10', 515, '10:00', '06:45', 2, true);
    INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo) VALUES ('CC3D', 1, 9, '2023-09-15', 616, '16:30', '13:15', 10, true);
    
    INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo) VALUES ('DD1E', 3, 10, '2023-03-30', 890, '00:30', '21:45', 4, false);
    INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo) VALUES ('DD2E', 1, 11, '2023-09-15', 616, '16:30', '13:15', 10, true);
    INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo) VALUES ('DD3E', 2, 12, '2023-11-01', 777, '21:15', '18:00', 1, true);

    INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo) VALUES ('EE1F', 3, 13, '2023-03-22', 789, '23:00', '20:15', 3, false);
    INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo) VALUES ('EE2F', 4, 14, '2023-04-10', 101, '08:00', '05:45', 2, true);
    INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo) VALUES ('EE3F', 5, 15, '2023-05-05', 202, '17:30', '14:20', 6, true);
    
    INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo) VALUES ('FF1G', 1, 16, '2023-01-01', 123, '14:30', '10:00', 5, false);
    INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo) VALUES ('FF2G', 8, 17, '2023-08-29', 505, '09:30', '06:15', 1, true);
    INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo) VALUES ('FF3G', 2, 18, '2023-10-20', 707, '20:45', '17:30', 10, true);
    
    INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo) VALUES ('HH1I', 1, 19, '2023-01-01', 123, '14:30', '10:00', 5, false);
    INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo) VALUES ('HH2I', 6, 20, '2023-06-18', 303, '21:15', '18:00', 7, true);
    INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo) VALUES ('HH3I', 7, 21, '2023-07-12', 404, '12:45', '09:30', 4, true);
    
    INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo) VALUES ('II1J', 1, 22, '2023-01-01', 123, '14:30', '10:00', 5, false);
    INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo) VALUES ('II2J', 8, 23, '2023-08-29', 505, '09:30', '06:15', 1, true);
    INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo) VALUES ('II3J', 2, 24, '2023-09-03', 606, '16:00', '12:45', 9, true);
    
    INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo) VALUES ('JJ1K', 1, 25, '2023-01-01', 123, '14:30', '10:00', 5, false);
    INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo) VALUES ('JJ2K', 4, 26, '2023-09-03', 606, '16:00', '12:45', 9, true);
    INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo) VALUES ('JJ3K', 2, 27, '2023-10-20', 707, '20:45', '17:30', 10, true);
    
    INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo) VALUES ('KK1L', 1, 28, '2023-01-01', 123, '14:30', '10:00', 5, false);
    INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo) VALUES ('KK2L', 8, 29, '2023-08-29', 505, '09:30', '06:15', 1, true);
    INSERT INTO vuelos (idvuelo, idaerolinea, idruta, fechapartida, numerovuelo, horallegada, horapartida, gate, tipovuelo) VALUES ('KK3L', 2, 30, '2023-10-20', 707, '20:45', '17:30', 10, true);


    -- Insertar datos en la tabla escalas
    INSERT INTO escalas (idvuelopadre, idvuelo, nombreaeropuerto) VALUES ('AA1B', 'AA2B', 'Incheon International');
    INSERT INTO escalas (idvuelopadre, idvuelo, nombreaeropuerto) VALUES ('AA1B', 'AA3B', 'Frankfurt Airport');
    
    INSERT INTO escalas (idvuelopadre, idvuelo, nombreaeropuerto) VALUES ('BB1C', 'BB2C', 'Heathrow Airport');
    INSERT INTO escalas (idvuelopadre, idvuelo, nombreaeropuerto) VALUES ('BB1C', 'BB3C', 'International Airport');

    INSERT INTO escalas (idvuelopadre, idvuelo, nombreaeropuerto) VALUES ('CC1D', 'CC2D', 'Changi Airport');
    INSERT INTO escalas (idvuelopadre, idvuelo, nombreaeropuerto) VALUES ('CC1D', 'CC3D', 'Best International Airport');

    INSERT INTO escalas (idvuelopadre, idvuelo, nombreaeropuerto) VALUES ('DD1E', 'DD2E', 'Frankfurt Airport');
    INSERT INTO escalas (idvuelopadre, idvuelo, nombreaeropuerto) VALUES ('DD1E', 'DD3E', 'Changi Airport');

    INSERT INTO escalas (idvuelopadre, idvuelo, nombreaeropuerto) VALUES ('EE1F', 'EE2F', 'International Airport');
    INSERT INTO escalas (idvuelopadre, idvuelo, nombreaeropuerto) VALUES ('EE1F', 'EE3F', 'Charles de Gaulle Airport');

    INSERT INTO escalas (idvuelopadre, idvuelo, nombreaeropuerto) VALUES ('FF1G', 'FF2G', 'Capital International Airport');
    INSERT INTO escalas (idvuelopadre, idvuelo, nombreaeropuerto) VALUES ('FF1G', 'FF3G', 'T.A.M Airport');

    INSERT INTO escalas (idvuelopadre, idvuelo, nombreaeropuerto) VALUES ('HH1I', 'HH2I', 'Frankfurt Airport');
    INSERT INTO escalas (idvuelopadre, idvuelo, nombreaeropuerto) VALUES ('HH1I', 'HH3I', 'Changi Airport');

    INSERT INTO escalas (idvuelopadre, idvuelo, nombreaeropuerto) VALUES ('II1J', 'II2J', 'Heathrow Airport');
    INSERT INTO escalas (idvuelopadre, idvuelo, nombreaeropuerto) VALUES ('II1J', 'II3J', 'Best International Airport');

    INSERT INTO escalas (idvuelopadre, idvuelo, nombreaeropuerto) VALUES ('JJ1K', 'JJ2K', 'T.A.M  Airport');
    INSERT INTO escalas (idvuelopadre, idvuelo, nombreaeropuerto) VALUES ('JJ1K', 'JJ3K', 'Incheon International Airport');
    
    INSERT INTO escalas (idvuelopadre, idvuelo, nombreaeropuerto) VALUES ('KK1L', 'KK2L', 'Charles de Gaulle Airport');
    INSERT INTO escalas (idvuelopadre, idvuelo, nombreaeropuerto) VALUES ('KK1L', 'KK3L', 'Capital International Airport');

-- Insertar datos en la tabla asientos
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (1, 'AA2B', 'A1', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (1, 'AA2B', 'A2', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (1, 'AA2B', 'A3', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (1, 'AA2B', 'B1', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (1, 'AA2B', 'B2', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (1, 'AA2B', 'B3', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (1, 'AA2B', 'E1', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (1, 'AA2B', 'E2', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (1, 'AA2B', 'E3', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (1, 'AA2B', 'F1', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (1, 'AA2B', 'F2', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (1, 'AA2B', 'F3', true);

    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'A1', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'A2', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'A3', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'A4', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'A5', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'A6', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'B1', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'B2', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'B3', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'B4', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'B5', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'B6', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'C1', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'C2', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'C3', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'C4', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'C5', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'C6', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'D1', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'D2', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'D3', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'D4', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'D5', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'D6', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'E1', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'E2', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'E3', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'E4', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'E5', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'E6', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'F1', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'F2', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'F3', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'F4', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'F5', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (2, 'AA2B', 'F6', true);

    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'A1', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'A2', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'A3', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'A4', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'A5', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'A6', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'A7', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'B1', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'B2', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'B3', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'B4', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'B5', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'B6', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'B7', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'C1', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'C2', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'C3', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'C4', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'C5', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'C6', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'C7', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'D1', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'D2', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'D3', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'D4', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'D5', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'D6', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'D7', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'E1', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'E2', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'E3', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'E4', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'E5', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'E6', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'E7', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'F1', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'F2', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'F3', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'F4', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'F5', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'F6', true);
    INSERT INTO asientos (idtipoasiento, idvuelo, nombreasiento, disponible) VALUES (3, 'AA2B', 'F7', true);

-- Insertar datos en la tabla asientos
INSERT INTO boletos (idcliente, idescala, idasiento, precio) VALUES(1, null, 1, 500);