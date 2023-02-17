# Write your MySQL query statement below
SELECT customers.name as 'Customers' from Customers
where Customers.id not in (
    select customerid from orders
);