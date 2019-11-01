CREATE DATABASE lenguajesProgramacionDB;
USE lenguajesProgramacionDB;

CREATE TABLE lenguajes(
	id int auto_increment primary key not null,
    lanzamiento date not null,
    creador varchar(50) not null,
    descripcion varchar(150) not null,
    foto varchar(255) not null
);

