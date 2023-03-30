/*INSERT INTO  profesor( CURP , nombre , apellido , despacho ) VALUES ("VICAO31292GHSDKF45" ,"Juanito","Balderas","El Inge");
INSERT INTO  viaje(fecha_inv,fecha_finv, motivo, cod_pais1) VALUES ("2023-05-22","2023-08-26","Cumpleaños",2);
INSERT INTO  gasto(  tipo_gasto , fecha_ing, fecha_fing,CURP1,cod_pais2 ) VALUES ( "ALOJAMIENTO","2023-05-24","2023-08-25","VICAO31292GHSDKF45",2);
INSERT INTO  profesor_viaje( CURP2 , cod_viaje1) VALUES ( "VICAO31292GHSDKF45",1);
INSERT INTO  viaje_gasto( cod_viaje2, cod_gasto1) VALUES (1,1);


DROP DATABASE IF EXISTS viajesprof;
CREATE DATABASE IF NOT EXISTS viajesprof DEFAULT CHARACTER SET 'utf8';
USE viajesprof;


CONSTRAINT veri_fecha_compra CHECK (fecha_compra LIKE '____-__-__'),
CONSTRAINT veri_prioridad CHECK (prioridad IN ('BASICO' , 'MEMBRESIA'))


CREATE TABLE profesor(
CURP            VARCHAR(18) NOT NULL PRIMARY KEY,
nombre            VARCHAR(50) NOT NULL,
apellido        VARCHAR(50) NOT NULL,
despacho        VARCHAR(50) NOT NULL,
CONSTRAINT veri_curp UNIQUE(CURP)
);


ALTER TABLE viaje ADD precio int;
ALTER TABLE viaje MODIFY precio varchar(5);
ALTER TABLE viaje DROP COLUMN precio;


SELECT *
FROM profesor
JOIN profesor_viaje
ON profesor.CURP = profesor_viaje.CURP2


delete from cliente
where apellido = "Arreguin";


UPDATE cliente
SET nombre = "juan"
where id_cliente = 4;


select a.nombre, a.apellido,b.tipo_gasto,c.nombre_pais, b.CURP1
from profesor a,gasto b, pais c 
where a.CURP = b.CURP1
and b.cod_pais2 = c.cod_pais;


selec: llamar a todos los campos que quiero ver
from: tablas que se ocuparan 
where: condiciones que se van a mostrar*/