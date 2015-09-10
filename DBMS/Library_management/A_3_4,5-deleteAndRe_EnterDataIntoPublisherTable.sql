Use Library;
DELETE FROM Publishers;
SET @name = 'Tata Mc Hill';
SET @Id = 502;
INSERT INTO Publishers(publisherId, publisherName) VALUES(@Id, @name);

SET @name = 'N-series book';
SET @Id = 501;
INSERT INTO Publishers(publisherId,publisherName) VALUES(@Id,@name);

SET @name = 'Helbert series';
SET @Id = 503;
INSERT INTO Publishers(publisherId,publisherName) VALUES(@Id,@name);

SELECT * FROM Publishers;
