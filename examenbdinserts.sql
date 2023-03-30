/*insert into producto (nom_producto, precio) values ("galletas",15),("sabritas",12),("leche",16),("refresco",17),("azucar",8),("cafe",9);

insert into cliente (nombre, apellido, correo, prioridad) values ("Javier", "Arreguin", "javiernila66@gmail.com", "MEMBRESIA");
insert into factura (id_cliente1, fecha_compra) values (1, "2023-02-12");
insert into producto_factura (id_factura1, id_producto1) values (1, 3);

insert into cliente (nombre, apellido, correo, prioridad) values ("Mario", "Martinez", "marioalberto27@gmail.com", "BASICO");
insert into factura (id_cliente1, fecha_compra) values (2, "2023-01-06");
insert into producto_factura (id_factura1, id_producto1) values (2, 4);

insert into cliente(nombre, apellido, correo, prioridad) values ("Susy", "Rodriguez", "susyverdeja25@gmail.com", "MEMBRESIA");
insert into factura (id_cliente1, fecha_compra) values (3, "2023-03-04");
insert into producto_factura (id_factura1, id_producto1) values (3,6);

insert into cliente(nombre, apellido, correo, prioridad) values ("Emmanuel", "Nila", "emmanila24@gmail.com", "BASICO");
insert into factura (id_cliente1, fecha_compra) values (4, "2022-12-24");
insert into producto_factura (id_factura1, id_producto1) values (4,1);

insert into cliente(nombre, apellido, correo, prioridad) values ("Carlos", "Peña", "carlosgarcia20@gmail.com", "BASICO");
insert into factura (id_cliente1, fecha_compra) values (5, "2022-08-26");
insert into producto_factura (id_factura1, id_producto1) values (5,2);




select*
from producto;

select*
from cliente;

select*
from factura;

select*
from producto_factura;

select a.nombre, a.apellido, b.nom_producto, b.id_producto, b.precio, c.id_factura
from cliente a, producto b, factura c, producto_factura d
where a.id_cliente = c.id_cliente1
and c.id_factura = d.id_factura1
and d.id_producto1 = b.id_producto
#and a.nombre = "Javier"*/

