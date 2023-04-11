# create schema EjercicioTienda;
# use ejercicioTienda;
create table cliente (
	id_cliente integer not null auto_increment primary key,
    nombre varchar(20) not null,
    apellido varchar(20) not null,
    correo varchar(50) not null
);

create table producto(
	id_producto integer not null auto_increment primary key,
    nom_producto varchar(20) not null,
    precio integer not null
);

create table factura(
	id_factura integer not null auto_increment primary key,
    fecha_compra varchar(10) not null,
    id_cliente1 integer not null,
    FOREIGN KEY (id_cliente1) references cliente(id_cliente)
);

create table producto_factura (
	id_factura1 integer not null,
    id_producto1 integer not null,
    FOREIGN KEY (id_factura1) references factura(id_factura),
    FOREIGN KEY (id_producto1) references producto(id_producto)
);