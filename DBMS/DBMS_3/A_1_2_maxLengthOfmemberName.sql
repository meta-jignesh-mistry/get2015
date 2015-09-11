-- Query To open library database
use LibraryInformationSystem;

-- to show maximum length of user name
select memberName,Length(memberName) as Length_of_Member_name from Member 
Where Length(memberName)=(SELECT MAX(Length(memberName)) from Member);



