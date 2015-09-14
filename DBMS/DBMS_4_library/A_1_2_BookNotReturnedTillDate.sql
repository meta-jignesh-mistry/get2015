
-- query to display information on the books that have not been returned till date

USE  LibraryInfoSystem;
SELECT M.memberId,M.memberName,B.accessionNo,T.titleId,T.titleName,BI.issueDate,BI.dueDate 
FROM Member M,Books B,Title T,Books_Issue BI
WHERE M.memberId=BI.memberId AND B.accessionNo=BI.accessionNo AND T.titleId=B.titleId AND
((NOT EXISTS(SELECT* FROM Books_Return BR WHERE BR.accessionNo=B.accessionNo
 AND BI.memberId=BR.memberId AND DATEDIFF(BI.issueDate,BR.issueDate)=0  ))
 OR 
 (DATEDIFF((SELECT BR.returnDate FROM Books_Return BR WHERE BR.accessionNo=B.accessionNo
 AND BI.memberId=BR.memberId AND DATEDIFF(BI.issueDate,BR.issueDate)=0),CURRENT_DATE)>0))
ORDER BY BI.issueDate;

