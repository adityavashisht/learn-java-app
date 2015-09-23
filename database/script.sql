CREATE TABLE CONTACT (
    ID INT NOT NULL AUTO_INCREMENT
  , FIRST_NAME VARCHAR(60) NOT NULL
  , LAST_NAME VARCHAR(40) NOT NULL
  , BIRTH_DATE DATE
  , UNIQUE UQ_CONTACT_1 (FIRST_NAME, LAST_NAME)
  , PRIMARY KEY (ID)
)

insert into contact (first_name, last_name, birth_date) values ('Clarence', 'Ho',􀀁
                                                                '1980-07-30');