USE Library;
CREATE TABLE Users(
userId INT not NULL,
userName VARCHAR(100),
addressLine1 VARCHAR(100),
addressLine2 VARCHAR(100),
gender char(1),
PRIMARY KEY(userId)
);

INSERT INTO Users VALUES ( 1001, 'Kamlesh','sector-8','sector-10','m'),
                        ( 1002, 'heena','malviyanager','sitapura','f'),
                       ( 1003, 'vikas','jagatpura','mansroavar','m'),
                        ( 1004, 'nick','india gate','goner','f');