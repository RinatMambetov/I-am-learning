CREATE TABLE laptops 
    (id INTEGER PRIMARY KEY AUTOINCREMENT, 
    model TEXT, 
    memory INTEGER, 
    storage INTEGER, 
    price INTEGER);

INSERT INTO laptops (model, memory, storage, price) VALUES ("Lenovo ThinkPad X1", 8, 256, 1749);
INSERT INTO laptops (model, memory, storage, price) VALUES ("HP EliteBook 840", 32, 1024, 2599);
INSERT INTO laptops (model, memory, storage, price) VALUES ("Lenovo ThinkPad T480S", 8, 512, 1259);
INSERT INTO laptops (model, memory, storage, price) VALUES ("Dell Latitude 7490", 8, 256, 1709);
INSERT INTO laptops (model, memory, storage, price) VALUES ("Dell Latitude 7390", 8, 256, 1688);
INSERT INTO laptops (model, memory, storage, price) VALUES ("Lenovo ThinkPad T480", 8, 512, 1400);
INSERT INTO laptops (model, memory, storage, price) VALUES ("Acer TravelMate", 8, 256, 1500);
INSERT INTO laptops (model, memory, storage, price) VALUES ("Lenovo ThinkPad A485", 8, 256, 1369);
INSERT INTO laptops (model, memory, storage, price) VALUES ("HP EliteBook 745", 8, 256, 1399);
INSERT INTO laptops (model, memory, storage, price) VALUES ("Lenovo ThinkPad T580", 8, 512, 1399);
INSERT INTO laptops (model, memory, storage, price) VALUES ("Lenovo ThinkPad E480", 4, 128, 599);
INSERT INTO laptops (model, memory, storage, price) VALUES ("Lenovo ThinkPad E580", 8, 128, 669);
INSERT INTO laptops (model, memory, storage, price) VALUES ("Dell Latitude 5590", 8, 128, 1100);
INSERT INTO laptops (model, memory, storage, price) VALUES ("HP ProBook 430", 16, 512, 829);
INSERT INTO laptops (model, memory, storage, price) VALUES ("Dell Latitude 3490", 8, 256, 830);

SELECT * FROM laptops ORDER BY price DESC;
SELECT memory, COUNT(*) AS amount FROM laptops 
    GROUP BY memory
    HAVING memory > 4;
    
