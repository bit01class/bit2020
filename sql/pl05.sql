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
	dbms_output.put_line('�׸� �δ°� ...');
elsif v_sal<3000 then
	dbms_output.put_line('�׳� ��Ƽ��...');
else 
	dbms_output.put_line('�ξ��йи�...');
end if;
end;
/