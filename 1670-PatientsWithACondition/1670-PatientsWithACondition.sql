-- Last updated: 7/9/2026, 3:06:25 PM
SELECT *
FROM Patients
WHERE conditions LIKE 'DIAB1%'
   OR conditions LIKE '% DIAB1%';
