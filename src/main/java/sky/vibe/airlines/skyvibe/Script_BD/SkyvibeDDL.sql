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
