# INSERT INTO  pais( nombre_pais ) VALUES ( "Alemania"), ("Brasil") ,("Italia"),("Mexico - Mexico CDMX");
# INSERT INTO  pais( nombre_pais ) VALUES ( "Singapur"), ("Belgica");
# select * from pais;
# INSERT INTO  profesor( CURP , nombre , apellido , despacho ) VALUES ("VICAO31292GHSDKF45" ,"Juanito","Balderas","El Inge");
# select nombre,despacho from profesor;
# select * from profesor;
# INSERT INTO  viaje( fecha_inv , fecha_finv , motivo, cod_pais1 ) VALUES ( "2023-05-22","2023-08-26","Cumpleaños",2);
# select * from viaje;
# INSERT INTO  gasto(  tipo_gasto , fecha_ing, fecha_fing,CURP1,cod_pais2 ) VALUES ( "ALOJAMIENTO","2023-05-24","2023-08-25","VICAO31292GHSDKF45",2);
# INSERT INTO  profesor_viaje( CURP2 , cod_viaje1) VALUES ( "VICAO31292GHSDKF45",1);\
# select * from profesor_viaje;
# INSERT INTO  viaje_gasto( cod_viaje2, cod_gasto1) VALUES (1,1);
# select * from viaje_gasto;
# INSERT INTO  profesor( CURP , nombre , apellido , despacho ) VALUES ("KSQB080799HDGHFH70" ,"Karla Sofia","Querubin Barrueta","La Inge");
# INSERT INTO  profesor( CURP , nombre , apellido , despacho ) VALUES ("YSGV151002HDFHSA90" ,"Yunuen Samara","Garcia Velazcos","La licenciada");

 select a.nombre, a.apellido,b.tipo_gasto,c.nombre_pais, b.CURP1, d.motivo
 from profesor a,gasto b, pais c ,viaje d
 where a.CURP = b.CURP1 
 and b.cod_pais2 = c.cod_pais;
