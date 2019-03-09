1. Creating tables and inserting data 
```
CREATE TABLE dudes (
  id INTEGER PRIMARY KEY,
  kg REAL);

CREATE TABLE friends (
  id INTEGER PRIMARY KEY,
  name TEXT,
  age INTEGER DEFAULT 30,
  weight REAL)
  FOREIGN KEY weight REFERENCES dudes(kg);

INSERT INTO friends (name, age) VALUES ("Rinat", 36);
```
2. Querying data
```
/* Which of your vegetables should you eat? */
SELECT * FROM veggies;

/* Just show the names and seasons, we don't need to see ids */
SELECT name, season FROM veggies;

/* What are the expensive fruits? */
SELECT * FROM fruits WHERE price > 5;

/* What are the cheap fruits in the summer? */
SELECT * FROM fruits WHERE price < 4 AND season = "summer";

/* What fruits can I get in fall or winter? */
SELECT * FROM fruits WHERE season = "summer" OR season = "winter";

/* Which shoes will make me taller? */
SELECT * FROM shoes WHERE type IN ("heel", "wedge");
/* This is equivalent to:
SELECT * FROM shoes WHERE type = "heel" OR type = "wedge";
*/

/* Which shoes *won't* make me taller? */
SELECT * FROM shoes WHERE type NOT IN ("heel", "wedge");

/* Sort by their height in meters */
SELECT * FROM skyscrapers ORDER BY height_meters;

/* Reverse that sort (highest to lowest) */
SELECT * FROM skyscrapers ORDER BY height_meters DESC;

/* Sort by their floors, lowest to highest */
SELECT * FROM skyscrapers ORDER BY floors ASC;

SELECT name, CASE 
    WHEN appeared < 540 AND appeared >= 245 THEN "Paleozoic"
    WHEN appeared < 245 AND appeared >= 65 THEN "Mesozoic"
    WHEN appeared < 65 THEN "Cenozoic"
    END "era"
    FROM species
    ORDER BY era;
    
/* Which ones have floral patterns? */
SELECT  * FROM dresses WHERE description LIKE "%floral%";

/* Which ones are blue? */
SELECT  * FROM dresses WHERE description LIKE "%blue%";

/* But let's just show the top 3! */
SELECT * FROM top_programs ORDER BY votes DESC LIMIT 3;

SELECT LOWER(name) AS name,
    ROUND(weight) AS rounded_weight,
    LOWER(TRIM(important_functions, ".")) AS desc
    FROM organs WHERE weight > 1;
```
3. Aggregating data
```
/* What's the most expensive price for a painting? */
SELECT MAX(price) as most_dollars_paid
    FROM paintings;

/* What's the average year these were painted? */
SELECT AVG(year) 
    FROM paintings;

/* How much money was paid for these paintings total? */
SELECT SUM(price) AS total_dollars_paid
    FROM paintings;

/* How many cost more than 2 million? */
SELECT COUNT(*) AS greater_than_2mil
    FROM paintings WHERE price > 200000000;

/* How many unique years are there? */
SELECT COUNT(DISTINCT year) AS years_represented
    FROM paintings;

/* Which countries had more than 1 person win? */
SELECT country, COUNT(*) as num_won FROM nobel_prizes
    GROUP BY country 
    HAVING num_won > 1;
```
4. Joining related tables
```
/* Show students next to their teachers */
SELECT students.name, teachers.name AS teacher_name
    FROM students
    JOIN teachers
    ON students.teacher_id = teachers.id;
  
/* Show students next to their teachers,
   even if they don't have a teacher assigned
*/ 
SELECT students.name, teachers.name AS teacher_name
    FROM students
    LEFT OUTER JOIN teachers
    ON students.teacher_id = teachers.id;
```
5. Updating and deleting data
```
/* It's sale time for Halloween merchandise! */
UPDATE inventory SET price = 20.00 WHERE id = 4;
SELECT * FROM inventory;

/* Woo, it got sold! */
DELETE FROM inventory WHERE id = 4;
SELECT * FROM inventory;

/* I decide later I care about the language spoken,
 so that I can practice languages I already know. */
ALTER TABLE travel_spots ADD COLUMN language TEXT;

/* I've decided that I'm not just picking a place to travel to,
  I'm picking a new place to live. */
ALTER TABLE travel_spots RENAME TO places_to_live;
```
