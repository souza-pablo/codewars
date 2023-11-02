-- kata/595a3ba3843b0cbf8e000004
select (case
            when (number1 + number2) % 2 = 0 then max(number1 + number2)
    end)                                                                       as number1,
       (case when (number1 + number2) % 2 = 1 then min(number1 + number2) end) as number2
from numbers