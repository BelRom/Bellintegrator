CREATE TABLE IF NOT EXISTS Person (
    id         INTEGER  PRIMARY KEY AUTO_INCREMENT,
    version    INTEGER NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    house_id   INTEGER,
    age        INTEGER  NOT NULL
);

CREATE TABLE IF NOT EXISTS House (
    id         INTEGER  PRIMARY KEY AUTO_INCREMENT,
    version    INTEGER NOT NULL,
    address    VARCHAR(50) NOT NULL
);

CREATE INDEX IX_Person_House_Id ON Person (house_id);
ALTER TABLE Person ADD FOREIGN KEY (house_id) REFERENCES House(id);

CREATE TABLE IF NOT EXISTS UserLog (
    id       INTEGER  PRIMARY KEY AUTO_INCREMENT,
    login    VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    name     VARCHAR(50) NOT NULL
);

CREATE INDEX IX_User_Log_Login ON UserLog (login);

CREATE TABLE IF NOT EXISTS Organization (
    id              INTEGER  PRIMARY KEY AUTO_INCREMENT,
    organization_id INTEGER,
    name            VARCHAR(50) NOT NULL,
    full_name       VARCHAR(50),
    inn             VARCHAR(50),
    kpp             VARCHAR(50),
    address         VARCHAR(100),
    phone           VARCHAR(50),
    is_active       BOOLEAN
);

CREATE INDEX IX_Organization_Name ON Organization (name);
CREATE INDEX IX_Organization_Inn ON Organization (inn);
CREATE INDEX IX_Organization_Is_Active ON Organization (is_active);

CREATE TABLE IF NOT EXISTS Office (
    id              INTEGER  PRIMARY KEY AUTO_INCREMENT,
    org_id          INTEGER NOT NULL,
    name            VARCHAR(50),
    address         VARCHAR(100),
    phone           VARCHAR(50),
    is_active       BOOLEAN
);

CREATE INDEX IX_Office_Org_Id ON Office (org_id);
CREATE INDEX IX_Office_Name ON Office (name);
CREATE INDEX IX_Office_Phone ON Office (phone);
CREATE INDEX IX_Office_Is_Active ON Office (is_active);

CREATE TABLE IF NOT EXISTS Employee (
    id               INTEGER  PRIMARY KEY AUTO_INCREMENT,
    office_id        INTEGER NOT NULL,
    first_name       VARCHAR(50),
    second_name      VARCHAR(50),
    middle_name      VARCHAR(50),
    position         VARCHAR(50),
    phone            VARCHAR(50),
    doc_name         VARCHAR(50),
    doc_number       VARCHAR(50),
    doc_date         VARCHAR(50),
    citizenship_name VARCHAR(50),
    citizenship_code INTEGER,
    is_identified    BOOLEAN
);

CREATE INDEX IX_Employee_Office_Id ON Employee (office_id);
CREATE INDEX IX_Employee_First_Name ON Employee (first_name);
CREATE INDEX IX_Employee_Second_Name ON Employee (second_name);
CREATE INDEX IX_Employee_Middle_Name ON Employee (middle_name);
CREATE INDEX IX_Employee_Position ON Employee (position);
CREATE INDEX IX_Employee_Doc_number ON Employee (doc_number);
CREATE INDEX IX_Employee_Citizenship_Code ON Employee (citizenship_code);



CREATE TABLE IF NOT EXISTS DocTypes (
  id              INTEGER  PRIMARY KEY AUTO_INCREMENT,
  name            VARCHAR(200),
  code            INTEGER
);

CREATE TABLE IF NOT EXISTS Countries (
  id              INTEGER  PRIMARY KEY AUTO_INCREMENT,
  name            VARCHAR(50),
  code            INTEGER
);



