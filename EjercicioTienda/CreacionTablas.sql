# CREATE SCHEMA `tiendaejercicio` ;
# drop database tiendaejercicio;
# USE tiendaejercicio;

CREATE TABLE cliente(
	IDcliente integer not null auto_increment primary key,
    Nombre varchar(10) not null,
    Apellido varchar(10) not null,
    Telefono integer not null
);

CREATE TABLE factura(
	IDfactura integer not null auto_increment primary key,
    FechaCompra varchar (10) not null,
    NumeroProductos Integer not null,
    Costo integer not null,
    IDcliente1 integer not null,
    CONSTRAINT veri_FechaCompra CHECK (FechaCompra LIKE '__-__-____'),
    
    foreign key (IDcliente1) references cliente(IDcliente)
);

CREATE TABLE producto(
	IDproducto integer not null auto_increment primary key,
    Nombre varchar (10) not null,
    Precio integer not null
);

CREATE TABLE factura_producto(
	IDfactura2 integer not null,
    IDproducto1 integer not null,
    
    foreign key (IDfactura2) references factura(IDfactura),
    foreign key (IDproducto1) references producto(IDproducto)
);

CREATE TABLE producto_cliente(
	IDproducto2 integer not null,
    IDcliente3 integer not null,
    
    foreign key (IDproducto2) references producto(IDproducto),
    foreign key (IDcliente3) references cliente(IDcliente)
);
