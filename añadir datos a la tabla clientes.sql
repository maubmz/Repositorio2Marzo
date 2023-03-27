#INSERT INTO  cliente( nombre,apellido,tarjeta_pago ) VALUES ( "Oscar" ,"Del Villar", "3566355775468236");
#INSERT INTO  producto( nombre_producto,precio ) VALUES ( "galletas chokis", 18),("leche lala", 22),("ariel super magia", 78),("coca-cola 350ml", 10),("nito", 20);
select * 
from factura;
#ALTER TABLE factura modify id_prodcuto1 int NOT NULL;
#ALTER TABLE factura ADD constraint fk_prodcuto1 FOREIGN KEY (id_prodcuto1) REFERENCES producto(id_producto);
#UPDATE factura
#SET id_prodcuto1 = "5"
#WHERE id_prodcuto1 = 5;
#INSERT INTO factura(id_cliente1) VALUES (2);
#INSERT INTO cliente_factura(id_cliente2, id_factura) VALUES (1 ,1);
#INSERT INTO producto_factura(id_factura1, id_producto1) VALUES (1 ,5);
#INSERT INTO  cliente( nombre,apellido,tarjeta_pago ) VALUES ( "Carlos" ,"Flores", "5768435123556529"); 
#INSERT INTO factura(id_cliente1) VALUES (1);
#INSERT INTO producto_factura(id_factura1, id_producto1) VALUES (1 ,4);
#INSERT INTO factura(id_cliente1) VALUES (2);
#INSERT INTO producto_factura(id_factura1, id_producto1) VALUES (4 ,4);
select a.nombre, a.apellido , b.nombre_producto, b.id_producto,b.precio, c.id_factura
from cliente a, producto b, factura c ,producto_factura d
where a.id_cliente = c.id_cliente1
and c.id_factura = d.id_factura1
and d.id_producto1 = b.id_producto;
#and a.nombre = "Carlos";

