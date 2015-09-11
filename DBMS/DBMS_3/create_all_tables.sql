
-- query to use database
USE LibraryInformationSystem;



-- creation of tables

CREATE TABLE Member(
memberId INT not NULL,
memberName VARCHAR(100),
addressLine1 VARCHAR(100),
addressLine2 VARCHAR(100),
gender char(1),
category varchar(20),
PRIMARY KEY(memberId)
);

CREATE TABLE Publishers(
publisherId INT not NULL,
publisherName VARCHAR(100),
PRIMARY KEY(publisherId)
);

CREATE TABLE Subjects(
subjectId INT not NULL,
subjectName VARCHAR(100),
PRIMARY KEY(subjectId)
);

CREATE TABLE Title(
titleId INT,
titleName VARCHAR(100),
subjectId INT,
publisherID INT,
FOREIGN KEY(publisherID) REFERENCES Publishers(publisherID)  ON UPDATE CASCADE ON DELETE CASCADE,

FOREIGN KEY(subjectId) REFERENCES Subjects(subjectId) ON DELETE CASCADE,
PRIMARY KEY(titleId)
);

CREATE TABLE Books(
accessionNo INT not null,
titleId INT,
purchaseDate DATE,
price INT,
status VARCHAR(100),
FOREIGN KEY(titleId) REFERENCES Title(titleId) ON DELETE CASCADE,
PRIMARY KEY(accessionNo)
);

CREATE TABLE Books_Issue(
issueDate DATE not NULL,
accessionNo INT not NULL,
memberId INT not null,
dueDate DATE,
FOREIGN KEY(memberId) REFERENCES Member(memberId) ON DELETE CASCADE ,
FOREIGN KEY(accessionNo) REFERENCES Books(accessionNo) ON DELETE CASCADE,
PRIMARY KEY(issueDate,accessionNo,memberId)
);

CREATE TABLE Books_Return(
returnDate DATE not NULL,
accessionNo INT not NULL,
memberId INT not NULL,
issueDate DATE,
FOREIGN KEY(memberId) REFERENCES Member(memberId) ON DELETE CASCADE,
FOREIGN KEY(accessionNo) REFERENCES Books(accessionNo) ON DELETE CASCADE,
PRIMARY KEY(returnDate,accessionNo,memberId)
);

CREATE TABLE Authors(
authorId INT not NULL,
authorName VARCHAR(100),
PRIMARY KEY(authorId)
);

CREATE TABLE Title_Author(
titleId INT not NULL,
authorId INT not NULL,
FOREIGN KEY(titleId) REFERENCES Title(titleId) ON DELETE CASCADE,
FOREIGN KEY(authorId) REFERENCES Authors(authorId) ON DELETE CASCADE,
PRIMARY KEY(titleId,authorId)

);
