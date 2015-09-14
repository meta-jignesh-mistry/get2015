
-- query to display information of those books whose price is equal to the most expensive book purchase so far

SELECT * FROM Books WHERE price=(SELECT MAX(price) FROM Books );