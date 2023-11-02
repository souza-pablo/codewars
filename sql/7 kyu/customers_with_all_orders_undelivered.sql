-- kata/64c4d0011141cb003eca9e18
select distinct customer_id
from orders
where customer_id not in (select distinct customer_id from orders where delivery_date is not null)
order by customer_id desc