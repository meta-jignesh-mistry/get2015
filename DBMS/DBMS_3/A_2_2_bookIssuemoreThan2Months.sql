-- Query To open library database
use LibraryInformationSystem;

--  to show books issue for more than 2 months

select accessionNo,memberId
from Books_Issue
where period_diff(date_format(dueDate, '%Y%m'), date_format(issueDate, '%Y%m'))>2 ; 




