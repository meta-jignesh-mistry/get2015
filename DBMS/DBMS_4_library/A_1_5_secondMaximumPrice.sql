
-- query to display the second maximum price of a book


SELECT accessionNo,MAX(price) as Second_Max_price,status FROM Books
WHERE price NOT IN (SELECT MAX(price) FROM Books );

