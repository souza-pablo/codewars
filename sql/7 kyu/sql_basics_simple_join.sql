-- kata/5802e32dd8c944e562000020
select products.*, companies.name as company_name
from products
       join companies on company_id = companies.id