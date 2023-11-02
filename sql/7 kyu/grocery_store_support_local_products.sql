-- kata/5a8ed96bfd8c066e7f00011a
select count(country) as products, country
from products
where country in ('United States of America', 'Canada')
group by country
order by products desc