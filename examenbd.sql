DROP DATABASE IF EXISTS examenbd;
CREATE DATABASE IF NOT EXISTS examenbd DEFAULT CHARACTER SET 'utf8';
USE examenbd;

create table cliente(
id_cliente integer not null auto_increment primary key,
nombre varchar (10) not null,
apellido varchar (20) not null,
correo varchar (50) not null,
prioridad varchar(10) binary not null
CONSTRAINT veri_prioridad CHECK (prioridad IN ('BASICO' , 'MEMBRESIA'))
);

create table factura(
id_factura integer not null auto_increment primary key,
id_cliente1 integer not null,
fecha_compra date not null,
CONSTRAINT veri_fecha_compra CHECK (fecha_compra LIKE '____-__-__'),
foreign key (id_cliente1) references cliente (id_cliente)
);

create table producto(
id_producto integer not null auto_increment primary key,
nom_producto varchar (20) not null,
precio integer not null
);

create table producto_factura(
id_factura1 integer not null,
id_producto1 integer not null,
foreign key (id_factura1) references factura (id_factura),
foreign key (id_producto1) references producto (id_producto)
);





