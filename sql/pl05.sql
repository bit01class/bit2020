declare
v_empno emp.empno%type;
v_sal emp.sal%type;
v_avg number;
begin
v_empno :=7369;
select avg(sal) into v_avg from emp;
select sal into v_sal from emp 
		where empno=v_empno;
dbms_output.put_line(sql%rowcount);
if v_sal<v_avg then
	dbms_output.put_line('그만 두는게 ...');
elsif v_sal<3000 then
	dbms_output.put_line('그냥 버티자...');
else 
	dbms_output.put_line('로얄패밀리...');
end if;
end;
/