USE PLANNING_TOOL;

CREATE TABLE STATUS_MITARBEITER (
	ID_STATUS_MITARBEITER int NOT NULL auto_increment,
    ID_MITARBEITER INT NOT NULL,
    ID_STATUS INT NOT NULL,
	MUTIARTAM DATETIME NOT NULL,
    MUTIERTVON VARCHAR(50) NOT NULL,
    ID_UNIQUE NUMERIC(20, 0) NOT NULL,
    PRIMARY KEY (ID_STATUS_MITARBEITER),
    FOREIGN KEY (ID_MITARBEITER) REFERENCES MITARBEITER(ID_MITARBEITER),
    FOREIGN KEY (ID_STATUS) REFERENCES STATUS(ID_STATUS)
);