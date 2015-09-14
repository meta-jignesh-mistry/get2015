
-- query to create a View which contains three columns, member name, member id and 
-- full description of category, i.e., Faculty, Students
-- and Others instead of F,S and O

CREATE VIEW memberCategoryDetail
AS
(SELECT memberId,memberName,CASE WHEN Category='f' THEN 'Faculty ' WHEN Category='s' THEN 'Student'
ELSE 'Other'
END as Category_Description  FROM Member);


-- query to show view memberCategoryDetails


SELECT * FROM  memberCategoryDetail; 










