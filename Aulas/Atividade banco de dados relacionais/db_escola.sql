create database db_escola;

use db_escola;

create table tb_estudantes(
id bigint auto_increment,
nome_aluno varchar (255),
registro_aluno bigint,
sexo varchar(255),
nota decimal (3,1),
primary key (id)
);

insert into tb_estudantes(nome_aluno, registro_aluno, sexo, nota) values ("Giovanni", 50078645215, "Masculino", 07.5);
insert into tb_estudantes(nome_aluno, registro_aluno, sexo, nota) values ("Bruno", 30498645215, "Masculino", 05.5);
insert into tb_estudantes(nome_aluno, registro_aluno, sexo, nota) values ("Maria", 70576845610, "Feminino", 09.0);
insert into tb_estudantes(nome_aluno, registro_aluno, sexo, nota) values ("Jose", 20274645225, "Masculino", 03.5);
insert into tb_estudantes(nome_aluno, registro_aluno, sexo, nota) values ("Paulo", 60172655319, "Masculino", 08.0);
insert into tb_estudantes(nome_aluno, registro_aluno, sexo, nota) values ("Camila", 10072840205, "Feminino", 05.0);
insert into tb_estudantes(nome_aluno, registro_aluno, sexo, nota) values ("Matheus", 40478343210, "Masculino", 00.5);
insert into tb_estudantes(nome_aluno, registro_aluno, sexo, nota) values ("Josefina", 80773642515, "Feminino", 10.0);


select * from tb_estudantes where nota > 7.0;
select * from tb_estudantes where nota < 7.0;

update tb_estudantes set nota = 10.0 where id = 6;