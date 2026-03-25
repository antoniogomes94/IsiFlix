select * from departamento; /* 3 colunas e 5 tuplas */
select * from funcionario;  /* 6 colunas e 8 tuplas */

select * from departamento JOIN funcionario;  /* 9 colunas e 40 tuplas (8*5)*/

/* 1 - recuperar todos os funcionarios e seus respectivos departamentos */
select funcionario.nome as 'Funcionario', departamento.nome as 'Departamento'
        from departamento INNER JOIN funcionario
	    on departamento.numero_id = funcionario.numero_id;
             
/* 2 - recuperar os funcionarios e o nome do chefe */
select subordinado.nome as 'Nome do Funcionario', chefe.nome as 'Nome do Chefe'
from
       funcionario subordinado inner join 
       funcionario chefe on subordinado.num_chefe = chefe.num_funcional;

select * from funcionario;         
/* 3 - quais funcionarios trabalham em quais projetos */    
select * from funcionario;
select * from projeto;
select * from participa;

select num_contrato as 'Numero do Contrato',
       nome         as 'Funcionario',
       descricao    as 'Projeto'
       from 
   funcionario inner join participa 
               on funcionario.num_funcional = participa.num_funcional
			   inner join projeto
               on participa.codigo = projeto.codigo;
               

     