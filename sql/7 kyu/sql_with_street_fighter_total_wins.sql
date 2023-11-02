-- kata/5ac698cdd325ad18a3000170
select fighters.name     as name,
       sum(case
             when winning_moves.move not in ('Hadoken', 'Shouoken', 'Kikoken') then
               fighters.won
             else 0 end) as won,
       sum(case
             when winning_moves.move not in ('Hadoken', 'Shouoken', 'Kikoken') then
               fighters.lost
             else 0 end) as lost
from fighters
       join winning_moves on fighters.move_id = winning_moves.id
where winning_moves.move not in ('Hadoken', 'Shouoken', 'Kikoken')
group by fighters.name
order by won desc
limit 6