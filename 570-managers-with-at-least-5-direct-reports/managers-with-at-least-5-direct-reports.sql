# Write your MySQL query statement below
select name from employee where id in(select managerid from employee group by (managerId) having count(*)>=5)