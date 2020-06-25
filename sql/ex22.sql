drop table ex22;
create table ex22(
	sabun number primary key,
	name varchar2(15) not null,
	gender char(1) check(gender in('M','F')),
	age number(3) check(age between 1 and 120)
);