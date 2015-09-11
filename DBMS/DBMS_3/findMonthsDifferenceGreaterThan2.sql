
-- Query To open library database
use LibraryInformationSystem;

-- to display information of books issued for more than two months

select period_diff(date_format(curdate(), '%Y%m'), date_format(issueDate, '%Y%m')) as 
issue_for_months,BI.accessionNo, M.memberId,M.memberName,T.titleName,BI.issueDate,BI.dueDate 
from Books_Issue BI,Member M,Title T,Books B 
where period_diff(date_format(curdate(), '%Y%m'), date_format(issueDate, '%Y%m'))>=2 AND 
BI.memberId=M.memberId AND 
B.titleId=T.titleId AND 
B.accessionNo=BI.accessionNo
ORDER BY M.memberName,T.titleName;



