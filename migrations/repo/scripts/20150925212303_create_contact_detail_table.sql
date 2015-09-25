-- // create contact detail table
-- Migration SQL that makes the change goes here.
CREATE TABLE CONTACT_TEL_DETAIL
(
  ID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  CONTACT_ID INT NOT NULL,
  TEL_TYPE VARCHAR(20) NOT NULL,
  TEL_NUMBER VARCHAR(20) NOT NULL,
  FOREIGN KEY (CONTACT_ID) REFERENCES CONTACT (ID)
);




-- //@UNDO
-- SQL to undo the change goes here.


