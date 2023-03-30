select *
from profesor 
where CURP = "HHMR030405GHRDFE21";

select a.CURP2, b.nombre, b.apelprofesor_viajegasto
from profesor_viaje a, profesor b, 
        (select * 
        from profesor_viaje a, viaje b
        where a.cod_viaje1 = b.cod_viaje
        and a.CURP2 = 'KSQB080799HDGHFH70') c
where a.CURP2 = b.CURP 
and a.CURP2 = 'KSQB080799HDGHFH70'
and a.CURP2 = c.CURP2;