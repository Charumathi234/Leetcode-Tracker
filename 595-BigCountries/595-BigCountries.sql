-- Last updated: 7/9/2026, 3:07:13 PM
# Write your MySQL query statement below
SELECT name, population, area
FROM World
WHERE area >= 3000000
OR population >= 25000000;