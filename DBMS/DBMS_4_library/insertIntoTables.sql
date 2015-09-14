USE LibraryInfoSystem;

-- queries to insert data in all tables of library 

INSERT INTO Member VALUES ( 1001, 'Kamlesh','sector-8','sector-10','s'),
                        ( 1002, 'heena','malviyanager','sitapura','f'),
                       ( 1003, 'vikas','jagatpura','mansroavar','o'),
                        ( 1004, 'nick_mistry','india gate','goner','s'),
                          ( 1005, 'Keshav Sharma','jagatpura','mansroavar','f');
						
INSERT INTO Publishers VALUES (501,'Tata'),
                               (502,'New world'),
							   (503,'big rock');

INSERT INTO Subjects VALUES (51,'arts'),
                             (52,'science'),
							 (53,'agriculture');
							   
INSERT INTO Title VALUES (201,'love of Arts', 51,501),
                         (202,'science world', 52,501),
						 (203,'agriculture for you', 53,502);
						
INSERT INTO Books VALUES (101,201, '2013-01-01',600,'available'),
                           (102,202, '2014-01-01',700,'available'),
						   (103,203, '2015-01-01',400,'available');					


INSERT INTO Books_Issue (accessionNo,memberId,issueDate,dueDate) VALUES (101,1001,'2015-02-11','2015-02-26'),
                                                     ( 102,1001,'2014-11-11','2014-11-26'),
                                                     ( 103,1004,'2015-08-01','2015-08-16'),
                                                     ( 101,1002,'2015-03-11','2015-03-26'),
							                                       ( 101,1003,'2015-03-15','2015-03-30');
							
INSERT INTO Books_Return VALUES ('2015-02-25',101,1001,'2015-02-11'),
                                  ('2015-03-05',102,1001,'2014-11-11'),
								  ('2015-04-01',101,1003,'2015-03-15');
							
INSERT INTO Authors VALUES (1, 'jignesh'),
                           (2, 'manu'),
                           (3,'Neet'),
                           (4, 'dheeraj');

INSERT INTO Title_Author VALUES (201,1),
                                 (202,1),
								                 (201,3);























