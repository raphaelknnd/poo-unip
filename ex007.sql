CREATE DATABASE mercado;

/*Criação das tabelas*/
CREATE TABLE produto(id_produto INT PRIMARY KEY NOT NULL, nome VARCHAR(50) NOT NULL, preco FLOAT NOT NULL, quantidade INT NOT NULL);

CREATE TABLE venda(id_venda INT PRIMARY KEY NOT NULL, data_venda DATE NOT NULL, quantidade_vendida INT NOT NULL, id_produto INT NOT NULL);

/*Alteração da tabela pra chave extrangeira*/
ALTER TABLE venda ADD CONSTRAINT fk_produto foreign key(id_produto) references produto (id_produto);