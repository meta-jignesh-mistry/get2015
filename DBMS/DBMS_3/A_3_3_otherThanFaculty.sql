-- Query To open library database
use LibraryInformationSystem;

-- book issued other than faculty

select BI.memberId , BI.accessionNo as Book_AccessionNo,M.memberName from Books_Issue BI ,Member M 
where BI.memberId=M.memberId and M.category not in('faculty');
