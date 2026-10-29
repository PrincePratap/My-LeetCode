# Write your MySQL query statement below
select p1.firstName, p1.lastName, ad.city, ad.state
from Person as p1
left join Address as Ad  
on p1.personID = ad.personID

