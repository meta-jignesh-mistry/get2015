
-- query to use database

USE LibraryInfoSystem;

-- to display name of those members who belong to the category as to which member “Keshav Sharma” belongs

SELECT * FROM Member WHERE category=(SELECT category FROM Member WHERE memberName='Keshav Sharma');