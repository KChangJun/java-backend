# 기차 예약 데이터베이스 생성 
CREATE DATABASE train_reservation;
DROP DATABASE train_reservation;
CREATE DATABASE train_reservation;
USE train_reservation;

# 가격 테이블 생성
CREATE TABLE Cost(
	departure_station varchar(50) NOT NULL, 
    arrival_station varchar(50) NOT NULL,
    amount INT NOT NULL
 );

CREATE TABLE Train(
	train_number VARCHAR(10) PRIMARY KEY,
    departure_station VARCHAR(10) NOT NULL,
    departure_time TIME NOT NULL,
    arrival_station VARCHAR(10) NOT NULL,
    arrival_time TIME NOT NULL,
    take_minute TIME NOT NULL,
    type VARCHAR(10)
    
);

CREATE TABLE Station(
	station_number INT AUTO_INCREMENT PRIMARY KEY,
    station_name VARCHAR(50) NOT NULL,
    address TEXT NOT NULL,
    tel_number VARCHAR(15) NOT NULL UNIQUE 
);

CREATE TABLE Stop_Station(
	station_number INT NOT NULL,
    train_number VARCHAR(10) NOT NULL,
    departure_time TIME NOT NULL,
    arrival_time TIME NOT NULL
);
	
CREATE TABLE Seat(
	seat_code VARCHAR(5) PRIMARY KEY,
	type VARCHAR(10) NOT NULL,
    seat_number VARCHAR(2) NOT NULL,
    train_type VARCHAR(10) NOT NULL
);

show tables;



DROP TABLE Cost;
DROP TABLE Train;

-- DML(데이터 조작어)
# 데이터베이스 테이블에 레코드를 삽입, 수정, 삭제 , 검색 작업을 수행시키고자 할때
# 사용하는 SQL문
# 
-- 삽입문 (INSERT INTO) alter
-- 헤당 테이블에 레코드(행)를 삽입 할 때 사용하는 sql 구문
-- INSERT INTO 테이블명(필드명1, 필드명2, ....)
-- VALUES(필드명1 데이터, 필드명2 데이터, 필드3 데이터 .....);

-- 모든 필드에 값을 넣을때:
-- INSERT INTO 테이블명 <- 필드명을 지정하지 않았기 때문에 밑에 넣는 데이터의 순서가 중요함 
-- VALUES(데이터1, 데이터2,데이터3.....); <- 필드 순서대로 데이터가 들어감. 


-- 수정문 (UPDATE)
-- 해당 테이블에서 특정 필드의 값을 수정하고자 할 때
-- 사용하는 SQL 문

-- UPDATE 테이블명 SET 필드명1 = 데이터1, 필드명2 =  데이터2, ....;

-- 삭제문 (DELETE) 데이터 레코드만 삭제함~
-- 해당 테이블에서 레코드를 삭제할 때 사용하는 SQL문
-- DELETE FROM 테이블명 (WHERE 조건);
-- DELETE FROM 테이블명;


-- 검색문(SELECT)
-- 해당 테이블에서 특정 필드를 검색하고자 할 때 사용하는 SQL문

-- SELECT 필드명1, 필드명 2, ... FROM 테이블명;


-- 필드에 별칭 사용
-- 

