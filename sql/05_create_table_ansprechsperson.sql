USE PLANNING_TOOL;

CREATE TABLE ANSPRECHSPERSON (
	ID_ANSPRECHSPERSON int NOT NULL auto_increment,
    VERANTWORTUNG varchar(255) NOT NULL,
    ID_PERSON INT NULL,
    ID_KUNDE INT NULL,
    MUTIARTAM DATETIME NOT NULL,
    MUTIERTVON VARCHAR(50) NOT NULL,
    ID_UNIQUE NUMERIC(20, 0) NOT NULL,
    PRIMARY KEY (ID_ANSPRECHSPERSON),
    FOREIGN KEY (ID_PERSON) REFERENCES PERSON(ID_PERSON),
    FOREIGN KEY (ID_KUNDE) REFERENCES KUNDE(ID_KUNDE)
);