
create database db_ecommerce;

use db_ecommerce;

create table tb_produtos(
id bigint auto_increment,
nome_produto varchar (255),
marca varchar(255),
quantidade bigint,
valor_produto decimal (6,2),
primary key (id)
);

insert into tb_produtos(nome_produto, marca, quantidade, valor_produto) values ("camisa", "Adidas", 50, 120.00);
insert into tb_produtos(nome_produto, marca, quantidade, valor_produto) values ("short", "lacoste", 90, 200.00);
insert into tb_produtos(nome_produto, marca, quantidade, valor_produto) values ("meia", "Puma", 150, 010.00);
insert into tb_produtos(nome_produto, marca, quantidade, valor_produto) values ("tenis", "Nike", 5, 920.00);
insert into tb_produtos(nome_produto, marca, quantidade, valor_produto) values ("moletom", "Zara", 30, 820.00);
insert into tb_produtos(nome_produto, marca, quantidade, valor_produto) values ("bone", "New Era", 300, 050.00);
insert into tb_produtos(nome_produto, marca, quantidade, valor_produto) values ("regata", "Oakley", 25, 070.00);
insert into tb_produtos(nome_produto, marca, quantidade, valor_produto) values ("blusa de frio", "adidas", 03, 700.00);


select * from tb_produtos where valor_produto > 500.00;
select * from tb_produtos where valor_produto < 500.00;

update tb_produtos set quantidade = 30 where id = 4;
