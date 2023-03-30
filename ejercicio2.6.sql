insert into cliente(nombre_id, apellido) values (1,"Arreguin");
insert into producto(producto_id,nombre_prod,cliente_id) values (2, "zucaritas", 1);

#select *
#from cliente;

#delete from cliente
#where apellido = "Arreguin";
delete from producto
where nombre_prod = "zucaritas";

select*
from producto;