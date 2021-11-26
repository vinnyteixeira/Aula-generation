create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe(
id bigint auto_increment,
nome_classe varchar (255),
habilidade_classe varchar(255),
poder_habilidade int,
primary key (id)
);

insert into tb_classe(nome_classe, habilidade_classe, poder_habilidade) values ("Guerreiro", "Espadada", 20);
insert into tb_classe(nome_classe, habilidade_classe, poder_habilidade) values ("Mago", "Vendaval", 30);
insert into tb_classe(nome_classe, habilidade_classe, poder_habilidade) values ("Ladino", "Ataque furtivo", 15);
insert into tb_classe(nome_classe, habilidade_classe, poder_habilidade) values ("Bardo", "Cura musical", 5);
insert into tb_classe(nome_classe, habilidade_classe, poder_habilidade) values ("Arqueiro", "Flechada mortal", 20);


select * from tb_classe;

create table tb_personagens(
id bigint auto_increment,
nome_personagem varchar(100),
ataque int,
defesa int,
inteligencia int,
carisma int,
classe_id bigint,
primary key (id),
foreign key (classe_id) references tb_classe(id)
);

insert into tb_personagens(nome_personagem, ataque, defesa, inteligencia, carisma, classe_id) values ("Vinicius", 2000, 5000, 1500, 2000, 1);
insert into tb_personagens(nome_personagem, ataque, defesa, inteligencia, carisma, classe_id) values ("Maria", 3000, 1000, 1000, 2000, 2);
insert into tb_personagens(nome_personagem, ataque, defesa, inteligencia, carisma, classe_id) values ("João", 2500, 2000, 800, 900, 3);
insert into tb_personagens(nome_personagem, ataque, defesa, inteligencia, carisma, classe_id) values ("Elaine", 4000, 500, 700, 1000, 4);
insert into tb_personagens(nome_personagem, ataque, defesa, inteligencia, carisma, classe_id) values ("Marcos", 2500, 2000, 800, 900, 3);
insert into tb_personagens(nome_personagem, ataque, defesa, inteligencia, carisma, classe_id) values ("Paulo", 2000, 5000, 1500, 2000, 1);
insert into tb_personagens(nome_personagem, ataque, defesa, inteligencia, carisma, classe_id) values ("Camila", 3000, 1000, 1000, 2000, 2);
insert into tb_personagens(nome_personagem, ataque, defesa, inteligencia, carisma, classe_id) values ("Fernando", 1000, 3000, 1500, 2000, 5);
insert into tb_personagens(nome_personagem, ataque, defesa, inteligencia, carisma, classe_id) values ("Luciano", 4000, 500, 700, 1000, 4);

select * from tb_personagens;

select * from tb_personagens where ataque > 2000;

select * from tb_personagens where defesa between 1000 and 2000;

select * from tb_personagens where nome_personagem like "C%";

select * from tb_personagens inner join tb_classe 
on tb_personagens.classe_id = tb_classe.id;

select tb_personagens.nome_personagem, tb_classe.nome_classe from tb_personagens inner join tb_classe 
on tb_personagens.classe_id = tb_classe.id
where tb_classe.id = 4;