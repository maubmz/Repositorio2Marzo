INSERT INTO cliente(Nombre, Apellido, Telefono) values ("Paola", "Vazquez", 551103944);
INSERT INTO cliente(Nombre, Apellido, Telefono) values ("Haziel", "Maldonado",561094819);

Select *
from cliente;

INSERT INTO factura(FechaCompra, NumeroProductos, Costo, IDcliente1) values ("20-09-2023", 10, 2500, 1);
INSERT INTO factura(FechaCompra, NumeroProductos, Costo, IDcliente1) values ("31-09-2023", 15, 2000, 2);

Select *
from factura;

INSERT INTO producto(Nombre, Precio) values ("Pan", 100);
INSERT INTO producto(Nombre, Precio) values ("Bisteck", 200);
INSERT INTO producto(Nombre, Precio) values ("Refresco", 150);

INSERT INTO producto(Nombre, Precio) values ("PanHambu", 150);
INSERT INTO producto(Nombre, Precio) values ("Cervezas", 500);
INSERT INTO producto(Nombre, Precio) values ("Hielos", 150);

Select * 
from producto;

INSERT INTO factura_producto(IDfactura2, IDproducto1) values (1, 1);
INSERT INTO factura_producto(IDfactura2, IDproducto1) values (1, 2);
INSERT INTO factura_producto(IDfactura2, IDproducto1) values (1,3);

INSERT INTO factura_producto(IDfactura2, IDproducto1) values (2, 1);
INSERT INTO factura_producto(IDfactura2, IDproducto1) values (2, 2);
INSERT INTO factura_producto(IDfactura2, IDproducto1) values (2,3);

Select *
from factura_producto;

INSERT INTO producto_cliente(IDproducto2, IDcliente3) values (1,1);
INSERT INTO producto_cliente(IDproducto2, IDcliente3) values (2,1);
INSERT INTO producto_cliente(IDproducto2, IDcliente3) values (3,1);

Select *
from producto_cliente;

select a.nombre , b.IDfactura , b.costo , c.precio, c.nombre
from cliente a , factura b, producto c, factura_producto d
where a.IDcliente = b.IDcliente1 #Centran las columnas
and d.IDfactura2 = b.IDfactura 
and d.IDproducto1 = c.IDproducto
and a.nombre = "Haziel";

select *
from factura;

select *
from cliente;

select * 
from factura_producto;


/* Comentar entre lineas 
aaaa
*/