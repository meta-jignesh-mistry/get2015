-- query to create a View which can be used to display member name and all issue details of the member 

CREATE VIEW IssuePerMember 
AS
SELECT M.memberName,BI.issueDate 
FROM Member M,  Books_Issue BI 
WHERE M.memberId=BI.memberId;


-- query to show view IssuePerMember

SELECT * FROM IssuePerMember ;



