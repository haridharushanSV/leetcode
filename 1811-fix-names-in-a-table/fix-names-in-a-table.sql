# Write your MySQL query statement below
select user_id, concat(UPPER(LEFT(name, 1)),Lower(Substring(name,2))) as name from users order by user_id