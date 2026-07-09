-- Last updated: 7/9/2026, 3:06:21 PM
# Write your MySQL query statement below
SELECT tweet_id
FROM Tweets
WHERE LENGTH(content) > 15;