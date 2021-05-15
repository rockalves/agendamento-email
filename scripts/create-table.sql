CREATE DATABASE agendamentoemaildb;

USE agendamentoemaildb;

CREATE TABLE agendamentoemail (
    id int NOT NULL AUTO_INCREMENT,
    email varchar(50) NOT NULL,
    assunto varchar(50) NOT NULL,
    mensagem varchar(255) NOT NULL,
    agendado tinytext NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;