--to Change value of addressLine2 column of Members(Users) table with “Jaipur” and 
--to Change value of addressLine1 column of Members(Users)  table with value “EPIP, Sitapura” for the members belonging to category “F”.



USE Library;
UPDATE Users SET addressLine2 = 'Jaipur';
select* from Users;
UPDATE Users set addressLine1 = 'EPIP, Sitapura' where gender ='f';
select* from Users;
