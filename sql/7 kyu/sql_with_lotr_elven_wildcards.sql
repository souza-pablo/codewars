-- kata/5ad90fb688a0b74111000055
select initcap(concat_ws(' ', firstname, lastname)) as shortlist
from elves
where firstname like '%tegil%'
   or lastname
  like
      '%astar%'