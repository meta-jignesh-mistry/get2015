
-- query to create a view  a View which contains the information – subject name,
-- title, member name, category, issue date, due date and return
-- date. If the books have not been returned, NULL should be
-- displayed instead of return date


CREATE VIEW returnDateInfo
AS
SELECT  M.memberName,T.titleName,S.subjectName,BI.issueDate,BI.accessionNo,BI.memberId,BI.dueDate,ifnull(br.returnDate,NULL) 
AS Return_date 
FROM Books_Issue BI 
LEFT OUTER JOIN Books_Return br 
ON BI.accessionNo=br.accessionNo
AND 
BI.memberId=br.memberId
JOIN
Member M
ON
BI.memberId=M.memberId
JOIN
Books B
ON
B.accessionNo=BI.accessionNo
JOIN
Title T
ON
B.titleId=T.TitleId
JOIN
Subjects S
ON
T.subjectId=S.subjectId;


-- query to show view of returnDateInfo

SELECT * FROM returnDateInfo;







