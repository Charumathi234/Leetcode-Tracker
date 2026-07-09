-- Last updated: 7/9/2026, 3:09:44 PM
# Write your MySQL query statement below
SELECT
    MAX(salary) AS SecondHighestSalary
FROM Employee
WHERE salary < (
    SELECT MAX(salary)
    FROM Employee
);