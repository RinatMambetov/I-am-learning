/* What does the app's SQL look like? */
-- Skills from the RPG games

CREATE TABLE skills (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    skill_type TEXT,
    skill_value INTEGER);
    
INSERT INTO skills (skill_type, skill_value) VALUES ("stealth", 7);
INSERT INTO skills (skill_type, skill_value) VALUES ("survival", 3);
INSERT INTO skills (skill_type, skill_value) VALUES ("talking", 5);
INSERT INTO skills (skill_type, skill_value) VALUES ("perception", 8);
INSERT INTO skills (skill_type, skill_value) VALUES ("acrobatics", 9);
INSERT INTO skills (skill_type, skill_value) VALUES ("desease", 9);

SELECT * FROM skills;

UPDATE skills SET skill_value = 10 WHERE id = 2;

SELECT * FROM skills;

DELETE FROM skills WHERE id = 6;

SELECT * FROM skills;
