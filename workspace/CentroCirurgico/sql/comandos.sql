--SQL
	-- Ling
--comando de DDL
-- Linguagem de definicÃ£o de dados
create database centro_cirurgico;
use centro_cirurgico;
create table painel (
-- chave primaria
-- cÃ³digo unico dentro da tabela
cod 		   int primary key auto_increment,
nome_completo  varchar(100),
status         varchar(20),
local          varchar(20),
ini_previsto   varchar(5),
ini_cirurgia   varchar(5),
fim_cirurgia   varchar(5),
saida_prevista varchar(10)
);	
show tables;
desc painel;

--DML (Linguagem de manipulação de dados)
-- insert - update - delete
insert into painel(
nome_completo,
status,
local,
ini_previsto,
ini_cirurgia,
fim_cirurgia,
saida_prevista)
values ('Arthur', 'Em Operação', 'C512', '12:15','12:15','13:30','2019-06-05');
-- value (?,?,?,?,?,?,?);