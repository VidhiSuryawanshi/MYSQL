-- SELECT E.employee_id 
-- FROM  Employees E
-- LEFT JOIN Salaries S
-- ON E.employee_id = S.employee_id 
-- WHERE S.employee_id IS NULL
-- UNION  
-- SELECT S.employee_id 
-- FROM  Employees E
-- RIGHT JOIN Salaries S
-- ON E.employee_id = S.employee_id
-- WHERE E.employee_id IS NULL

-- ORDER BY  employee_id ASC;

SELECT employee_id 
FROM Employees 
LEFT JOIN Salaries 
USING(employee_id)
WHERE salary IS NULL
UNION 
SELECT employee_id 
FROM Salaries
LEFT JOIN Employees 
USING(employee_id)
WHERE name IS NULL

ORDER BY employee_id ASC;
