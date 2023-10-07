-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(1, 'field-1');
-- insert into myentity (id, field) values(2, 'field-2');
-- insert into myentity (id, field) values(3, 'field-3');
-- alter sequence myentity_seq restart with 4;

INSERT INTO PodDescartavel ( marca, puffs, valor, sabor) 
VALUES ('Ignite', '4000', '144,90', 'Icy Mint');
INSERT INTO PodDescartavel ( marca, puffs, valor, sabor) 
VALUES ('NikBar', '6000', '144,90', 'Strawberry Ice');
INSERT INTO PodDescartavel ( marca, puffs, valor, sabor) 
VALUES ('Elfbar', '5000', '110,00', 'Grape');
INSERT INTO PodDescartavel ( marca, puffs, valor, sabor) 
VALUES ('Geekbar', '5000', '109,90', 'Strawberry Mango');

INSERT INTO PodRecarregavel (marca, modelo, cor, valor)
VALUES ('Uwell', 'Caliburn G2', 'Vermelho', '193,90');
INSERT INTO PodRecarregavel (marca, modelo, cor, valor)
VALUES ('Vaporesso', 'Xros 3', 'Prata', '205,50');
INSERT INTO PodRecarregavel (marca, modelo, cor, valor)
VALUES ('Voopoo', 'Drag Nano 2', 'Preto', '237,90');

/* INSERT INTO Nic ( marca, tipo, valor, sabor)
VALUES ('Salt Magna', 'Atabacada', '68,90', 'Morango com Tabaco');
INSERT INTO Nic ( marca, tipo, valor, sabor)
VALUES ('BLVK', 'Mentolada', '101,30', 'Hortela e baunilha');
INSERT INTO Nic ( marca, tipo, valor, sabor)
VALUES ('Caravela ', 'Ice', '45,90', 'Melancia com banana');
INSERT INTO Nic ( marca, tipo, valor, sabor)
VALUES ('Naked', 'Frutada', '93,70', 'Morango com Kiwi');
*/

INSERT INTO vape (marca, modelo, cor, valor)
VALUES ('Vaporesso', 'GTX GO 80', 'Azul', '179,90');
INSERT INTO vape (marca, modelo, cor, valor)
VALUES ('Uwell', 'Koko Tenet', 'Cromado rosa', '309,80');
INSERT INTO vape (marca, modelo, cor, valor)
VALUES ('Voopoo', 'Drag X Plus', 'Preto', '290,10');

/*
INSERT INTO Juice ( marca, tipo, valor, sabor)
VALUES ('Black Note', 'Atabacada', '97,80', 'Tabaco');
INSERT INTO Juice ( marca, tipo, valor, sabor)
VALUES ('LS Juices', 'Ice', '25,90', 'Melancia Ice');
INSERT INTO Juice ( marca, tipo, valor, sabor)
VALUES ('Chilly Beats', 'Tropical', '98,20', 'Abacaxi com uva');
INSERT INTO Juice ( marca, tipo, valor, sabor)
VALUES ('Joyetech ', 'Mentolada', '112,50', 'Hortela com menta');
*/

