-- kata/580918e24a85b05ad000010c
select people.*, count(people_id) as toy_count
from people
       join toys on people.id = people_id
group by people.id, people_id