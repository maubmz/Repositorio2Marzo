select * 
from profesor 
where CURP = 'KSQB080799HDGHFH70';

select *
from profesor_viaje;

select *
from profesor_viaje a, profesor b
where a.CURP2 = b.CURP 
and a.CURP2 = "KSQB080799HDGHFH70";

select * 
from profesor_viaje a, viaje b
where a.cod_viaje1 = b.cod_viaje
and a.CURP2 = 'KSQB080799HDGHFH70';

select *
from viaje;

select a.CURP2, b.nombre, b.apellido, b.despacho, a.cod_viaje1, c.fecha_inv, c.fecha_finv,c.motivo, d.nombre_pais
from profesor_viaje a, profesor b, 
        (select * 
        from profesor_viaje a, viaje b
        where a.cod_viaje1 = b.cod_viaje
        and a.CURP2 = 'KSQB080799HDGHFH70') c, pais d
where a.CURP2 = b.CURP 
and a.CURP2 = 'KSQB080799HDGHFH70'
and a.CURP2 = c.CURP2
and c.cod_pais1 = d.cod_pais; 

select *
from profesor a , gasto b
where a.CURP = b.CURP1;

select a.tipo_gasto, b.nombre_pais
from gasto a, pais b
where a.cod_pais2 = b.cod_pais;

select a.CURP,a.nombre, a.apellido, a.despacho, b.cod_gasto, b.tipo_gasto, b.fecha_ing , b.fecha_fing, c.nombre_pais
from profesor a , gasto b,(
			select a.tipo_gasto, b.nombre_pais
			from gasto a, pais b
			where a.cod_pais2 = b.cod_pais
			and a.CURP1 = 'KSQB080799HDGHFH70') c	
where a.CURP = b.CURP1
and a.CURP = c.CURP1;

select a.tipo_gasto, b.nombre_pais, c.CURP
from gasto a, pais b, profesor c
where a.cod_pais2 = b.cod_pais
and a.CURP1 = c.CURP
and a.CURP1 = 'KSQB080799HDGHFH70';