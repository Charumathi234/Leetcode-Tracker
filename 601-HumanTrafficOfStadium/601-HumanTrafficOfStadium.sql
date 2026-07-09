-- Last updated: 7/9/2026, 3:07:12 PM
# Write your MySQL query statement below
SELECT DISTINCT s1.*
FROM Stadium s1,
     Stadium s2,
     Stadium s3
WHERE s1.people >= 100
  AND s2.people >= 100
  AND s3.people >= 100
  AND (
      (s1.id = s2.id - 1 AND s2.id = s3.id - 1)
      OR
      (s1.id = s2.id + 1 AND s1.id = s3.id - 1)
      OR
      (s1.id = s2.id + 1 AND s2.id = s3.id + 1)
  )
ORDER BY visit_date;
