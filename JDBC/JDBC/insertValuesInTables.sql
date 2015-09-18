-- Query to use library database
USE LibraryInfoSystem;
-- Query to insert data into Members table
INSERT INTO Member VALUES ( 1001, 'jignesh','sector-8','sector-10','m','Faculty'),
                        ( 1002, 'nick','malviyanager','sitapura','f','Other'),
                       ( 1003, 'keshav sharma','jagatpura','mansroavar','m','Student'),
                        ( 1004, 'rahul','india gate','goner','m','Faculty'),
                        ( 1005, 'heena','india gate','goner','f','Student'),
                        ( 1006, 'neetu','india gate','goner','f','Student');
                    
-- Query to insert data into Publishers table                    
INSERT INTO Publishers VALUES (501,'Tata'),
                               (502,'New world'),
                                (503,'big rock');

-- Query to insert data into Subjects table
INSERT INTO Subjects VALUES (51,'arts'),
                             (52,'science'),
                                (53,'agriculture');

-- Query to insert data into Title table
INSERT INTO Title VALUES (201,'love of Arts', 51,501),
                         (202,'science world', 51,501),
                        (203,'agriculture for you', 52,502),
                         (204,'agriculture for you', 52,502);
      

-- Query to insert data into Books table
INSERT INTO Books VALUES (101,201, '2013-01-01',500,'available'),
                           (102,202, '2014-01-01',600,'available'),
						             (103,201, '2015-01-01',700,'available'),
                            (104,204, '2015-01-01',700,'available');	
     INSERT INTO Books VALUES (105,201, '2013-01-01',500,'available');
     INSERT INTO Books VALUES (106,201, '2013-01-01',500,'available');
    




-- Query to insert data into Authors table
INSERT INTO Authors VALUES ( 1, 'Rahim'),
                           ( 2, 'Kavya'),
                           ( 3, 'Lakshit');
INSERT INTO Authors VALUES ( 4, 'Jatin');
                           

-- Query to insert data into Title_Author table
INSERT INTO Title_Author VALUES (201,1),
                                 (202,1),
								                 (201,3);
INSERT INTO Title_Author VALUES (201,4);
INSERT INTO Title_Author VALUES (203,4);


-- Query to insert data into Books_Return table
INSERT INTO Books_Return VALUES ('2015-09-13',101,1001,'2015-09-13'),
                                  ('2015-09-13',102,1001,'2015-09-13'),
								   ('2015-09-11',101,1001,'2015-08-30'),
								   ('2015-09-05',102,1001,'2015-08-15'),
								   ('2015-09-01',101,1001,'2015-08-15');
                                   

-- Query to insert data into Books_Issue table
INSERT INTO Books_Issue VALUES ('2015-09-13',101,1001,'2015-09-28'),
                               ('2015-09-13',102,1001,'2015-09-28'),
							   ('2015-09-13',101,1003,'2015-09-28');
INSERT INTO Books_Issue VALUES ('2015-08-30',101,1001,'2015-09-14'),
                               ('2015-09-01',102,1001,'2015-09-16'),
							   ('2015-08-15',102,1001,'2015-08-30'),
								('2015-08-15',101,1001,'2015-08-30');
                                
INSERT INTO Books_Issue VALUES ('2014-08-30',106,1001,'2015-09-14');






















