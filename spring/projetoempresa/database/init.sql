create database db_empresa;

use db_empresa;
create table departamento (
   numero_id integer not null auto_increment primary key,
   nome varchar(100) not null,
   andar integer not null
);

insert into departamento values (null, 'Presidencia', 1), 
								(null, 'Engenharia', 1), 
                                (null, 'Infraestrutura',2 ),
                                (null, 'Telecomunicacoes', 3),
                                (null, 'Desenvolvimento', 4);
                 
                 
create table funcionario(
	num_funcional integer not null auto_increment primary key,
    nome varchar(100) not null,
    email varchar(100) unique not null,
    salario double not null,
    numero_id int not null,
    numero_chefe int ,
    
    constraint fk_depto foreign key (numero_id) references departamento(numero_id),
    constraint fk_chefe foreign key (numero_chefe) references funcionario(num_funcional)
);	

insert into funcionario (id, nome, email, salario, id_departamento, id_gerente) values (null, 'Jose Alberto', 'jose@empresa.com.br',10000,1,null ),
							   (null, 'Ana Pinheiro', 'ana@empresa.com.br',8000,2,1 ),
							   (null, 'Pedro Oliveira', 'pedro@empresa.com.br',6000,1,2 ),
							   (null, 'Gilmar Menezes', 'gilmar@empresa.com.br',5000,1,2 ),
							   (null, 'Albert Nunes', 'alberto@empresa.com.br',5000,1,3 ),
							   (null, 'Maria da Gloria Ramos', 'maria@empresa.com.br',5230,1,3 ),
							   (null, 'Paulo de Luca', 'paulo@empresa.com.br',4950,1,3 ),
							   (null, 'Joao das Neves', 'joao@empresa.com.br',4580,1,3 );	
                                                    
create table projeto (
    numero_id integer not null auto_increment primary key,
    nome varchar(200)
);

insert into projeto values (null, 'Sistema Gestao Escolar'),(null, 'Dashboard mercado financeiro'),null, 'Folha de Pagamento'),(null, 'Ecommerce');


create table participa(
   num_contrato integer not null auto_increment primary key,
   num_funcional integer not null,
   numero_id integer not null,
   data_ini date,
   data_fim date,
   constraint fk_funcionario foreign key (num_funcional) references funcionario (num_funcional),
   constraint fk_projeto     foreign key (numero_id) references projeto (numero_id)
);                          


insert into participa values (null, 5, 1, '2021-01-04', '2021-06-30');
insert into participa values (null, 6, 2, '2021-01-04', '2021-06-30');
insert into participa values (null, 7, 3, '2021-01-04', '2021-01-31');
insert into participa values (null, 8, 4, '2021-01-04', '2021-01-31');     
