-- 11. 3 Queries (DISTINCT)
SELECT * FROM table_name WHERE column_name = 'Johnson';

SELECT * FROM table_name WHERE column_name LIKE '%it%';

-- 18. 2 FULL OUTER JOIN
SELECT table_name1.column_name, table_name2.column_name
FROM table_name1
CROSS JOIN table_name2
WHERE table_name1.column_name = table_name2.column_name;

SELECT table_name1.column_name, table_name2.column_name
FROM table_name1
FULL OUTER JOIN table_name2 
ON table_name1.column_name = table_name2.column_name;

-- 19. 2 UNIONS
SELECT column_name(s) FROM table1
UNION
SELECT column_name(s) FROM table2;

-- 20. 3 VIEWS
CREATE VIEW view_name AS SELECT column(s) FROM table_name;

-- 21. 3 Stored Procedures
DELIMITER $$
CREATE PROCEDURE storedProceduresName()
BEGIN
SELECT *
FROM table_name;
END $$

-- 22. 3 Triggers
DELIMITER $$
CREATE TRIGGER deleting_product
AFTER DELETE
ON product FOR EACH ROW
BEGIN
INSERT INTO deleted_products
VALUES(OLD.P_CODE, OLD.P_DESCRIPTION,"Deleted");
END $$