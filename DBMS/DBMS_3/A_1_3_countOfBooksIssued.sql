-- Query To open library database
use LibraryInformationSystem;
-- count of books issued

select Count(memberId) as Total_books_issued from Books_Issue;