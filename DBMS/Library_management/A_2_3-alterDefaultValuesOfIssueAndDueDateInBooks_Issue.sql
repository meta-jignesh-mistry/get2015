--Alter definitions of LIS tables to provide the default constraints in issue date and due date


USE Library;
ALTER TABLE `Books_issue` MODIFY COLUMN `issueDate` TIMESTAMP NOT NULL DEFAULT NOW();
DELIMITER ;;
CREATE TRIGGER book_due_date BEFORE INSERT ON Books_Issue FOR EACH ROW
BEGIN
  SET NEW.dueDate = DATE_ADD(NOW(), INTERVAL 15 DAY);
END;;
DELIMITER ;
select* from Books_Issue;

