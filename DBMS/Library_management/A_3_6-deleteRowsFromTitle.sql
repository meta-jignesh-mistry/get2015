--Delete those rows of Titles table belonging to Publisher with publisher_id = 501


USE Library;
DELETE FROM Title WHERE publisherId=501;
select* from Title;
