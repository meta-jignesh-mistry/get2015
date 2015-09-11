USE LibraryInformationSystem;
-- Query to find all the columns of table Users
SELECT* FROM Member;

-- Query to find the member id,member name,gender of table Member
SELECT memberName,memberId,gender FROM Member;

-- Query to find the member id,member name,gender of table Member whose category = 'f'
SELECT memberName,memberId,gender FROM Member WHERE category='faculty';

-- Query to find distinct catogory of table Member
SELECT DISTINCT category FROM Member;

-- Query to find the member id,member name of table Member order by descending order of  memberName
SELECT memberName,gender FROM  Member ORDER BY memberName DESC;

-- Query to find the title name,publisher name, subject id of table
SELECT titleName,P.publisherName, subjectId FROM Title T , Publishers P WHERE T.publisherId=P.publisherId;

-- Query to find the count of members of category
SELECT category,COUNT(*) From Member GROUP BY category;

-- Query to find name of Member belongs to category to which nick belongs
SELECT M1.memberName FROM Member AS M1 JOIN Member AS M2 ON M1.category = M2.category WHERE M2.memberName ="nick_mistry";

-- Query to Display the status of return book and if not returned then place blank	

SELECT  BI.issueDate,BI.accessionNo,BI.memberId,ifnull(br.returnDate,"") AS Return_date 
FROM Books_Issue BI LEFT OUTER JOIN Books_Return br ON BI.accessionNo=br.accessionNo AND BI.memberId=br.memberId;




-- Assignment 2
-- Query to  display results in ascending order of issue date and within issue date in ascending order of memberName.

SELECT  M.memberName,BI.issueDate,BI.accessionNo,BI.memberId,ifnull(br.returnDate,"") AS Return_date 
FROM Books_Issue BI LEFT OUTER JOIN Books_Return br ON BI.accessionNo=br.accessionNo AND BI.memberId=br.memberId ,Member M
WHERE M.memberId=BI.memberId
ORDER BY BI.issueDate,M.memberName ASC;

