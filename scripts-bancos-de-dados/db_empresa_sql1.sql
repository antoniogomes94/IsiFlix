/* 1. recuperar todos os departamentos */
select * from departamento;
select numero_id, nome, andar from departamento;
select departamento.numero_id, departamento.nome, departamento.andar from departamento;
select numero_id as 'identificacao',
       nome      as 'departamento',
       andar     as 'numero do andar'
       from departamento ;

/* 2. recuperar todos os funcionarios */
select * from funcionario;

/* 2a. recuperar todos os funcionarios que ganham acima de 5000,00 */
select * from funcionario 
     where salario > 5000;

/* 3. recuperar os funcionarios em ordem alfabética */
select * from funcionario order by nome;

/* 4. recuperar quantos funcionários há na empresa */
select count(num_funcional) as 'quantidade' from funcionario;

/* 5. recuperar quantos funcionários há por departamento */
select count(numero_id) as 'quantidade', numero_id as 'departamento'
     from funcionario group by numero_id;

/* 6. recuperar qual o número do departamento que tem + de 2 funconários */
select count(numero_id) as 'quantidade', numero_id as 'departamento'
     from funcionario 
     group by numero_id
     having count(numero_id) > 2;

/* 7. recupear todos os funcionarios que começam com a letra P */
select * from funcionario 
     where nome like 'P%';

/* 8. recuperar todos os funcionarios que tenham "da" em alguma parte do nome */
select * from funcionario 
      where nome like '%da%';
    
/* 9. recuperar todos os funcionarios que tenham sobrenome Ramos */
select * from funcionario 
      where nome like '% Ramos';
      
/* 10. selecionar todos os funcionarios que possuem um chefe */
select * from funcionario
      where num_chefe is not null;    