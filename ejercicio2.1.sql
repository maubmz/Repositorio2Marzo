#INSERT INTO  pais( nombre_pais ) VALUES ( "Alemania"), ("Brasil") ,("Italia"),("Mexico - Mexico CDMX");
#INSERT INTO  pais( nombre_pais ) VALUES ( "Singapur"), ("Belgica");

#INSERT INTO  profesor( CURP , nombre , apellido , despacho ) VALUES ("VICAO31292GHSDKF45" ,"Juanito","Balderas","El Inge");
#INSERT INTO  viaje(fecha_inv,fecha_finv, motivo, cod_pais1) VALUES ("2023-05-22","2023-08-26","Cumpleaños",2);
#INSERT INTO  gasto(  tipo_gasto , fecha_ing, fecha_fing,CURP1,cod_pais2 ) VALUES ( "ALOJAMIENTO","2023-05-24","2023-08-25","VICAO31292GHSDKF45",2);
#INSERT INTO  profesor_viaje( CURP2 , cod_viaje1) VALUES ( "VICAO31292GHSDKF45",1);
#INSERT INTO  viaje_gasto( cod_viaje2, cod_gasto1) VALUES (1,1);

#INSERT INTO  profesor( CURP , nombre , apellido , despacho ) VALUES ("KSQB080799HDGHFH70" ,"Karla Sofia","Querubin Barrueta","La Inge");
#INSERT INTO viaje (fecha_inv, fecha_finv, motivo, cod_pais1) VALUES ("2023-06-14","2023-10-20","Reunion",4);
#INSERT INTO  gasto(  tipo_gasto , fecha_ing, fecha_fing,CURP1,cod_pais2 ) VALUES ( "ALOJAMIENTO","2023-06-16","2023-10-17","KSQB080799HDGHFH70",4);
#INSERT INTO  profesor_viaje( CURP2 , cod_viaje1) VALUES ( "KSQB080799HDGHFH70",2);
#INSERT INTO  viaje_gasto( cod_viaje2, cod_gasto1) VALUES (2,2);

#INSERT INTO  profesor( CURP , nombre , apellido , despacho ) VALUES ("YSGV151002HDFHSA90" ,"Yunuen Samara","Garcia Velazcos","La licenciada");
#INSERT INTO viaje (fecha_inv, fecha_finv, motivo, cod_pais1) VALUES ("2023-08-15","2023-12-28","Firma de contrato",3);
#INSERT INTO  gasto(  tipo_gasto , fecha_ing, fecha_fing,CURP1,cod_pais2 ) VALUES ( "MANUTECNIÓN","2023-08-19","2023-12-26","YSGV151002HDFHSA90",3);
#INSERT INTO  profesor_viaje( CURP2 , cod_viaje1) VALUES ( "YSGV151002HDFHSA90",3);
#INSERT INTO  viaje_gasto( cod_viaje2, cod_gasto1) VALUES (3,3);

#INSERT INTO profesor(CURP,nombre,apellido,despacho) VALUES("AENJ020826HMCRLVA9","Javier","Arreguin Nila","El nuevo");
#INSERT INTO viaje(fecha_inv,fecha_finv,motivo,cod_pais1) VALUES ("2023-11-15","2024-02-20","Cambio de oficina",5);
#INSERT INTO gasto(tipo_gasto,fecha_ing,fecha_fing,CURP1,cod_pais2) VALUES ("MANUTECNIÓN","2023-11-17","2024-02-18","AENJ020826HMCRLVA9",5);
#INSERT INTO profesor_viaje(CURP2, cod_viaje1) VALUES ("AENJ020826HMCRLVA9",4);
#INSERT INTO viaje_gasto(cod_viaje2,cod_gasto1) VALUES (4,4);

#INSERT INTO profesor(CURP,nombre,apellido,despacho) VALUES ("MAHM020207HDFRRRA8","Mario Alberto","Martinez Herrera","El de diseño");
#INSERT INTO viaje(fecha_inv,fecha_finv,motivo,cod_pais1) VALUES ("2023-12-27","2024-02-07","Festejo",6);
#INSERT INTO gasto(tipo_gasto,fecha_ing,fecha_fing,CURP1,cod_pais2) VALUES ("ALOJAMIENTO","2023-12-28","2024-02-05","MAHM020207HDFRRRA8",6);
#INSERT INTO profesor_viaje(CURP2, cod_viaje1) VALUES ("MAHM020207HDFRRRA8",5);
#INSERT INTO viaje_gasto(cod_viaje2,cod_gasto1) VALUES (5,5);

#INSERT INTO profesor(CURP,nombre,apellido,despacho) VALUES ("GAGG970312HDGRRR09","German","Garmendia Garmendia","El de relaciones");
#INSERT INTO viaje(fecha_inv,fecha_finv,motivo,cod_pais1) VALUES ("2024-01-14","2024-03-10","Firma de contrato",1);
#INSERT INTO gasto(tipo_gasto,fecha_ing,fecha_fing,CURP1,cod_pais2) VALUES ("MANUTECNIÓN","2024-01-16","2024-03-08","GAGG970312HDGRRR09",1);
#INSERT INTO profesor_viaje(CURP2, cod_viaje1) VALUES ("GAGG970312HDGRRR09",6);
#INSERT INTO viaje_gasto(cod_viaje2,cod_gasto1) VALUES (6,6);

#select *  from pais;
#select * from profesor;
#select * from viaje;
#select * from gasto;
#select * from profesor_viaje;
#select * from viaje_gasto;

select a.nombre, a.apellido,b.tipo_gasto,c.nombre_pais, b.CURP1
from profesor a,gasto b, pais c 
where a.CURP = b.CURP1
and b.cod_pais2 = c.cod_pais;