-- Query To open library database
use LibraryInformationSystem;

-- to show count of total number of students,faculty and others in single row

select (select count(*) from Member where category='student') as Student_count ,
(select count(*) from Member where category='faculty') as Faculty_count , 
(select count(*) from Member where category='other') as Other_count; 
