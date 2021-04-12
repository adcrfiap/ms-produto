DELETE FROM produtos;
DELETE FROM categorias;
DELETE FROM marcas;
DELETE FROM modelos;

TRUNCATE TABLE produtos, categorias, marcas, modelos RESTART IDENTITY;

INSERT INTO categorias (nome) VALUES ('Consoles');
INSERT INTO categorias (nome) VALUES ('Celulares');
INSERT INTO categorias (nome) VALUES ('Notebooks');

INSERT INTO marcas (nome) VALUES ('Apple');
INSERT INTO marcas (nome) VALUES ('Samsung');
INSERT INTO marcas (nome) VALUES ('Sony');

INSERT INTO modelos (nome) VALUES ('Playstation 4');
INSERT INTO modelos (nome) VALUES ('Playstation 4 Slim');
INSERT INTO modelos (nome) VALUES ('Playstation 5');
INSERT INTO modelos (nome) VALUES ('IPhone X');
INSERT INTO modelos (nome) VALUES ('IPhone XR');
INSERT INTO modelos (nome) VALUES ('IPhone 11');
INSERT INTO modelos (nome) VALUES ('Macbook Pro 13');
INSERT INTO modelos (nome) VALUES ('Macbook Pro 16');
INSERT INTO modelos (nome) VALUES ('Macbook Air');