#DROP database clientes;
create database if not exists clientes default character set "utf8";
USE clientes;

create table cliente(
	id_cliente INTEGER not null auto_increment primary key,
    nombre varchar(20) not null,
    apellido varchar(20) not null,
    tarjeta_pago varchar(18)
    );
    
create table producto(
	id_producto INTEGER not null auto_increment primary key,
	nombre_producto varchar(20) not null,
    precio int not null    
    );
#select *
#from producto;
create table factura(
	id_factura INTEGER not null auto_increment primary key,
	id_cliente1 INTEGER not null,
    
    FOREIGN KEY (id_cliente1) REFERENCES cliente(id_cliente)
    );
 
create table producto_factura(
    id_factura1 INTEGER not null,
	id_producto1 INTEGER not null,

    FOREIGN KEY (id_factura1) REFERENCES factura(id_factura),
    FOREIGN KEY (id_producto1) REFERENCES producto(id_producto)
    ); 
    