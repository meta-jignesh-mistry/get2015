

USE LibraryInformationSystem;

-- query to alter issue date column to set current date as default 

ALTER TABLE `Books_issue` MODIFY COLUMN `issueDate` TIMESTAMP NOT NULL DEFAULT NOW();
DELIMITER ;;

-- query to use trigger and update due date to current date +15 days

CREATE TRIGGER book_due_date BEFORE INSERT ON Books_Issue FOR EACH ROW
BEGIN
  SET NEW.dueDate = DATE_ADD(NOW(), INTERVAL 15 DAY);
END;;
DELIMITER ;


