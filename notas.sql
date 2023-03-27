#INSERT INTO  pais( nombre_pais ) VALUES ( "Alemania"), ("Brasil") ,("Italia"),("Mexico - Mexico CDMX");
#INSERT INTO  pais( nombre_pais ) VALUES ( "Singapur"), ("Belgica");
#select * from pais;
#INSERT INTO  profesor( CURP , nombre , apellido , despacho ) VALUES ("VICAO31292GHSDKF45" ,"Juanito","Balderas","El Inge");
# select nombre,despacho from profesor;
# select * from profesor;
#INSERT INTO  viaje( fecha_inv , fecha_finv , motivo, cod_pais1 ) VALUES ( "2023-05-22","2023-08-26","Cumpleaños",2);
#INSERT INTO  gasto(  tipo_gasto , fecha_ing, fecha_fing,CURP1,cod_pais2 ) VALUES ( "ALOJAMIENTO","2023-05-24","2023-08-25","VICAO31292GHSDKF45",2);
#INSERT INTO  profesor_viaje( CURP2 , cod_viaje1) VALUES ( "VICAO31292GHSDKF45",1);
#INSERT INTO  viaje_gasto( cod_viaje2, cod_gasto1) VALUES (1,1);
#INSERT INTO  profesor( CURP , nombre , apellido , despacho ) VALUES ("KSQB080799HDGHFH70" ,"Karla Sofia","Querubin Barrueta","La Inge");
#INSERT INTO  profesor( CURP , nombre , apellido , despacho ) VALUES ("YSGV151002HDFHSA90" ,"Yunuen Samara","Garcia Velazcos","La licenciada");
#INSERT INTO  profesor( CURP , nombre , apellido , despacho ) VALUES ("ENST9452343LSHAS48" ,"Ernesto Nestor","Santillan Torbellino","Jefe financiero");
#INSERT INTO  profesor( CURP , nombre , apellido , despacho ) VALUES ("NDHA8543997DSHLB78" ,"Nadia Dayana","Huerta Avila","Doctora juguete");
#INSERT INTO  profesor( CURP , nombre , apellido , despacho ) VALUES ("ENST9452343LSHAS48" ,"Ernesto Nestor","Santillan Torbellino","Jefe financiero");
#INSERT INTO  profesor( CURP , nombre , apellido , despacho ) VALUES ("NDHA8543997DSHLB78" ,"Nadia Dayana","Huerta Avila","Doctora juguete");
#INSERT INTO  profesor( CURP , nombre , apellido , despacho ) VALUES ("UPAS4545456SGFWE36" ,"Uriel Pablo","Arreguin Solis","Octopus");
#INSERT INTO  viaje( fecha_inv , fecha_finv , motivo, cod_pais1 ) VALUES ( "2023-12-22","2024-01-07","Xmas holidays",5);
#INSERT INTO  gasto(  tipo_gasto , fecha_ing, fecha_fing,CURP1,cod_pais2 ) VALUES ( "MANUTECNIÓN","2023-12-23","2024-01-06","UPAS4545456SGFWE36",5);
#DELETE from viaje
#WHERE viaje.cod_viaje = 3;
#UPDATE profesor
#SET nombre = "Juanito"
#WHERE CURP = "ADFGLKSDJOIPOLSDJM"
select a.nombre, a.apellido,b.tipo_gasto,c.nombre_pais, b.CURP1, a.despacho , b.fecha_ing, b.fecha_fing
from profesor a,gasto b, pais c, viaje d
where a.CURP = b.CURP1 = "YSGV151002HDFHSA90"
and b.cod_pais2 = c.cod_pais;
select * from viaje;
