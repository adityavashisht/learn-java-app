-- // create contact table
-- Migration SQL that makes the change goes here.
CREATE TABLE CONTACT
(
  ID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  FIRST_NAME VARCHAR(60) NOT NULL,
  LAST_NAME VARCHAR(40) NOT NULL,
  BIRTH_DATE DATE
);




-- //@UNDO
-- SQL to undo the change goes here.

drop table CONTACT;
