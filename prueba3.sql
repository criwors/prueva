create database universidad;
use universidad;
create table alumnos(
nombre varchar(255) not null,
apellido varchar(255) not null,
direccion varchar(255) not null,
idalumno int not null primary key,
anniongresado int not null,
carrera varchar(255) not null
);

create table profesor(
nombre varchar(255) not null,
apellido varchar(255) not null,
direccion varchar(255) not null,
idprofesor int not null primary key,
titulo varchar(255) not null,
departamento varchar(255) not null
);

