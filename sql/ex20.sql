drop table ex20;
drop table ex21;
create table ex21(
	num number primary key,
	job varchar2(15) not null
);
-- create table ex20(
-- 	sabun number primary key,
-- 	name varchar2(15) not null,
-- 	num number constraint ex20_num_fk references ex21(num)
-- );
-- create table ex20(
-- 	sabun number primary key,
-- 	name varchar2(15) not null,
-- 	num number,
-- 	constraint ex20_num_fk 
-- 	foreign key(num) references ex21(num)
-- );
create table ex20(
	sabun number primary key,
	name varchar2(15) not null,
	num number
);
alter table ex20 
	add constraint ex20_num_fk 
	foreign key(num) references ex21(num);






