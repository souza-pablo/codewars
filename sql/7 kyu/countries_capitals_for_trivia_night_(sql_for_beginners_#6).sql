-- kata/5e5f09dc0a17be0023920f6f
select capital
from countries
where continent in ('Africa', 'Afrika')
  and country like 'E%'
order by capital limit 3
