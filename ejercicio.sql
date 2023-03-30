drop database if exists viajesprof; 
create database if not exists viajesprof default character set 'utf8';
use viajesprof;
create table profesor(
CURP varchar(18) primary key,
nombre varchar(20) not null,
apellido varchar(20) not null,
despacho varchar(30) not null,
constraint veri_curp UNIQUE(CURP)
);

create table pais(
cod_pais INTEGER not null auto_increment primary key,
fecha_in varchar(20) not null,
fecha_fin varchar(20) not null,
motivo varchar(30) not null,
foreign key(cod_pais1) references pais(cod_pais)
);

create table gasto(
cod_gasto INTEGER not null auto_increment primary key,
tipo_gasto varchar(20) not null,
fecha_inicio varchar(20) not null,
fecha_fin varchar(20) not null,
foreign key(CURP) references profesor(CURP),
foreign key(cod_pais2) references pais(cod_pais)
);

create table viaje(
cod_viaje INTEGER not null auto_increment primary key,
fecha_in varchar(20) not null,
fecha_fin varchar(20) not null,
motivo varchar(30) not null,
foreign key(cod_pais) references pais(cod_pais)
);

create table profesor_viaje(
foreign key(CURP2) references profesor(CURP),
foreign key(cod_viaje) references viaje(cod_viaje)
);

create table viaje_gasto(
foreign key(cod_gasto1) references gasto(cod_gasto),
foreign key(cod_viaje2) references viaje(cod_viaje)
);