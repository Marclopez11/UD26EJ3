DROP DATABASE IF EXISTS grandesalmacenes ;
CREATE DATABASE grandesalmacenes;


USE grandesalmacenes;




DROP TABLE IF EXISTS cajeros;
CREATE TABLE cajeros(
id int AUTO_INCREMENT PRIMARY KEY,
nomapels nvarchar(255)  not null
);


DROP TABLE IF EXISTS productos;
CREATE TABLE productos(
id int AUTO_INCREMENT PRIMARY KEY,
nombre nvarchar(100)  not null,
precio int
);
DROP TABLE IF EXISTS maquinas_registradas;
CREATE TABLE maquinas_registradas(
id int AUTO_INCREMENT PRIMARY KEY,
piso int not null
);


DROP TABLE IF EXISTS venta;
CREATE TABLE venta(
id int AUTO_INCREMENT PRIMARY KEY,
cajero int,
maquina int,
producto int,
CONSTRAINT FK_calero FOREIGN KEY (cajero)
REFERENCES cajeros(id)
ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT FK_maquina FOREIGN KEY (maquina)
REFERENCES maquinas_registradas(id)
ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT FK_producto FOREIGN KEY (producto)
REFERENCES productos(id)
ON DELETE CASCADE ON UPDATE CASCADE


);