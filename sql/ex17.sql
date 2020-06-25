-- not null : null허용안함
-- unique : 중복허용안함. 단, null은 허용
--
-- create table ex17 (
-- 	num number unique not null, 
-- 	name varchar2(15) not null
-- );
drop table ex17;
--
-- primary key:unique and not null
-- 단, oracle경우: 한테이블당 하나만 부여가능
--
create table ex17(
	num number primary key,
	name varchar2(15) not null
);




