USE PLANNING_TOOL;

CREATE TABLE PHASE_MITARBEITER (
	ID_PHASE_MITARBEITER int NOT NULL auto_increment,
    ID_MITARBEITER INT NOT NULL,
    ID_PHASE INT NOT NULL,
	MUTIARTAM DATETIME NOT NULL,
    MUTIERTVON VARCHAR(50) NOT NULL,
    ID_UNIQUE NUMERIC(20, 0) NOT NULL,
    PRIMARY KEY (ID_PHASE_MITARBEITER),
    FOREIGN KEY (ID_MITARBEITER) REFERENCES MITARBEITER(ID_MITARBEITER),
    FOREIGN KEY (ID_PHASE) REFERENCES PHASE(ID_PHASE)
);