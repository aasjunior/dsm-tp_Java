create database bancoTecProg;
use bancoTecProg;

create table Clientes(
	id int(4) auto_increment,
    codigo int(5),
    nome varchar(60),
    telefone varchar(15),
    email varchar(100),
    primary key(id)
);

select * from Cliente;

create table Usuarios(
	id int(4) auto_increment not null,
    codigo int(3) not null,
    login varchar(50),
    senha varchar(10),
    telefone varchar(15),
    primary key(id)
);