-- create table ex18(
-- 	num number,
-- 	name varchar2(15),
-- 	primary key(num)
-- );
drop table ex18;
create table ex18(
	num number,
	name varchar2(15)
);
alter table ex18 modify (name varchar2(15) not null);
-- alter table ex18 modify (num number primary key);
alter table ex18 add primary key(num);








