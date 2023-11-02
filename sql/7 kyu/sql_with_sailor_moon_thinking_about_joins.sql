-- kata/5ab7a736edbcfc8e62000007

select senshi_name as sailor_senshi, real_name_jpn as real_name, name as cat, school
from sailorsenshi
         inner join cats on sailorsenshi.cat_id = cats.id
         inner join schools on sailorsenshi.school_id = schools.id