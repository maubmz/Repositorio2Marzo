# ALTER TABLE viaje 
# ADD precio int; 

# ALTER TABLE viaje 
# MODIFY precio varchar(5); 

# ALTER TABLE viaje 
# DROP COLUMN precio; 

SELECT *
FROM viaje;

# SELECT *
# FROM profesor
# INNER JOIN profesor_viaje
# ON profesor.CURP = profesor_viaje.CURP2;

# SELECT *
# FROM profesor 
# LEFT JOIN profesor_viaje
# ON profesor.CURP = profesor_viaje.CURP2;

# SELECT *
# FROM profesor 
# RIGHT JOIN profesor_viaje
# ON profesor.CURP = profesor_viaje.CURP2;