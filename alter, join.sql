#alter table viaje add precio INT;
#alter table viaje modify precio varchar(10);
#alter table viaje drop column precio;
#select *
#from profesor
#inner join profesor_viaje 
#on profesor.CURP = profesor_viaje.CURP2;
#select *
#from alumno
#left join calf_semestre
#on alumno.boleta = calf_semestre.parcial_uno;
#select *
#from calf_semestre;
SET SQL_SAFE_UPDATES = 0;
INSERT INTO alumno(boleta , nombre, telfono ) VALUES (2, "Juan Carlos","5597872738");
select *
from alumno;
DELETE from alumno
WHERE telfono = "5597872738";
UPDATE alumno
SET boleta = 6
WHERE boleta = 2;
select telfono,nombre
from alumno;


