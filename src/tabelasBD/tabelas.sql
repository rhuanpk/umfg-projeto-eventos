--Tabela pai EVENTO
CREATE TABLE evento (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    descricao TEXT,
    data_hora_inicio TIMESTAMP,
    data_hora_fim TIMESTAMP,
    duracao INTERVAL,
    local VARCHAR(150),
    vagas INTEGER,
    status VARCHAR(50),
    valor_inscricao NUMERIC(10,2),
    aberto BOOLEAN,
    cod VARCHAR(20),
    data_limite_inscricao TIMESTAMP
);

CREATE TABLE inscricao (
    id SERIAL PRIMARY KEY,
    participante_nome VARCHAR(100),
    participante_email VARCHAR(100),
    data_inscricao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    evento_id INTEGER REFERENCES evento(id)
);

CREATE TABLE apresentador (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    biografia TEXT,
    evento_id INTEGER REFERENCES evento(id)
);

CREATE TABLE evento_inscricao (
    evento_id INTEGER REFERENCES evento(id),
    inscricao_id INTEGER REFERENCES inscricao(id) ,
    PRIMARY KEY (evento_id, inscricao_id)
);

CREATE TABLE evento_apresentador (
    evento_id INTEGER REFERENCES evento(id),
    apresentador_id INTEGER REFERENCES apresentador(id),
    PRIMARY KEY (evento_id, apresentador_id)
);

CREATE TABLE MiniCurso(
	
);






CREATE TABLE PALESTRA (
   sessao_De_Perguntas BOOLEAN,
   publicoAlvo VARCHAR(250),
   IDEVENTO INT NOT NULL UNIQUE,
   FOREING(IDEVENTO) REFERENCES EVENTO(ID)
);

