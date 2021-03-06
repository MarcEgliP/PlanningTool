USE PLANNING_TOOL;

CREATE TABLE KOMMENTAR (
	ID_KOMMENTAR int NOT NULL auto_increment,
    ID_MITARBEITER INT NOT NULL,
    ID_PLANUNG INT NOT NULL,
    VON DATE NOT NULL,
    NOTIZ VARCHAR(255) NOT NULL,
	MUTIARTAM DATETIME NOT NULL,
    MUTIERTVON VARCHAR(50) NOT NULL,
    ID_UNIQUE NUMERIC(20, 0) NOT NULL,
    PRIMARY KEY (ID_KOMMENTAR),
    FOREIGN KEY (ID_MITARBEITER) REFERENCES MITARBEITER(ID_MITARBEITER),
    FOREIGN KEY (ID_PLANUNG) REFERENCES PLANUNG(ID_PLANUNG)
);