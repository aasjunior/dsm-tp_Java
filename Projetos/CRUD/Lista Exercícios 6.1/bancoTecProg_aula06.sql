create database bancoTecProg_aula06;
use bancoTecProg_aula06;

create table Usuarios(
	id int(3) auto_increment not null,
    nome varchar(100) not null,
    email varchar(100) not null,
    login varchar(100) not null,
    senha varchar(100) not null,
    constraint chk_email check(email like "%_@__%.__%"),
    UNIQUE(login, email),
    PRIMARY KEY(id)
);
/*select * from Usuarios;*/
/*drop table Usuarios;*/

create table Produtos(
	codigo int(3) auto_increment not null,
    nomeProduto varchar(50) not null,
    descricao varchar(100) not null,
    UNIQUE(nomeProduto),
    PRIMARY KEY(codigo)
);
/*select * from Produtos;*/
/*drop table Produtos;*/

create table Vendas(
	codigo int(3) auto_increment not null,
    nomeVendedor varchar(50) not null,
    produtoVendido varchar(50) not null,
    PRIMARY KEY(codigo)
);