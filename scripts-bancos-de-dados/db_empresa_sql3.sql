/* 1. quero saber o nome do projeto e quantos funcionários há em cada um dos projetos */
select * from projeto;
select * from participa;

insert into participa values (null, 3, 2, '2021-01-4', '2021-06-30'),
                             (null, 4, 3, '2021-01-04', '2021-01-31');
                             
select projeto.descricao, count(participa.codigo) as 'numero de funcionarios' from
	projeto inner join participa on projeto.codigo = participa.codigo
    group by participa.codigo;

/* 2. vamos saber a média salarial de cada projeto */
select projeto.descricao, avg(salario) as 'media salarial' from 
	funcionario inner join participa on funcionario.num_funcional = participa.num_funcional
				inner join projeto   on participa.codigo = projeto.codigo
	group by participa.codigo;
 
/* 3. quero saber o custo operacional (soma dos salários) por departamento */
select departamento.nome, avg(salario) as 'custo operacional'  from 
	funcionario inner join departamento on funcionario.numero_id = departamento.numero_id
    group by departamento.numero_id;

/* 4. quero saber o custo operacional (soma dos salários) por projeto */
select projeto.descricao, sum(salario) as 'custo operacional' from 
	funcionario inner join participa on funcionario.num_funcional = participa.num_funcional
				inner join projeto   on participa.codigo = projeto.codigo
	group by participa.codigo;

/* 5. quais são os funcionários da empresa do Departamento de Desenvolvimento (5)
que ganham mais do que a média salarial dos participantes do projeto 4 (Ecommerce) */

select funcionario.nome, salario from funcionario 
	where numero_id = 5 and salario >
    (select avg(salario) from 
	participa inner join funcionario on participa.num_funcional = funcionario.num_funcional
    where codigo = 4);




