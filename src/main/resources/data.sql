INSERT INTO House (id, version, address) VALUES (1, 0, 'ул.Цюрупы, 16');

INSERT INTO Person (version, first_name, age, house_id) VALUES (0, 'Пётр', 20, 1);

INSERT INTO Person (version, first_name, age, house_id) VALUES (0, 'John', 25, 1);

INSERT INTO UserLog (login, password, name) VALUES ('anton', 'anton33', 'Anton');

INSERT INTO UserLog (login, password, name) VALUES ('petr', 'petr26', 'Petr');

INSERT INTO UserLog (login, password, name) VALUES ('igor', '436758', 'Igor');

INSERT INTO UserLog (login, password, name) VALUES ('dmitri', '687555', 'Dmitri');

INSERT INTO UserLog (login, password, name) VALUES ('roman', '7895224', 'Roman');

INSERT INTO Organization (organization_id, name, full_name, inn, kpp, address, phone, is_active)
VALUES (1, 'Cola', 'OOO Cola', '7727563778', '770701001', 'Moskva Lianozovo 2', '8-495-654-55-55', TRUE);

INSERT INTO Organization (organization_id, name, full_name, inn, kpp, address, phone, is_active)
VALUES (2, 'Pepsi', 'OOO Pepsi', '7727563889', '770701874', 'Moskva Leskova 12', '8-495-485-88-22', TRUE);

INSERT INTO Organization (organization_id, name, full_name, inn, kpp, address, phone, is_active)
VALUES (3, 'Baltika', 'OOO Baltika', '7727563564', '770701458', 'Moskva Shirokaya 15', '8-495-958-74-33', TRUE);

INSERT INTO Organization (organization_id, name, full_name, inn, kpp, address, phone, is_active)
VALUES (4, 'MPK', 'OOO MPK', '7727563753', '770701555', 'Moskva Polyarnaya 20', '8-495-321-22-55', TRUE);

INSERT INTO Organization (organization_id, name, full_name, inn, kpp, address, phone, is_active)
VALUES (5, 'Nestle', 'OOO Nestle', '7727563159', '770701012', 'Moskva Snezhnaya 1', '8-495-785-44-11', TRUE);

INSERT INTO Office (org_id , name, address, phone, is_active)
VALUES (1, 'Osnovnoi','Moskva Snezhnaya 1', '8-495-785-45-45', TRUE);

INSERT INTO Office (org_id , name, address, phone, is_active)
VALUES (2, 'Glavniy','Moskva Leskova 12', '8-495-852-15-53', TRUE);

INSERT INTO Office (org_id , name, address, phone, is_active)
VALUES (3, 'Filial','Moskva Shirokaya 15', '8-495-753-75-95', TRUE);

INSERT INTO Office (org_id , name, address, phone, is_active)
VALUES (4, 'Sklad','Moskva Polyarnaya 20', '8-495-591-42-53', TRUE);

INSERT INTO Office (org_id , name, address, phone, is_active)
VALUES (5, 'Shtab','Moskva Lianozovo 2', '8-495-145-33-12', TRUE);

INSERT INTO Employee (office_id , first_name, second_name, middle_name, position, phone, doc_name, doc_number, doc_date, citizenship_name, citizenship_code, is_identified)
VALUES (1, 'Anton','Ivanov', 'Sergeevich', 'direktor', '8-956-655-15-35', 'pasport', '0409-568153', '2015-06-12', 'RF', 643, TRUE);

INSERT INTO Employee (office_id , first_name, second_name, middle_name, position, phone, doc_name, doc_number, doc_date, citizenship_name, citizenship_code, is_identified)
VALUES (2, 'Dmitriy','Sidorov', 'Andreevich', 'developer', '8-987-456-15-67', 'pasport', '8978-456123', '2010-08-30', 'RF', 643, TRUE);

INSERT INTO Employee (office_id , first_name, second_name, middle_name, position, phone, doc_name, doc_number, doc_date, citizenship_name, citizenship_code, is_identified)
VALUES (3, 'Anna','Romanova', 'Ivanovna', 'sekritar', '8-963-753-49-35', 'pasport', '2098-795153', '2014-12-12', 'RF', 643, TRUE);

INSERT INTO Employee (office_id , first_name, second_name, middle_name, position, phone, doc_name, doc_number, doc_date, citizenship_name, citizenship_code, is_identified)
VALUES (4, 'Viktor','Kotlov', 'Maksimovich', 'menedzer', '8-951-486-74-86', 'pasport', '2056-789156', '2009-01-20', 'RF', 643, TRUE);

INSERT INTO Employee (office_id , first_name, second_name, middle_name, position, phone, doc_name, doc_number, doc_date, citizenship_name, citizenship_code, is_identified)
VALUES (5, 'Ekaterina','Melnichenko', 'Romanovna', 'buhgalter', '8-956-655-15-35', 'pasport', '3595-786453', '2017-07-09', 'RF', 643, TRUE);

INSERT INTO DocTypes (name, code) VALUES ('Свидетельство о рождении', 3);

INSERT INTO DocTypes (name, code) VALUES ('Военный билет', 7);

INSERT INTO DocTypes (name, code) VALUES ('Временное удостоверение', 8);

INSERT INTO DocTypes (name, code) VALUES ('Паспорт иностранного гражданина', 10);

INSERT INTO DocTypes (name, code) VALUES ('Свидетельство о рассмотрении ходатайства', 11);

INSERT INTO DocTypes (name, code) VALUES ('Вид на жительство в Российской Федерации', 12);

INSERT INTO DocTypes (name, code) VALUES ('Свидетельство о предоставлении временного убежища', 13);

INSERT INTO DocTypes (name, code) VALUES ('Разрешение на временное проживание', 15);

INSERT INTO DocTypes (name, code) VALUES ('Свидетельство о предоставлении временного убежища', 18);

INSERT INTO DocTypes (name, code) VALUES ('Паспорт гражданина Российской Федерации ', 21);

INSERT INTO DocTypes (name, code) VALUES ('Свидетельство о рождении, выданное уполномоченным органом иностранного государства', 23);

INSERT INTO DocTypes (name, code) VALUES ('Удостоверение личности военнослужащего', 24);

INSERT INTO DocTypes (name, code) VALUES ('Иные документы', 91);

INSERT INTO Countries (name, code) VALUES ('Российская Федерация', 643);

INSERT INTO Countries (name, code) VALUES ('Китай', 91);

INSERT INTO Countries (name, code) VALUES ('Бельгия', 056);

INSERT INTO Countries (name, code) VALUES ('Канада', 124);

INSERT INTO Countries (name, code) VALUES ('Доминикана', 212);