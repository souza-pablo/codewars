-- kata/594633020a561e329a0000a2
select race, count(race) as count
from demographics
group by race
order by count desc