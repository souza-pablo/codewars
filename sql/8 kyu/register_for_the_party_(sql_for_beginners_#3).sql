-- kata/590cc86f7557c0494000007e
insert into participants
values ('Pablo', 21, true)
select *
from participants
where age >= 21
  and attending = true