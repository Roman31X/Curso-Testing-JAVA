CREATE TABLE IF NOT exists pelicula(
id INT auto_increment primary key,
nombre varchar(50) not null,
minutos INT NOT NULL,
genero varchar(50) not null
);

insert into pelicula (nombre,minutos,genero) values
('SUPERMAN',152,'ACCION'),
('IRON-MAN',113,'TRILLER'),
('MATRIX',136,'ACCION');
