create table cliente(
nombre_id int not null  primary key,
apellido varchar(20) not null
);

create table producto(
producto_id int primary key,
nombre_prod varchar(20) not null,
cliente_id int not null,
FOREIGN KEY (cliente_id) REFERENCES cliente(nombre_id)
);