# Write your MySQL query statement below
Delete P1 
From Person P1
join Person p2
on p1.email = p2.email
where p1.id > p2.id;