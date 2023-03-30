create table pedido(
id_pedido int primary key,
id_cliente int not null,
foreign key(id_cliente) references customer(id)
);
INSERT INTO pedido(id_pedido, id_cliente) values(324, 1)
