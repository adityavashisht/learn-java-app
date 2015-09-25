-- // Create Changelog

-- Default DDL for changelog table that will keep
-- a record of the migrations that have been run.

-- You can modify this to suit your database before
-- running your first migration.

-- Be sure that ID and DESCRIPTION fields exist in
-- BigInteger and String compatible fields respectively.




CREATE TABLE CHANGELOG
(
  ID BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  APPLIED_AT VARCHAR(60) NOT NULL,
  DESCRIPTION VARCHAR(255) NOT NULL

);




-- //@UNDO

DROP TABLE CHANGELOG;
