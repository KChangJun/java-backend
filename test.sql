# 내용  
-- 띄어쓰기 해야함
# DDL(데이터 정의어)
# 데이터 베이스 혹은 테이블(뷰, 인덱스, 프로시저....)을 생성, 수정, 삭제 할 때
# 사용 하는 SQL문 데이터 자체를 건드리는게 아니라 정의를 내릴때 사용하는것. 테이블

# CREATE 문
# 데이터 베이스, 테이블 등을 생성할 때 사용하는 SQL문

# 데이터 베이스 생성
# CREATE DATABASE 데이터 베이스명;

CREATE DATABASE Hotel;

SHOW DATABASES;

# 데이터 베이스를 생성했으면 사용할 데이터 베이스를 선택
# USE 데이터베이스명;

USE Hotel;

# 테이블 생성
# CREATE TABLE 테이블 명 (
# 필드명 데이터 타입(데이터길이) 제약조건, 
# ...
# ); 

CREATE TABLE Custom(
	id INT PRIMARY KEY, 
    name VARCHAR(20) NOT NULL,
    email VARCHAR(30) UNIQUE,
    age INT,
	address TEXT,
    accept_marketing BOOLEAN DEFAULT false
);

SHOW TABLES;

# 데이터 베이스 수정
# ALTER DATABASE 데이터베이스명 속성명 = 값; 

# 테이블 수정
# ALTER TABLE 테이블명 

#테이블 필드 추가
# ALTER TABLE 테이블명 ADD 필드명 데이터타입(데이터길이) 제약조건,
# ALTER TABLE 테이블명 DROP 필드명;

# 테이블 필드 수정 
# ALTER TABLE 테이블명 MODIFY COLUMN 필드명 데이터타입(데이터길이) 제약조건,

# 데이터 베이스 삭제
# DROP DATABASE 데이터베이스명;

# 테이블 삭제
# DROP TABLE 테이블명;
# TRUNCATE TABLE 테이블명;
# DROP TABLE 테이블 명 : 테이블의 정의 자체를 제거
# TRUNCATE TABLE 테이블 명 : 정의는 그대로 남기고 초기화(생성 초기상태로 돌림)




ALTER TABLE Custom ADD phonenumber VARCHAR(20);
ALTER TABLE Custom DROP phonenumber;

INSERT INTO Custom(id, name) VALUES(1, "John Doe");
SELECT * FROM Custom;
INSERT INTO Custom(id, email) VALUES(5, "qwer@qwer"); -- 필수값 미입력
INSERT INTO Custom(id, name, email) VALUES(5, "HOEDDE", "qwer@qwer");

INSERT INTO Custom VALUES(3, "DFEGDF", "QWE@FW", 23, "efvdfeefefzzxcv",true);
INSERT INTO Custom VALUES(12, "DFEGDF", "Q22WE@FW", 23, "efvdfeefefzzxcv",false);

UPDATE Custom SET accept_marketing = true where id = 12; 
UPDATE Custom SET accept_marketing = true, age = 10; 
UPDATE Custom SET accept_marketing = false,age = 140 where id = 5;
UPDATE Custom SET accept_marketing = false,email = "dddfaef@efaefa", age = 22 where id = 1;

SELECT * FROM Custom;
DELETE FROM Custom WHERE id < 4; --
DELETE FROM Custom WHERE name = "DFEGDF" AND id <4;



SELECT id, name FROM Custom;
SELECT name AS 'Full Name' FROM Custom;

SELECT C.name AS 'Full Name' FROM Custom AS C; -- 테이블에 별칭 사용

SELECT DISTINCT name FROM Custom;


