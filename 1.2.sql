# INSERT INTO pais(nombre_pais) VALUES ("Estados Unidos, NYK"), ("Canada, Vancouver");
# select * from pais;

# INSERT INTO profesor(CURP, nombre, apellido, despacho) VALUES ("BAMM031292GHSDKF45", "Ricardo", "Uriel","El lic");
# INSERT INTO profesor(CURP, nombre, apellido, despacho) VALUES ("HHMR030405GHRDFE21", "Hector", "Martinez","Doctor");
# select * from profesor;
 
# INSERT INTO viaje(fecha_inv, fecha_finv, motivo, cod_pais1) VALUES ("2023-05-22", "2023-08-26","Cumpleanios de javi", 2);
# INSERT INTO viaje(fecha_inv, fecha_finv, motivo, cod_pais1) VALUES ("2023-05-19", "2023-09-16","Cumpleanios de javi y fiestas patrias", 2);
# select * from viaje;

# select * from profesor_viaje;

#select * from viaje_gasto;

DELETE FROM viaje_gasto
where cod_viaje2 = 3;
 
 DELETE FROM profesor_viaje
 where cod_viaje1 = 3;

DELETE FROM viaje
where viaje.cod_viaje = 3;

# INSERT INTO gasto( tipo_gasto, fecha_ing, fecha_fing, CURP1, cod_pais2) values ("MANUTECNIÓN", "2023-05-31", "2023-05-31" , "VICAO31292GHSDKF45", 2);
# INSERT INTO gasto( tipo_gasto, fecha_ing, fecha_fing, CURP1, cod_pais2) VALUES ("ALOJAMIENTO", "2023-05-29", "2023-09-01", "KSQB080799HDGHFH70", 2);
# INSERT INTO gasto( tipo_gasto, fecha_ing, fecha_fing, CURP1, cod_pais2) VALUES ("ALOJAMIENTO" , "2023-05-20", "2023-09-16", "YSGV151002HDFHSA90", 2);
# INSERT INTO gasto( tipo_gasto, fecha_ing, fecha_fing, CURP1, cod_pais2) values ("MANUTECNIÓN", "2023-05-20", "2023-05-21" , "KSQB080799HDGHFH70", 2);
# select * from gasto;

# INSERT INTO profesor_viaje( CURP2, cod_viaje1) VALUES("VICAO31292GHSDKF45", 2);
# INSERT INTO profesor_viaje( CURP2, cod_viaje1) VALUES("KSQB080799HDGHFH70",3);
# INSERT INTO profesor_viaje( CURP2, cod_viaje1) VALUES("YSGV151002HDFHSA90", 4);
# select * from profesor_viaje;
 
# INSERT INTO viaje_gasto(cod_viaje2, cod_gasto1) VALUES (1,1);
# INSERT INTO viaje_gasto(cod_viaje2, cod_gasto1) VALUES (2,3);
# INSERT INTO viaje_gasto(cod_viaje2, cod_gasto1) VALUES (3,4);
 select * from viaje_gasto;

# select a.nombre, a.apellido, a.CURP ,b.tipo_gasto, b.fecha_fing ,c.nombre_pais
#  from profesor a,gasto b, pais c
#  where a.CURP = b.CURP1 
#  and b.cod_pais2 = c.cod_pais;