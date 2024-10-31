CREATE TABLE user_page(
id bigserial UNIQUE ,
username varchar(20) ,
    --tweet varchar(250),
CONSTRAINT id_pk PRIMARY KEY (id)
);

INSERT INTO user_page(username,tweet)
VALUES ('Sajad','Hello World');

INSERT INTO user_page(username,tweet)
VALUES ('Amir','Peace for World');


DROP TABLE user_page;

ALTER TABLE user_page
    ADD age varchar(25);
INSERT INTO user_page(password)
VALUES ('sajad123');

UPDATE user_page
SET password ='sajad123'
WHERE id=1;

DELETE FROM user_page
WHERE id=4 ;

UPDATE user_page
SET password ='reza123'
WHERE id=2;

UPDATE user_page
SET password ='amir123'
WHERE id=3;

SELECT * FROM user_page
ORDER BY


DROP TABLE user_page;

ALTER TABLE user_page
    ADD age varchar(25);
INSERT INTO user_page(password)
VALUES ('sajad123');

UPDATE user_page
SET age =20
WHERE id=1;

DELETE FROM user_page
WHERE id=5 ;

UPDATE user_page
SET age =34
WHERE id=2;

UPDATE user_page
SET age =19
WHERE id=1;

UPDATE user_page
SET age =19
WHERE id=3;

SELECT * FROM user_page
ORDER BY age DESC;


ALTER TABLE user_page
    ADD CONSTRAINT username_un UNIQUE (username);

ALTER TABLE user_page
    ADD age int ;

SELECT * FROM user_page;





