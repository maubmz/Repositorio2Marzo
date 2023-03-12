DROP DATABASE IF EXISTS viajesprof;
CREATE DATABASE IF NOT EXISTS viajesprof DEFAULT CHARACTER SET 'utf8';
USE viajesprof;
 
CREATE TABLE profesor(
CURP            VARCHAR(18) NOT NULL PRIMARY KEY,
nombre            VARCHAR(50) NOT NULL,
apellido        VARCHAR(50) NOT NULL,
despacho        VARCHAR(50) NOT NULL,
CONSTRAINT veri_curp UNIQUE(CURP)
);
 
CREATE TABLE pais(
cod_pais        INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
nombre_pais        VARCHAR(50) NOT NULL
);
 
CREATE TABLE viaje(
cod_viaje         INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
fecha_inv        DATE NOT NULL,
fecha_finv        DATE NOT NULL,
motivo             VARCHAR(50) NOT NULL,
cod_pais1        INTEGER NOT NULL,
FOREIGN KEY (cod_pais1) REFERENCES pais(cod_pais),
 
CONSTRAINT veri_fecha_inv CHECK (fecha_inv LIKE '____-__-__'),
CONSTRAINT veri_fecha_finv CHECK (fecha_finv LIKE '____-__-__')
);
 
CREATE TABLE gasto(
cod_gasto         INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
tipo_gasto        VARCHAR(11) BINARY NOT NULL,
fecha_ing        DATE NOT NULL,
fecha_fing        DATE NOT NULL,
CURP1             VARCHAR(18) NOT NULL,
FOREIGN KEY (CURP1) REFERENCES profesor(CURP),    
cod_pais2        INTEGER NOT NULL,
FOREIGN KEY (cod_pais2) REFERENCES pais(cod_pais),
 
CONSTRAINT veri_gasto CHECK (tipo_gasto IN ('ALOJAMIENTO' , 'MANUTECNIÓN')),
CONSTRAINT veri_fecha_ing CHECK (fecha_ing LIKE '____-__-__'),
CONSTRAINT veri_fecha_fing CHECK (fecha_fing LIKE '____-__-__')
);
 
CREATE TABLE profesor_viaje(
CURP2             VARCHAR(18) NOT NULL,
cod_viaje1         INTEGER NOT NULL ,
 
FOREIGN KEY (CURP2) REFERENCES profesor(CURP),
FOREIGN KEY (cod_viaje1) REFERENCES viaje(cod_viaje)
);
 
CREATE TABLE viaje_gasto(
cod_viaje2         INTEGER NOT NULL ,
cod_gasto1         INTEGER NOT NULL,
 
FOREIGN KEY (cod_gasto1) REFERENCES gasto(cod_gasto),
FOREIGN KEY (cod_viaje2) REFERENCES viaje(cod_viaje)
);