# Write your MySQL query statement below
UPDATE salary 
SET sex = CASE sex
when 'm' then 'f'
else 'm'
END;