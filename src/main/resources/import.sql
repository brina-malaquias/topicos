-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(1, 'field-1');
-- insert into myentity (id, field) values(2, 'field-2');
-- insert into myentity (id, field) values(3, 'field-3');
-- alter sequence myentity_seq restart with 4;

INSERT INTO podDescartavel ( marca, puffs, valor, sabor) 
VALUES ('Ignite', '4000', '144,90', 'Icy Mint');
INSERT INTO podDescartavel ( marca, puffs, valor, sabor) 
VALUES ('NikBar', '6000', '144,90', 'Strawberry Ice');
INSERT INTO podDescartavel ( marca, puffs, valor, sabor) 
VALUES ('Elfbar', '5000', '110,00', 'Grape');
INSERT INTO podDescartavel ( marca, puffs, valor, sabor) 
VALUES ('Geekbar', '5000', '109,90', 'Strawberry Mango');

INSERT INTO podRecarregavel (marca, modelo, cor, valor)
VALUES ('Uwell', 'Caliburn G2', 'Vermelho', '193,90');
INSERT INTO podRecarregavel (marca, modelo, cor, valor)
VALUES ('Vaporesso', 'Xros 3', 'Prata', '205,50');
INSERT INTO podRecarregavel (marca, modelo, cor, valor)
VALUES ('Voopoo', 'Drag Nano 2', 'Preto', '237,90');

INSERT INTO vape (marca, modelo, cor, valor)
VALUES ('Vaporesso', 'GTX GO 80', 'Azul', '179,90');
INSERT INTO vape (marca, modelo, cor, valor)
VALUES ('Uwell', 'Koko Tenet', 'Cromado rosa', '309,80');
INSERT INTO vape (marca, modelo, cor, valor)
VALUES ('Voopoo', 'Drag X Plus', 'Preto', '290,10');

/* INSERT INTO Nic ( marca, tipo, valor, sabor)
VALUES ('Salt Magna', 'Atabacada', '68,90', 'Morango com Tabaco');
INSERT INTO Nic ( marca, tipo, valor, sabor)
VALUES ('BLVK', 'Mentolada', '101,30', 'Hortela e baunilha');
INSERT INTO Nic ( marca, tipo, valor, sabor)
VALUES ('Caravela ', 'Ice', '45,90', 'Melancia com banana');
INSERT INTO Nic ( marca, tipo, valor, sabor)
VALUES ('Naked', 'Frutada', '93,70', 'Morango com Kiwi');

INSERT INTO Juice ( marca, tipo, valor, sabor)
VALUES ('Black Note', 'Atabacada', '97,80', 'Tabaco');
INSERT INTO Juice ( marca, tipo, valor, sabor)
VALUES ('LS Juices', 'Ice', '25,90', 'Melancia Ice');
INSERT INTO Juice ( marca, tipo, valor, sabor)
VALUES ('Chilly Beats', 'Tropical', '98,20', 'Abacaxi com uva');
INSERT INTO Juice ( marca, tipo, valor, sabor)
VALUES ('Joyetech ', 'Mentolada', '112,50', 'Hortela com menta');

INSERT INTO endereco (bairro, quadra, complemento, n) 
VALUES ('Plano Diretor Sul', '712 sul', 'Alameda 32 Qi 21', '08');
INSERT INTO endereco (bairro, quadra, complemento, n) 
VALUES ('Plano Diretor Norte', '103 norte', 'Alameda 23 Qi 17', '19');
INSERT INTO endereco (bairro, quadra, complemento, n) 
VALUES ('Santa Fe', 'Qd 27', 'Rua 17', '12');
INSERT INTO endereco (bairro, quadra, complemento, n) 
VALUES ('Morada do Sol', 'Qd 17', 'Rua 2', '34');
INSERT INTO endereco (bairro, quadra, complemento, n) 
VALUES ('Santa Barbara', 'Qd 3', 'Rua 16', '17');
INSERT INTO endereco (bairro, quadra, complemento, n) 
VALUES ('Plano Diretor Sul', '309 sul', 'Alameda 12 Qi 15', '19');

INSERT INTO telefone (codigoArea, numero) 
VALUES ('011', '98456-7812');
INSERT INTO telefone (codigoArea, numero) 
VALUES ('061', '99901-5842');
INSERT INTO telefone (codigoArea, numero) 
VALUES ('062', '98451-0329');
INSERT INTO telefone (codigoArea, numero) 
VALUES ('063', '99245-1837');
INSERT INTO telefone (codigoArea, numero) 
VALUES ('062', '98402-0389');
INSERT INTO telefone (codigoArea, numero) 
VALUES ('063', '99971-9217');


INSERT INTO cliente (nome, cpf, idade, id_telefone, id_endereco, login, senha)
VALUES ("Gabriel Oliveira", "876.283.948-59", "19", "1", "4", "gabrieloliveira@gmail.com", "5623");
INSERT INTO cliente (nome, cpf, idade, id_telefone, id_endereco, login, senha)
VALUES ("Gustavo Sales", "314.712.135-74", "23", "2", "1", "gustavosales@gmail.com", "1233");
INSERT INTO cliente (nome, cpf, idade, id_telefone, id_endereco, login, senha)
VALUES ("Maria Virgulino", "417.472.774-62", "34", "4", "2", "mariavirg@hotmail.com", "1643");
INSERT INTO cliente (nome, cpf, idade, id_telefone, id_endereco, login, senha)
VALUES ("Adelson Souza", "469.923.432-98", "21", "3", "6", "adelsonsouzam@gmail.com", "1938");

INSERT INTO administrador (nome, cpf, idade, id_telefone, id_endereco, login, senha)
VALUES ("Rafael Mattos", "123.843.928-81", "23", "5", "3", "rafaelmattos@gmail.com", "6123");
INSERT INTO administrador (nome, cpf, idade, id_telefone, id_endereco, login, senha)
VALUES ("Antenor Silva", "452.938.187-29", "21", "6", "5", "antenorsilva@gmail.com", "9127");

*/