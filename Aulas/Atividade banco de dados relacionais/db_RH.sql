create database db_RH;

use db_RH;

create table tb_funcionaries(
id bigint auto_increment,
nome varchar (255) not null,
data_nascimento varchar(20),
sexo varchar (255),
salario decimal (7,2),
primary key (id)
);

insert into tb_funcionaries(nome, data_nascimento, sexo, salario) values ("Maria", "01/01/1999", "Feminino", 2500.00);
insert into tb_funcionaries(nome, data_nascimento, sexo, salario) values ("João", "05/11/1978", "Masculino", 3500.00);
insert into tb_funcionaries(nome, data_nascimento, sexo, salario) values ("Rita", "23/05/1986", "Feminino", 7500.00);
insert into tb_funcionaries(nome, data_nascimento, sexo, salario) values ("Pedro", "08/06/1997", "Masculino", 1800.00);
insert into tb_funcionaries(nome, data_nascimento, sexo, salario) values ("Vinicius", "02/12/2001", "Masculino", 8000.00);


select * from tb_funcionaries where salario > 2000.00;
select * from tb_funcionaries where salario < 2000.00;

update tb_funcionaries set salario = 2800.00 where id = 2;
