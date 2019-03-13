/* Create table about the people and what they do here */
CREATE TABLE presidents (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT);
    
INSERT INTO presidents (name) VALUES ("Hoover");
INSERT INTO presidents (name) VALUES ("FDR");
INSERT INTO presidents (name) VALUES ("Truman");
INSERT INTO presidents (name) VALUES ("Eisenhower");
INSERT INTO presidents (name) VALUES ("Kennedy");
INSERT INTO presidents (name) VALUES ("Johnson");
INSERT INTO presidents (name) VALUES ("Nixon");
INSERT INTO presidents (name) VALUES ("Ford");
INSERT INTO presidents (name) VALUES ("Carter");
INSERT INTO presidents (name) VALUES ("Reagan");
INSERT INTO presidents (name) VALUES ("Bush");
INSERT INTO presidents (name) VALUES ("Clinton");
INSERT INTO presidents (name) VALUES ("G.W.Bush");
INSERT INTO presidents (name) VALUES ("Obama");
INSERT INTO presidents (name) VALUES ("Trump");

CREATE TABLE office_control (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    presidents_id INTEGER,
    office TEXT);
    
INSERT INTO office_control (presidents_id, office) VALUES (1, "Republican");
INSERT INTO office_control (presidents_id, office) VALUES (2, "Democrat");
INSERT INTO office_control (presidents_id, office) VALUES (3, "Democrat");
INSERT INTO office_control (presidents_id, office) VALUES (4, "Republican");
INSERT INTO office_control (presidents_id, office) VALUES (5, "Democrat");
INSERT INTO office_control (presidents_id, office) VALUES (6, "Democrat");
INSERT INTO office_control (presidents_id, office) VALUES (7, "Republican");
INSERT INTO office_control (presidents_id, office) VALUES (8, "Republican");
INSERT INTO office_control (presidents_id, office) VALUES (9, "Democrat");
INSERT INTO office_control (presidents_id, office) VALUES (10, "Republican");
INSERT INTO office_control (presidents_id, office) VALUES (11, "Republican");
INSERT INTO office_control (presidents_id, office) VALUES (12, "Democrat");
INSERT INTO office_control (presidents_id, office) VALUES (13, "Republican");
INSERT INTO office_control (presidents_id, office) VALUES (14, "Democrat");
INSERT INTO office_control (presidents_id, office) VALUES (15, "Republican");

SELECT name, office
    FROM presidents
    JOIN office_control
        ON office_control.presidents_id = presidents.id;
