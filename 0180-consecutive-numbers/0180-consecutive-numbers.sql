# Write your MySQL query statement below
Select distinct l1.num as ConsecutiveNums
from Logs l1
JOIN Logs l2 ON l1.id = l2.id - 1
JOIN Logs l3 ON l1.id = l3.id - 2
where l1.num = l2.num AND l2.num = l3.num;